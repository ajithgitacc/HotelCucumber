package org.omrbranch.pages;

import org.omrbranch.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//h3[text()='Hotel Booking']")
		private WebElement clkhotelbooking;
		
		@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
		private WebElement txtwelcome;
		
		@FindBy(xpath="//select[@id='state']")
		private WebElement ddnstate;
		
		@FindBy(xpath="//span[text()='Select City *']")
		private WebElement txtcity;
		
		@FindBy(xpath="//li[text()='Chennai']")
		private WebElement txtchennai;
		
		@FindBy(xpath="//textarea[@aria-label='Search']")
		private WebElement clkroomtype;
		
		@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable']")
		private WebElement roomtype1;
		
		@FindBy(xpath="//textarea[@aria-label='Search']")
		private WebElement clkroomtype1;
		
		@FindBy(xpath="//input[@class='form-control from hasDatepicker']")
		private WebElement clkcheckin;
		
		@FindBy(xpath="//a[text()='27']")
		private WebElement clkdate;
		
		@FindBy(xpath="//input[@class='form-control to hasDatepicker']")
		private WebElement clkcheckout;
		
		@FindBy(xpath="//a[text()='28']")
		private WebElement clkdate1;
		
		@FindBy(xpath="//select[@id='no_rooms']")
		private WebElement ddnnoofroom;
		
		@FindBy(xpath="//select[@id='no_adults']")
		private WebElement ddnnoofadults;
		
		@FindBy(xpath="//input[@id='no_child']")
		private WebElement txtnoofchild;
		
		@FindBy(xpath="//iframe[@src='https://omrbranch.com/hotelsearch-iframe']")
		private WebElement frame;
		
		@FindBy(xpath="//button[text()='Search']")
		private WebElement clksearch;
		
		@FindBy(xpath="//div[@id='invalid-state']")
		private WebElement txterrstate;
		
		@FindBy(xpath="//div[@id='invalid-city']")
		private WebElement txterrcity;
		
		@FindBy(xpath="//div[@id='invalid-check_in']")
		private WebElement txterrcheckin;
		
		@FindBy(xpath="//div[@id='invalid-check_out']")
		private WebElement txterrcheckout;
		
		@FindBy(xpath="//div[@id='invalid-no_rooms']")
		private WebElement txterrnoofroom;
		
		@FindBy(xpath="//div[@id='invalid-no_adults']")
		private WebElement txterrnoofadult;
		
		public String getLoginSuccessMsgText() {
			String text = elementGetText(txtwelcome);
			return text;	
		}
		
		public void searchHotels(String state,String roomType,String noOfRooms,String noOfAdults,String noOfChildren) {
			elementClick(clkhotelbooking);
			ddnSelectOptionByText(ddnstate, state);
			elementClick(txtcity);
			elementClick(txtchennai);
			selectRoomType(roomType);
			elementSendKeysJS(clkcheckin, "2024-05-27");
			elementSendKeysJS(clkcheckout, "2024-05-28");
			ddnSelectOptionByText(ddnnoofroom, noOfRooms);
			ddnSelectOptionByText(ddnnoofadults, noOfAdults);
			elementSendKeys(txtnoofchild, noOfChildren);
			switchToFrameByWebElement(frame);
			elementClick(clksearch);
			implicitWait(90);
		}
		
		public void selectRoomType(String roomType) {
			String[] split = roomType.split("/");
			for (String s : split) {
				elementClick(clkroomtype);
				elementClick(roomtype1);
				
			}
		
		}
		
		public void searchHotelMandatory(String state,String noOfRooms,String noOfAdults) {
			elementClick(clkhotelbooking);
			ddnSelectOptionByText(ddnstate, state);
			elementClick(txtcity);
			elementClick(txtchennai);
			elementClick(clkcheckin);
			elementClick(clkdate);
			elementClick(clkcheckout);
			elementClick(clkdate1);
			ddnSelectOptionByText(ddnnoofroom, noOfRooms);
			ddnSelectOptionByText(ddnnoofadults, noOfAdults);
			switchToFrameByWebElement(frame);
			elementClick(clksearch);
		}
		
		public void searchHotelWithoutEnterField() {
			elementClick(clkhotelbooking);
			switchToFrameByWebElement(frame);
			elementClick(clksearch);
			switchToDefaultContent();
		
		}
		
		public String getStateErrorMsg() {
			String errStateText = elementGetText(txterrstate);
			return errStateText;
			
		}
		
		public String getCityErrorMsg() {
			String errCityText = elementGetText(txterrcity);
			return errCityText;
		}
		
		public String getCheckInErrorMsg() {
			String errcheckin = elementGetText(txterrcheckin);
			return errcheckin;
		}
		
		public String getCheckOutErrorMsg() {
			String errcheckout = elementGetText(txterrcheckout);
			return errcheckout;
		}
		
		public String getNoOfRoomErrorMsg() {
			String errnoofroom = elementGetText(txterrnoofroom);
			return errnoofroom;
		}
		
		public String getNoOfAdultErrorMsg() {
			String errrnoofadult = elementGetText(txterrnoofadult);
			return errrnoofadult;
		}
		
		
		
	

}
