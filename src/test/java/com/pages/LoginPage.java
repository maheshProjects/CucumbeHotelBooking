package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id = "emial")
	private WebElement txtUserName;

	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement btnLogin;

	@FindBy(xpath = "//b[contains(text(),'Invalid Login details')]")
	private WebElement errorMsgLogin;

	public WebElement getErrorMsgLogin() {
		return errorMsgLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	// 1.user login enter valid credentials
		public void login(String userName, String password) {

			elementSendkeys(txtUserName, userName);
			elementSendkeys(txtPassword, password);
			clickLoginBtn();

		}

		// 2.user login enter valid credentials with enter key
		public void loginWithEnter(String userName, String password) throws AWTException {
			elementSendkeys(txtUserName, userName);
			elementSendkeys(txtPassword, password);
			enterKey();
		}

		// 3.enter key using robot class
		public void enterKey() throws AWTException {
			keyBoardUsingRobot();

		}

		// 4.click login button
		public void clickLoginBtn() {
			elementClick(btnLogin);

		}

		// 5.get the login error text
		public String getLoginErrorText() {

			String text = getText(errorMsgLogin);
			return text;

		}
	
	
	
	
	
	
	
	




}
