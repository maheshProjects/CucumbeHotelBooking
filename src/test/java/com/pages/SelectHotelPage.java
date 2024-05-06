package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public static String firstHotelNameText;
	public static String firstHotelPriceText;

	
	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement selectHotelText;

	@FindBy(xpath = "//div[@class='category-breadcrumb']//a[@id='room_type']")
	private WebElement roomtypeHeader;

	@FindBy(xpath = "//label[text()='Name Ascending']")
	private WebElement btnAscending;

	@FindBy(xpath = "//label[text()='Price High to low']")
	private WebElement btnPrice;

	@FindBy(xpath = "//div[@id='hotellist']//h5")
	private WebElement hotelNameText;

	@FindBy(xpath = "//div[@class='prize']//strong")
	private WebElement hotelPriceText;

	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement lnkContinue;

	public WebElement getSelectHotelText() {
		return selectHotelText;
	}

	public WebElement getBtnAscending() {
		return btnAscending;
	}

	public WebElement getBtnPrice() {
		return btnPrice;
	}

	public WebElement getFirstHotelNameText() {
		return hotelNameText;
	}

	public WebElement getFirstHotelPriceText() {
		return hotelPriceText;
	}

	public WebElement getLnkContinue() {
		return lnkContinue;
	}

	public WebElement getRoomtypeHeader() {
		return roomtypeHeader;
	}

	public WebElement getHotelNameText() {
		return hotelNameText;
	}

	public WebElement getHotelPriceText() {
		return hotelPriceText;
	}

	// 1.get success msg after search hotel
	public String getSearchSuccessMsg() {
		String text = getText(selectHotelText);
		return text;

	}

	// verify Roomtyoe Header msg
	public String getRoomTypeHeaderMsg() {
		String text = getText(roomtypeHeader);
		return text;

	}

	// 2.click the sort by ascending hotel name
	public void clickSortByAscen() {
		elementClick(btnAscending);

	}

	// 3.verify sorted hotel name in ascending
	public boolean verifyHotelNameAsc() {
		List<String> expLstHotelName = new ArrayList<>();
		List<String> actLstHotelName = new ArrayList<>();
		for (String element : actLstHotelName) {
			String text = getText(hotelNameText);
			expLstHotelName.add(text);
		}
		actLstHotelName.addAll(expLstHotelName);
		Collections.sort(actLstHotelName);
		boolean equals = expLstHotelName.equals(actLstHotelName);
		return equals;

	}

	// 4.click the sort by hotel price desc
	public void clickSortByPriceDesc() {
		elementClick(btnPrice);

	}

	// 5.verify sorted hotel price in desc
	public boolean verifyHotelPriceDesc() {
		List<String> expLstHotelName = new ArrayList<>();
		List<String> actLstHotelName = new ArrayList<>();
		for (String element : actLstHotelName) {
			String text = getText(hotelPriceText);
			expLstHotelName.add(text);
		}
		actLstHotelName.addAll(expLstHotelName);
		Collections.sort(actLstHotelName);
		boolean equals = expLstHotelName.equals(actLstHotelName);
		return equals;

	}

	// 6.save the first hotel name and price
	public void selectFirstHotel() {
		firstHotelNameText = getText(hotelNameText);
		firstHotelPriceText = getText(hotelPriceText);
		elementClick(lnkContinue);

	}

	// 7.accept alert message
	public void acceptHotelSelect() {
		switchToAlertAccept();

	}

	// 8.dismiss alert msg
	public void dismissHotelSelect() {
		switchToAlertDismiss();

	}

}
