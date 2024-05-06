package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class BookHotelPage extends BaseClass {
	
	@FindBy(xpath = "//div[@class='row']//h2")
	private WebElement bookHotelText;

	@FindBy(xpath = "//div[contains(@class,'hotel-suites')]//h5")
	private WebElement verifyHotelNameText;

	@FindBy(xpath = "//div[@class='prize']//h2")
	private WebElement verifyHotelPriceText;

	@FindBy(id = "own")
	private WebElement btnMyself;

	@FindBy(id = "user_title")
	private WebElement slctSalutation;

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "user_phone")
	private WebElement txtMobileNo;

	@FindBy(id = "user_email")
	private WebElement txtEmail;

	@FindBy(id = "gst")
	private WebElement btnGstOptional;

	@FindBy(id = "gst_registration")
	private WebElement txtGstNo;

	@FindBy(id = "company_name")
	private WebElement txtCompanyName;

	@FindBy(id = "company_address")
	private WebElement txtCompanyAdd;

	@FindBy(id = "step1next")
	private WebElement btnNext;

	@FindBy(id = "late")
	private WebElement btnLateCheckIn;

	@FindBy(id = "other_request")
	private WebElement txtOtherRequest;

	@FindBy(xpath = "//h5[text()='Credit/Debit/ATM Card']")
	private WebElement btnCardOption;

	@FindBy(id = "payment_type")
	private WebElement slctCardType;

	@FindBy(id = "card_type")
	private WebElement slctCard;

	@FindBy(id = "card_no")
	private WebElement txtCardNo;

	@FindBy(id = "card_name")
	private WebElement txtCardHolderName;

	@FindBy(id = "card_month")
	private WebElement slctMonth;

	@FindBy(id = "card_year")
	private WebElement slctCardYear;

	@FindBy(id = "cvv")
	private WebElement txtCvv;

	@FindBy(id = "submitBtn")
	private WebElement btnSubmit;

	@FindBy(xpath = "//div[text()='Please select your card type']")
	private WebElement cardTypeErrorMsg;

	@FindBy(xpath = "//div[text()='Please provide your card number']")
	private WebElement cardNoErrorMsg;

	@FindBy(xpath = "//div[text()='Please provide name on your card']")
	private WebElement cardHolderNameErrorMsg;

	@FindBy(xpath = "//div[text()='Please provide your Card Expiry Date']")
	private WebElement cardExpiryMonErrorMsg;

	@FindBy(xpath = "//div[@id='invalid-cvv']")
	private WebElement cardCvvErrorMsg;

	public WebElement getBookHotelText() {
		return bookHotelText;
	}

	public WebElement getVerifyHotelNameText() {
		return verifyHotelNameText;
	}

	public WebElement getVerifyHotelPriceText() {
		return verifyHotelPriceText;
	}

	public WebElement getBtnMyself() {
		return btnMyself;
	}

	public WebElement getSlctSalutation() {
		return slctSalutation;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getBtnGstOptional() {
		return btnGstOptional;
	}

	public WebElement getTxtGstNo() {
		return txtGstNo;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAdd() {
		return txtCompanyAdd;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getBtnLateCheckIn() {
		return btnLateCheckIn;
	}

	public WebElement getTxtOtherRequest() {
		return txtOtherRequest;
	}

	public WebElement getBtnCardOption() {
		return btnCardOption;
	}

	public WebElement getSlctCardType() {
		return slctCardType;
	}

	public WebElement getSlctCard() {
		return slctCard;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardHolderName() {
		return txtCardHolderName;
	}

	public WebElement getSlctMonth() {
		return slctMonth;
	}

	public WebElement getSlctCardYear() {
		return slctCardYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getCardHolderNameErrorMsg() {
		return cardHolderNameErrorMsg;
	}

	// 1.get book hotel success Message
	public String getBookHotelSuccessMsg() {
		String text = getText(bookHotelText);
		return text;

	}

	// get hotel name
	public String getHotelNameText() {
		String text = getText(verifyHotelNameText);
		return text;

	}

	// get hotel price
	public String getHotelPriceText() {
		String text = getText(verifyHotelPriceText);
		return text;

	}

	// 2.add the guest Details
	public void addGuestDetails(String salu, String firstName, String lastName, String mobileNo, String email) {
		elementClick(btnMyself);
		selectByVisibleText(slctSalutation, salu);
		elementSendkeys(txtFirstName, firstName);
		elementSendkeys(txtLastName, lastName);
		elementSendkeys(txtMobileNo, mobileNo);
		elementSendkeys(txtEmail, email);

	}

	// 3.add gst Details
	public void addGstDetails(String gstNo, String companyName, String companyAdd) {
		elementClick(btnGstOptional);
		elementSendkeys(txtGstNo, gstNo);
		elementSendkeys(txtCompanyName, companyName);
		elementSendkeys(txtCompanyAdd, companyAdd);

	}

	// 4.click next button
	public void clickNext() {
		elementClick(btnNext);

	}

	// 5.special request
	public void specialReq(String otherReq) {
		elementClick(btnLateCheckIn);
		elementSendkeys(txtOtherRequest, otherReq);

	}

	// 6.payment using data table
	public void payment(String cardType, String cardVariety, String cardNo, String cardHolderName, String expairyMonth,
			String expiryYear, String cvvNo) {
		elementClick(btnCardOption);
		selectByVisibleText(slctCardType, cardType);
		selectByVisibleText(slctCard, cardVariety);
		elementSendkeys(txtCardNo, cardNo);
		elementSendkeys(txtCardHolderName, cardHolderName);
		selectByVisibleText(slctMonth, expairyMonth);
		selectByVisibleText(slctCardYear, expiryYear);
		elementSendkeys(txtCvv, cvvNo);

	}

	// card type error Message
	public String getCardTypeErrorMsg() {
		String text = getText(cardTypeErrorMsg);
		return text;

	}

	// card Number error Message
	public String getCardNoErrorMsg() {
		String text = getText(cardNoErrorMsg);
		return text;

	}

	// card Holder name error Message
	public String getCardHolderNamErrorMsg() {
		String text = getText(cardHolderNameErrorMsg);
		return text;

	}

	// card expiry Month error Message
	public String getCardExpiryMonErrorMsg() {
		String text = getText(cardExpiryMonErrorMsg);
		return text;

	}

	// card Cvv error Message
	public String getCardCvvErrorMsg() {
		String text = getText(cardCvvErrorMsg);
		return text;

	}

	// 7.click submit button
	public void clickSubmit() {
		elementClick(btnSubmit);

	}

}
