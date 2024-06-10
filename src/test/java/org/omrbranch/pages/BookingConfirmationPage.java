package org.omrbranch.pages;

import org.omrbranch.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class BookingConfirmationPage extends BaseClass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	public static String orderId;
	
	@FindBy(xpath="//h2[@class='couppon-code']")
	private WebElement txtorderid;
	
	@FindBy(xpath="//p[text()='Hotel ']")
	private WebElement txthotelname1;
	
	@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
	private WebElement txtmyaccount;
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement clkmyaccount;
	
	
	public String getOrderId() {
		String order = elementGetText(txtorderid);
		System.out.println(order); 
		String[] split = order.split(" ");
		orderId="";
		for (int i = 0; i < 1; i++) {
			orderId=orderId+split[i];
		}
		System.out.println(orderId);
		return orderId;
	}
	
	
	public String bookingConfirmMessage() {
		String msg = elementGetText(txtorderid);
		return msg;
		
	}
	
	public void verifyBookedHotelName() {
		String bookedHotelName = elementGetText(txthotelname1);
		boolean equals = bookedHotelName.contains(SelectHotelPage.hotelName);
		if (equals=true) {
			System.out.println("Hotel name saved and booked is same");
		} 
		else {
			System.out.println("not same");
		}
	}
	
	public void navigateIntoMyBookingPage() {
		elementClick(txtmyaccount);
		elementClick(clkmyaccount);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
