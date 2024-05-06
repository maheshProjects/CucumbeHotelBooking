package com.omrbranch.stepdefinition;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC2_ExploreHotelStep extends BaseClass {
	
	PageObjectManager manager = new PageObjectManager();
	
	

	@Given("User is on the Omr branch hotel Login page")
	public void userIsOnTheOmrBranchHotelLoginPage() {
	  
	}
	@When("User login {string} and {string}")
	public void userLoginAnd(String string, String string2) {
	    
	}
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String string) {
	    
	}
	@When("User enter all fields {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userEnterAllFieldsAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    
	}
	@Then("User should verify success message after search hotel {string}")
	public void userShouldVerifySuccessMessageAfterSearchHotel(String string) {
	    
	}




}
