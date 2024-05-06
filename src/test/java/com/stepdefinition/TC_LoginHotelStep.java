package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC_LoginHotelStep  extends BaseClass {
	

	PageObjectManager manager = new PageObjectManager();

		
	
	

	@Given("User is on the Omr branch hotel Login page")
	public void userIsOnTheOmrBranchHotelLoginPage() throws FileNotFoundException, IOException {
		
		browserLaunch(getPropertyFileValue("browser"));
		loadUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();
	    
	}
	@When("User login {string} and {string}")
	public void userLoginAnd(String userName, String password) {
		
		manager.getLoginPage().login(userName, password);
		manager.getLoginPage().clickLoginBtn();
	   
	}
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String afterLoginSuccessMsg) {
	   
		String actLoginSuccessMsg = manager.getExploreHotelPage().getLoginSuccessMsgText();
		Assert.assertEquals("Verify Success Msg after login",afterLoginSuccessMsg,actLoginSuccessMsg);
	}

	
	@When("User login {string} and {string}  with Enter key")
	public void userLoginAndWithEnterKey(String userName, String password) throws AWTException {
	   
		manager.getLoginPage().loginWithEnter(userName, password);
		
		
	}
	
	
	@Then("User should verify Error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String loginErrorMsg) {
		
		String actLoginErrorMsg = manager.getLoginPage().getLoginErrorText();
		boolean contains = actLoginErrorMsg.contains(loginErrorMsg);
		System.out.println(contains);
	    
	}









}
