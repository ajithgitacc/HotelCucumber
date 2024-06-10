package org.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.omrbranch.baseclass.BaseClass;
import org.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	public static PageObjectManager pom = new PageObjectManager();
	
	@Given("User is on the omr page")
	public void user_is_on_the_omr_page() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		urlEnter(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();
	}

	@When("User login {string} and {string}")
	public void user_login_and(String userName, String password) {
		pom.getLoginPage().login(userName, password);
		
	}
	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expLoginSuccessMsg) {
		String actLoginSuccessMsg = pom.getSearchHotelPage().getLoginSuccessMsgText();
		Assert.assertEquals("verify login success", expLoginSuccessMsg, actLoginSuccessMsg);
	
	}

	@When("User login {string} and {string} and press enter key")
	public void user_login_and_and_press_enter_key(String userName, String password) throws AWTException {
		pom.getLoginPage().loginEnterKey(userName, password);
	}

	@Then("User should verify after login error message {string}")
	public void user_should_verify_after_login_error_message(String expLoginErrorMsg) {
		String actloginErrorMsg = pom.getLoginPage().getLoginErrorMsg();
		boolean contains = actloginErrorMsg.contains(expLoginErrorMsg);
		Assert.assertTrue("verify login error message", contains);

	}







}
