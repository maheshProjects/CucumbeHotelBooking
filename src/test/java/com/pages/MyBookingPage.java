package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class MyBookingPage extends BaseClass {
	
	@FindBy(xpath = "//a[contains(text(),'Welcome Antony George')]")
	private WebElement btnWelcome;

	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement btnMyAcct;

	@FindBy(xpath = "(//div[@class='col-md-5'])[1]//h4")
	private WebElement bookingSuccessMsg;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchExOrderId;

	@FindBy(xpath = "(//div[@class='room-code'])[1]//span")
	private WebElement getOrderId;

	@FindBy(xpath = "(//a[contains(@href,'view-booking')])[1]//h5")
	private WebElement verifyExHotelName;

	@FindBy(xpath = "(//div[@class='my-booking  prize'])[1]//strong")
	private WebElement verifyExHotelPrice;

	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement btnEdit;

	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement btnCheckInDate;

	@FindBy(xpath = "//a[text()='30']")
	private WebElement btnDate;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement btnConfirm;

	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement changeBookingSuccessMsg;
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement lnkCancel;

	public WebElement getGetOrderId() {
		return getOrderId;
	}

	public WebElement getLnkCancel() {
		return lnkCancel;
	}

	public WebElement getBtnWelcome() {
		return btnWelcome;
	}

	public WebElement getBtnMyAcct() {
		return btnMyAcct;
	}

	public WebElement getBookingSuccessMsg() {
		return bookingSuccessMsg;
	}

	public WebElement getSearchExOrderId() {
		return searchExOrderId;
	}

	public WebElement getVerifyExHotelName() {
		return verifyExHotelName;
	}

	public WebElement getVerifyExHotelPrice() {
		return verifyExHotelPrice;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getBtnCheckInDate() {
		return btnCheckInDate;
	}

	public WebElement getBtnDate() {
		return btnDate;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getChangeBookingSuccessMsg() {
		return changeBookingSuccessMsg;
	}

	// 1.navigate to my booking page
	public void navigateMyBooking() {

		elementClick(btnWelcome);
		elementClick(btnMyAcct);

	}

	// 2.get the booking success Message
	public String getBookingsSuccessMsg() {
		String text = getText(bookingSuccessMsg);
		return text;
	}

	// 3.Search Order id
	public void searchOrderId(String exOrderId) {
		elementSendkeys(searchExOrderId, exOrderId);

	}

	// 4.get Order Id text
	public String getOrderIdText() {
		String text = getText(getOrderId);
		return text;

	}

	// 5.get hotel name
	public String getHotelName() {
		String text = getText(verifyExHotelName);
		return text;

	}

	// 6.get hotel price
	public String getHotelPrice() {
		String text = getText(verifyExHotelPrice);
		return text;

	}
	
	//7.modify checkIn date
	public void modifyCheckInDate() {
		elementClick(btnEdit);
		elementClick(btnCheckInDate);
		elementClick(btnDate);
		elementClick(btnConfirm);

	}
	
	//8.get Change Booking Success Message
	public String getChangeBookingSuccess() {
		String text = getText(bookingSuccessMsg);
		return text;

	}
	
	//9.modify first order id
	public void clickFirstOrderId() {
		elementClick(btnEdit);

	}
	
	//10.cancel order id
	public void cancelOrderId() {
		
		elementClick(lnkCancel);
		switchToAlertAccept();
	}
	
	//11.get the cancel Booking success Message
	public String getCancelBookingSuccess() {
		String text = getText(changeBookingSuccessMsg);
		return text;

	}
	
	//12.cancel first order id click
	public void clickFirstOrderCancel() {
		elementClick(lnkCancel);

	}

}
