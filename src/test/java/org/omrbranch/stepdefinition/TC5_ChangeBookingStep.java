package org.omrbranch.stepdefinition;

import org.junit.Assert;
import org.omrbranch.pages.BookingConfirmationPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep {

	@When("User navigate into My Bookings page")
	public void user_navigate_into_my_bookings_page() {
		TC1_LoginStep.pom.getBookingConfirmationPage().navigateIntoMyBookingPage();

	}
	@Then("User should verify after navigate to My Booking page success message as {string}")
	public void user_should_verify_after_navigate_to_my_booking_page_success_message_as(String expmyBookingPageSuccessMessage) {
		String actmyBookingPageSuccessMessage = TC1_LoginStep.pom.getMyBookingPage().getMyBookingPageSuccessMessage();
		boolean contains = actmyBookingPageSuccessMessage.contains(expmyBookingPageSuccessMessage);
		Assert.assertTrue("verify booking msg ", contains);
	}

	@When("User search the saved order id {string}")
	public void user_search_the_saved_order_id(String savedOrderId) {
		TC1_LoginStep.pom.getMyBookingPage().toSearchSavedOrderId(savedOrderId);
	}

	@Then("User should verify the order id")
	public void user_should_verify_the_order_id() {
		TC1_LoginStep.pom.getMyBookingPage().verifyOrderId();

	}
	@Then("User should verify the booked hotel name")
	public void user_should_verify_the_booked_hotel_name() {
		TC1_LoginStep.pom.getMyBookingPage().verifyHotelName();
		
	}
	@Then("User should verify the booked hotel price")
	public void user_should_verify_the_booked_hotel_price() {
		TC1_LoginStep.pom.getMyBookingPage().verifyHotelPrice();

	}
	@When("User modify the checkin date {string}")
	public void user_modify_the_checkin_date(String modifyCheckIn) {
		TC1_LoginStep.pom.getMyBookingPage().modifyCheckIn(modifyCheckIn);

	}
	@Then("User should verify after modify checkin date booking success message {string}")
	public void user_should_verify_after_modify_checkin_date_booking_success_message(String expcheckInBookingSuccessMsg) {
		String actcheckInBookingSuccessMsg = TC1_LoginStep.pom.getMyBookingPage().checkInBookingSuccessMsg();
		Assert.assertEquals("verify modify checkin success msg", expcheckInBookingSuccessMsg, actcheckInBookingSuccessMsg);
	}
	
	@When("User search the existing order id {string}")
	public void user_search_the_existing_order_id(String existingOrderId) {
		TC1_LoginStep.pom.getMyBookingPage().toSearchExistingOrderId(existingOrderId);

	}
	
	@When("User modify the checkin date for first order id {string}")
	public void user_modify_the_checkin_date_for_first_order_id(String modifyCheckIn) {
		TC1_LoginStep.pom.getMyBookingPage().modifyCheckIn(modifyCheckIn);
	}









}
