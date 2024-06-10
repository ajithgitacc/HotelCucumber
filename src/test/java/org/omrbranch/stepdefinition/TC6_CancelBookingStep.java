package org.omrbranch.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_CancelBookingStep {

	@When("User cancel the new order id")
	public void user_cancel_the_new_order_id() {
		TC1_LoginStep.pom.getMyBookingPage().cancelOrderId();
	}
	
	@Then("User should verify the cancelled booking success message {string}")
	public void user_should_verify_the_cancelled_booking_success_message(String expcancelledBookingSuccessMessage) {
		String actcancelledBookingSuccessMessage = TC1_LoginStep.pom.getMyBookingPage().getCancelledBookingSuccessMessage();
		Assert.assertEquals("verify cancel msg", expcancelledBookingSuccessMessage, actcancelledBookingSuccessMessage);

	}


	@When("User cancel the existing order id")
	public void user_cancel_the_existing_order_id() {
		TC1_LoginStep.pom.getMyBookingPage().cancelOrderId();
	}



	
	@When("User cancel the first displayed order id")
	public void user_cancel_the_first_displayed_order_id() {
		TC1_LoginStep.pom.getMyBookingPage().cancelOrderId();

	}









}
