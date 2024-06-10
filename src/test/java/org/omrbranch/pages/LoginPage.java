package org.omrbranch.pages;

import java.awt.AWTException;

import org.omrbranch.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="email")
		private WebElement txtusername ;
		
		@FindBy(id="pass")
	    private	WebElement txtpass;
		
		@FindBy(xpath="//button[text()='Login']")
		private WebElement clklogin;
		
		@FindBy(id="errorMessage")
		private WebElement txtErrorMsg;
		
		public void login(String email,String password) {
			elementSendKeys(txtusername, email);
			elementSendKeys(txtpass, password); 
			elementClick(clklogin);	
		}
		
		public void loginEnterKey(String email,String password) throws AWTException {
			elementSendKeys(txtusername, email);
			elementSendKeys(txtpass, password);
			enterKey();
		}
		
		public String getLoginErrorMsg() {
			String errorText = elementGetText(txtErrorMsg);
			return errorText;
		}
		
		
		
	
	

}
