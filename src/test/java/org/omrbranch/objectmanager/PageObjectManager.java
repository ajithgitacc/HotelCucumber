package org.omrbranch.objectmanager;

import org.omrbranch.pages.BookHotelPage;
import org.omrbranch.pages.BookingConfirmationPage;
import org.omrbranch.pages.LoginPage;
import org.omrbranch.pages.MyBookingPage;
import org.omrbranch.pages.SearchHotelPage;
import org.omrbranch.pages.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private MyBookingPage myBookingPage;
	
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage= new LoginPage():loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)?searchHotelPage= new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage= new SelectHotelPage():selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage= new BookHotelPage():bookHotelPage;
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage==null)?bookingConfirmationPage= new BookingConfirmationPage():bookingConfirmationPage;
	}
	public MyBookingPage getMyBookingPage() {
		return (myBookingPage==null)?myBookingPage= new MyBookingPage():myBookingPage;  
	}

}
