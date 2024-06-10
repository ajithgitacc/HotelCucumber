package org.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep {

	@When("User add guest details {string},{string},{string},{string} and {string}")
	public void user_add_guest_details_and(String selectSalutation, String firstName, String lastName, String mobileNo, String email) {
		TC1_LoginStep.pom.getBookHotelPage().addGuestDetails(selectSalutation, firstName, lastName, mobileNo, email);

	}
	@When("User add GST details {string},{string} and {string}")
	public void user_add_gst_details_and(String enterRegistrationNo, String enterCompanyName, String enterCompanyAddress) {
		TC1_LoginStep.pom.getBookHotelPage().addGstDetails(enterRegistrationNo, enterCompanyName, enterCompanyAddress);

	}

	@When("User click first next option")
	public void user_click_first_next_option() {
		TC1_LoginStep.pom.getBookHotelPage().clickFirstNext();
	}
	
	@When("User add special request {string}")
	public void user_add_special_request(String specialRequest) {
		TC1_LoginStep.pom.getBookHotelPage().addSpecialRequest(specialRequest);

	}
	
	@When("User click second next option")
	public void user_click_second_next_option() {
		TC1_LoginStep.pom.getBookHotelPage().clickSecondNext();
	}
	
	
	@When("User add payment details,proceed with cardtype {string}")
	public void user_add_payment_details_proceed_with_cardtype(String cardType, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> data = asMaps.get(0);
		String selectCard = data.get("selectCard");
		String cardNo = data.get("cardNo");
		String cardName = data.get("cardName");
		String month = data.get("month");
		String year = data.get("year");
		String cvv = data.get("cvv");
		TC1_LoginStep.pom.getBookHotelPage().addPaymentDetails(cardType, selectCard, cardNo, cardName, month, year, cvv);
		
	}
	@Then("User should verify after hotel booking the success message {string} and save the order id")
	public void user_should_verify_after_hotel_booking_the_success_message_and_save_the_order_id(String expbookingsuccessmsg) {
		String actbookingsuccessmsg = TC1_LoginStep.pom.getBookingConfirmationPage().bookingConfirmMessage();
		boolean contains = actbookingsuccessmsg.contains(expbookingsuccessmsg);
		Assert.assertTrue("verify booking success msg", contains);
		

	}
	@Then("User should verify the booked hotel name is same as the hotel name which was saved")
	public void user_should_verify_the_booked_hotel_name_is_same_as_the_hotel_name_which_was_saved() {
		TC1_LoginStep.pom.getBookingConfirmationPage().verifyBookedHotelName();
		

	}
	
	@When("User click the submit button without entering the payment details")
	public void user_click_the_submit_button_without_entering_the_payment_details() {
		TC1_LoginStep.pom.getBookHotelPage().clickWithoutEnterPaymentDetails();

	}
	@Then("User should verify after submit the error messages {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_verify_after_submit_the_error_messages_and(String expcardTypeErrorMessage, String expcardErrorMessage, String expcardNoErrorMessage, String expcardNameErrorMessage, String expcardMonthErrorMessage, String expcardCvvErrorMessage) {
		String actcardTypeErrorMessage = TC1_LoginStep.pom.getBookHotelPage().getCardTypeErrorMessage();
		Assert.assertEquals("verify card type error msg", expcardTypeErrorMessage, actcardTypeErrorMessage);
		
		String actcardErrorMessage = TC1_LoginStep.pom.getBookHotelPage().getCardErrorMessage();
		Assert.assertEquals("verify card error msg", expcardErrorMessage, actcardErrorMessage);
		
		String actcardNoErrorMessage = TC1_LoginStep.pom.getBookHotelPage().getCardNoErrorMessage();
		Assert.assertEquals("verify card no error msg", expcardNoErrorMessage, actcardNoErrorMessage);
		
		String actcardNameErrorMessage = TC1_LoginStep.pom.getBookHotelPage().getCardNameErrorMessage();
		Assert.assertEquals("verify card name error msg", expcardNameErrorMessage, actcardNameErrorMessage);
		
		String actcardMonthErrorMessage = TC1_LoginStep.pom.getBookHotelPage().getCardMonthErrorMessage();
		Assert.assertEquals("verify card month error msg", expcardMonthErrorMessage, actcardMonthErrorMessage);
		
		String actcardCvvErrorMessage = TC1_LoginStep.pom.getBookHotelPage().getCardCvvErrorMessage();
		Assert.assertEquals("verify card cvv error msg", expcardCvvErrorMessage, actcardCvvErrorMessage);
		
	}






}
