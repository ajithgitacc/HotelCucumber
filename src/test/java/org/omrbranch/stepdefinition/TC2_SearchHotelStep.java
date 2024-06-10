package org.omrbranch.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {

	@When("User search hotels {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_and(String state, String city, String roomType, String checkIn, String checkOut, String noOfRooms, String noOfAdults, String noOfChildren) {
		TC1_LoginStep.pom.getSearchHotelPage().searchHotels(state, roomType, noOfRooms, noOfAdults, noOfChildren);
		
	}
	
	@Then("User should verify after search hotel the success message {string}")
	public void user_should_verify_after_search_hotel_the_success_message(String  expselectHotelSuccessMsg) {
		String actselectHotelSuccessMsg = TC1_LoginStep.pom.getSelectHotelPage().getSelectHotelSuccessMsg();
		Assert.assertEquals("verify select hotel msg", expselectHotelSuccessMsg, actselectHotelSuccessMsg);
	}

	@When("User search hotels {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_and(String state, String city, String checkIn, String checkOut, String noOfRooms, String noOfAdults) {
		TC1_LoginStep.pom.getSearchHotelPage().searchHotelMandatory(state, noOfRooms, noOfAdults);

	}
	
	@When("User click the search button")
	public void user_click_the_search_button() {
		TC1_LoginStep.pom.getSearchHotelPage().searchHotelWithoutEnterField();

	}
	
	@Then("User should verify after search hotel the error messages {string} ,{string} ,{string} ,{string} ,{string} and {string}")
	public void user_should_verify_after_search_hotel_the_error_messages_and(String expstateError, String expcityError, String expcheckinError, String expcheckoutError, String exproomError, String expadultError) {
		String actstateErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getStateErrorMsg();
		Assert.assertEquals("verify state error msg", expstateError, actstateErrorMsg);
		
		String actcityErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getCityErrorMsg();
		Assert.assertEquals("verify city error msg", expcityError, actcityErrorMsg);
		
		String actcheckInErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getCheckInErrorMsg();
		Assert.assertEquals("verify checkin error msg", expcheckinError, actcheckInErrorMsg);
		
		String actcheckOutErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getCheckOutErrorMsg();
		Assert.assertEquals("verify checkout error msg", expcheckoutError, actcheckOutErrorMsg);
		
		String actnoOfRoomErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getNoOfRoomErrorMsg();
		Assert.assertEquals("verify no of room error msg ", exproomError, actnoOfRoomErrorMsg);
		
		String actnoOfAdultErrorMsg = TC1_LoginStep.pom.getSearchHotelPage().getNoOfAdultErrorMsg();
		Assert.assertEquals("verify adult msg", expadultError, actnoOfAdultErrorMsg);
		
		
	}

	@Then("User should verify the searched hotel names ends with {string}")
	public void user_should_verify_the_searched_hotel_names_ends_with(String roomType) {
		TC1_LoginStep.pom.getSelectHotelPage().verifyHotelNameEndsWithRoomType();

	}
	
	@Then("User should verify the header contains {string}")
	public void user_should_verify_the_header_contains(String roomType) {
		String actHeader = TC1_LoginStep.pom.getSelectHotelPage().verifyHeader();
		Assert.assertEquals("verify header", roomType, actHeader);

	}
	
	@When("User click the price low to high option")
	public void user_click_the_price_low_to_high_option() {
		TC1_LoginStep.pom.getSelectHotelPage().clickPriceLowToHigh();

	}
	
	@Then("User should verify the hotel list is in the price range of low to high")
	public void user_should_verify_the_hotel_list_is_in_the_price_range_of_low_to_high() {
		TC1_LoginStep.pom.getSelectHotelPage().verifyHotelPriceLowToHigh();
	}

	@When("User click the price high to low option")
	public void user_click_the_price_high_to_low_option() {
		TC1_LoginStep.pom.getSelectHotelPage().clickPriceHighToLow();
	}
	
	@Then("User should verify the hotel list is in the price range of high to low")
	public void user_should_verify_the_hotel_list_is_in_the_price_range_of_high_to_low() {
		TC1_LoginStep.pom.getSelectHotelPage().verifyHotelPriceHighToLow();
	}
	
	@When("User click the name ascending option")
	public void user_click_the_name_ascending_option() {
		TC1_LoginStep.pom.getSelectHotelPage().clickAscendingName();
	}
	
	@Then("User should verify the hotel list is in the ascending order")
	public void user_should_verify_the_hotel_list_is_in_the_ascending_order() {
		TC1_LoginStep.pom.getSelectHotelPage().verifyHotelNameInAscendingOrder();
	}

	@When("User click the name descending option")
	public void user_click_the_name_descending_option() {
		TC1_LoginStep.pom.getSelectHotelPage().clickDescendingName();
	}
	@Then("User should verify the hotel list is in the descending order")
	public void user_should_verify_the_hotel_list_is_in_the_descending_order() {
		TC1_LoginStep.pom.getSelectHotelPage().verifyHotelNameInDescendingOrder();
	}























}
