package org.omrbranch.pages;

import java.util.List;

import org.omrbranch.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class MyBookingPage extends BaseClass {
	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='room-code']")
	private List<WebElement> txtallorderids;
	
	@FindBy(xpath="(//div[@class='col-md-5'])[1]")
	private WebElement txtbooking;
	
	@FindBy(xpath="//input[@class='form-control w-50 d-inline-block']")
	private WebElement txtsearchbox;
	
	@FindBy(xpath="(//div[@class='room-code'])[1]")
	private WebElement txtorderid1;
	
	@FindBy(xpath="(//div[@class='room-code'])[1]//following-sibling::h5")
	private WebElement txthotelname;
	
	@FindBy(xpath="(//strong[@class='total-prize'])[1]")
	private WebElement txthotelprice;
	
	@FindBy(xpath="(//button[@class='edit btn filter_btn'])[1]")
	private WebElement clkedit;
	
	@FindBy(xpath="//input[@class='form-control from hasDatepicker']")
	private WebElement clkcheckindate;
	
	@FindBy(xpath="//a[@class='ui-state-default ui-state-active']")
	private WebElement clkalterdate;
	
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement clkconfirm;
	
	@FindBy(xpath="//li[@class='alertMsg']")
	private WebElement txtbookingupdate;
	
	@FindBy(xpath="(//a[@class='cancle btn filter_btn'])[1]")
	private WebElement clkcancel;
	
	@FindBy(xpath="//li[@class='alertMsg']")
	private WebElement txtcancelupdate;
	

	public String getMyBookingPageSuccessMessage() {
		String booking = elementGetText(txtbooking);
		return booking;
	}
	
	public void toSearchSavedOrderId(String orderid) {
		String firstorderid = elementGetText(txtorderid1);
		elementSendKeys(txtsearchbox, firstorderid);
	}
	
	public void toSearchExistingOrderId(String existingid) {
		elementSendKeysJS(txtsearchbox, existingid);
	}
	
	
	public void verifyOrderId() {
		String actorderid = elementGetText(txtorderid1);
		boolean equals = actorderid.equals(BookingConfirmationPage.orderId);
		if (equals=true) {
			System.out.println("order id is same");
		} 
		else {
			System.out.println("order id is not same");
		}
	}
	
	 public void verifyHotelName() {
		 String acthotelname = elementGetText(txthotelname);
		 boolean equals = acthotelname.equals(SelectHotelPage.hotel);
		 if (equals=true) {
				System.out.println("hotel name is same");
			} 
			else {
				System.out.println("hote name is not same");
			}
	 }
	 
	 public void verifyHotelPrice() {
		 String acthotelprice = elementGetText(txthotelprice);
		 boolean equals = acthotelprice.equals(SelectHotelPage.hotelPrice);
		 if (equals=true) {
				System.out.println("price is same");
			} 
			else {
				System.out.println("price is not same");
			}
	 }
	
	 public void modifyCheckIn(String modifycheckIn) {
		 elementClick(clkedit);
		 elementSendKeysJS(clkcheckindate, modifycheckIn);
		 elementClick(clkconfirm);
	}
	
	 public String checkInBookingSuccessMsg() {
		 String checkin = elementGetText(txtbookingupdate);
		 return checkin;
	}
	 
	 public void cancelOrderId() {
		 elementClick(clkcancel);
		 alertOk();
	}
	
	 public String getCancelledBookingSuccessMessage() {
		 String cancel = elementGetText(txtcancelupdate);
		 return cancel;
	}
	 
	 
}
