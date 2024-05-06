package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class ExploreHotelPage extends BaseClass{
	
	
	@FindBy(xpath = "//a[contains(text(),'Welcome')]")
	private WebElement getWelText;

	@FindBy(xpath = "//h5[text()='Explore Hotels']")
	private WebElement getExpText;

	@FindBy(id = "state")
	private WebElement slctState;

	@FindBy(id = "city")
	private WebElement slctCity;

	@FindBy(id = "room_type")
	private WebElement slctRoomType;

	@FindBy(name = "check_in")
	private WebElement checkInDate;

	@FindBy(xpath = "//a[text()='25']")
	private WebElement inDate;

	@FindBy(name = "check_out")
	private WebElement checkOutDate;

	@FindBy(xpath = "//a[text()='28']")
	private WebElement outDate;

	

	@FindBy(id = "no_rooms")
	private WebElement slctNoOfRoom;

	@FindBy(id = "no_adults")
	private WebElement slctNoOfAdults;

	@FindBy(id = "no_child")
	private WebElement noOfChild;

	@FindBy(id = "hotelsearch_iframe")
	private WebElement searchFrame;

	@FindBy(id = "searchBtn")
	private WebElement btnSearch;

	@FindBy(xpath = "//div[text()='Please select state']")
	private WebElement errorMsgState;

	@FindBy(xpath = "//div[text()='Please select city']")
	private WebElement errorMsgCity;

	@FindBy(xpath = "//div[text()='Please select Check-in date']")
	private WebElement errorMsgCheckInDate;

	@FindBy(xpath = "//div[text()='Please select Check-out date']")
	private WebElement errorMsgCheckOutDate;

	@FindBy(xpath = "//div[text()='Please select no. of adults']")
	private WebElement errorMsgRooms;

	@FindBy(xpath = "//div[text()='Please select no. of adults']")
	private WebElement errorMsgAdults;

	public WebElement getGetWelText() {
		return getWelText;
	}

	public WebElement getGetExpText() {
		return getExpText;
	}

	public WebElement getSlctState() {
		return slctState;
	}

	public WebElement getSlctCity() {
		return slctCity;
	}

	public WebElement getSlctRoomType() {
		return slctRoomType;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getSlctNoOfRoom() {
		return slctNoOfRoom;
	}

	public WebElement getSlctNoOfAdults() {
		return slctNoOfAdults;
	}

	public WebElement getNoOfChild() {
		return noOfChild;
	}

	public WebElement getSearchFrame() {
		return searchFrame;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getErrorMsgState() {
		return errorMsgState;
	}

	public WebElement getErrorMsgCity() {
		return errorMsgCity;
	}

	public WebElement getErrorMsgCheckInDate() {
		return errorMsgCheckInDate;
	}

	public WebElement getErrorMsgCheckOutDate() {
		return errorMsgCheckOutDate;
	}

	public WebElement getErrorMsgRooms() {
		return errorMsgRooms;
	}

	public WebElement getErrorMsgAdults() {
		return errorMsgAdults;
	}
	
	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	// 1.user get welcome message after login
		public String getLoginSuccessMsgText() {
			String text = getText(getWelText);
			return text;

		}

		// 2.Select room type single/multiple
		private void selectRoomType(String roomType) {
			String[] split = roomType.split("/");
			for (String text : split) {
				selectByVisibleText(slctRoomType, text);
			}

		}

		// 2.user enter all fields
		public void exploreHotels(String state, String city, String roomType, String needRooms, String countAdults,
				String countChild) {

			selectByVisibleText(slctState, state);
			selectByVisibleText(slctCity, city);
			selectRoomType(roomType);
			elementClick(checkInDate);
			elementClick(inDate);
			elementClick(checkOutDate);
			elementClick(outDate);
			selectByVisibleText(slctNoOfAdults, countAdults);
			elementSendkeys(noOfChild, countChild);

		}

		// 3.user enter mandatory fields only
		public void exploreHotels(String state, int city, String needRooms, int countAdults) {
			selectByVisibleText(slctState, state);
			selectByIndex(slctCity, city);
			elementClick(checkInDate);
			elementClick(inDate);
			elementClick(checkOutDate);
			elementClick(outDate);
			selectByIndex(slctNoOfAdults, countAdults);

		}

		// 4.clickSearchHotel
		public void clickSearch() {
			switchToFrame(searchFrame);
			elementClick(btnSearch);
		}

		// 5.State Error Message
		public String getStateErrorText() {
			String text = getText(errorMsgState);
			return text;

		}

		// 6.City Error message
		public String getCityErrorMsg() {
			String text = getText(errorMsgCity);
			return text;

		}

		// 7.CheckIn Date Error message
		public String getCheckInErrorMsg() {
			String text = getText(errorMsgCheckInDate);
			return text;

		}

		// 8.CheckOut Date error message
		public String getCheckOutErrorMsg() {
			String text = getText(errorMsgCheckOutDate);
			return text;

		}

		// 9.noOf Rooms error message
		public String getRoomsErrorMsg() {
			String text = getText(errorMsgRooms);
			return text;

		}

		// 10.No of adults Error message
		public String getAdultsErrorMsg() {

			String text = getText(errorMsgAdults);
			return text;

		}

}
