package org.omrbranch.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep {

	@When("User saves the first hotelname and price")
	public void user_saves_the_first_hotelname_and_price() {
		TC1_LoginStep.pom.getSelectHotelPage().getFirstHotelName();
		TC1_LoginStep.pom.getSelectHotelPage().getFirstHotelPrice();

	}
	@When("User select the first hotel")
	public void user_select_the_first_hotel() {
		TC1_LoginStep.pom.getSelectHotelPage().selectFirstHotel();

	}
	@When("User accept the alert")
	public void user_accept_the_alert() {
		TC1_LoginStep.pom.getSelectHotelPage().acceptAlert();
	}
	@Then("User should verify after select hotel the success message {string}")
	public void user_should_verify_after_select_hotel_the_success_message(String expbookHotelSuccessMessage) {
		String actbookHotelSuccessMessage = TC1_LoginStep.pom.getBookHotelPage().getBookHotelSuccessMessage();
		boolean contains = actbookHotelSuccessMessage.contains(expbookHotelSuccessMessage);
		Assert.assertTrue("verify book hotel msg", contains);
	}

	@Then("User cancel the alert")
	public void user_cancel_the_alert() {
		TC1_LoginStep.pom.getSelectHotelPage().DismissAlert();
	}
	@Then("User should verify after cancel the alert it is in the same page message {string}")
	public void user_should_verify_after_cancel_the_alert_it_is_in_the_same_page_message(String expselectHotelSuccessMsg) {
		String actselectHotelSuccessMsg = TC1_LoginStep.pom.getSelectHotelPage().getSelectHotelSuccessMsg();
		Assert.assertEquals("verify select hotel success msg", expselectHotelSuccessMsg, actselectHotelSuccessMsg);
		
	}





}
