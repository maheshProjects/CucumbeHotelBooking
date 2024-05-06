package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class BookingConfirmPage extends BaseClass {
	
	public static String orderId;
	

	@FindBy(xpath="//h2[@name='booking-code']//strong")
	private WebElement bookingId;
	
	@FindBy(xpath="//h2[text()=' Booking is Confirmed ']")
	private WebElement bookingConfirmationText;
	
	@FindBy(xpath="//div[@class='seccess-box text-center']//p")
	private WebElement sameHotelOrNotText;
	
	public WebElement getBookingId() {
		return bookingId;
	}

	public WebElement getBookingConfirmationText() {
		return bookingConfirmationText;
	}

	public WebElement getSameHotelOrNotText() {
		return sameHotelOrNotText;
	}
	
	//1.get the order id and store
	public String getOrderId() {
		
		orderId = getText(bookingId);
		return orderId;

	}
	
	//2. get booking success Message
	public String getBookingSuccessMsg() {
		String text = getText(bookingConfirmationText);
		return text;

	}
	
	//3.get the hotel name string
	public String getHotelName() {
		String text = getText(sameHotelOrNotText);
		return text;

	}
}
