package org.omrbranch.pages;

import org.omrbranch.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class BookHotelPage extends BaseClass{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[@class='px-3 py-2']")
	private WebElement txtbookhotel;
	
	@FindBy(xpath="//a[@id='step1']")
	private WebElement down;
	
	@FindBy(xpath="//input[@id='own']")
	private WebElement clkmyself ;
	
	@FindBy(xpath="//select[@id='user_title']")
	private WebElement ddnsalutation;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='user_phone']")
	private WebElement txtmobile;
	
	@FindBy(xpath="//input[@id='user_email']")
	private WebElement txtemail;
	
	@FindBy(xpath="//input[@id='gst']")
	private WebElement clkgst;
	
	@FindBy(xpath="//input[@id='gst_registration']")
	private WebElement txtregno;
	
	@FindBy(xpath="//input[@id='company_name']")
	private WebElement txtcompanyname;
	
	@FindBy(xpath="//input[@id='company_address']")
	private WebElement txtaddress;
	
	@FindBy(xpath="(//button[text()='Next'])[1]")
	private WebElement clknext;
	
	@FindBy(xpath="//input[@id='late']")
	private WebElement clklate;
	
	@FindBy(xpath="//textarea[@id='other_request']")
	private WebElement txtrequest;
	
	@FindBy(xpath="//button[@id='step2next']")
	private WebElement clknext1;
	
	@FindBy(xpath="//div[@class='credit-card pm']")
	private WebElement clkpaymentoption;
	
	@FindBy(xpath="//h5[text()='Total Payment']")
	private WebElement down1;
	
	@FindBy(xpath="//select[@id='payment_type']")
	private WebElement ddncardtype;
	
	@FindBy(xpath="//select[@id='card_type']")
	private WebElement ddncard;
	
	@FindBy(xpath="//input[@id='card_no']")
	private WebElement txtcardno;
	
	@FindBy(xpath="//input[@id='card_name']")
	private WebElement txtcardname;
	
	@FindBy(xpath="//select[@id='card_month']")
	private WebElement ddnmonth;
	
	@FindBy(xpath="//select[@id='card_year']")
	private WebElement ddnyear;
	
	@FindBy(xpath ="//input[@id='cvv']" )
	private WebElement txtcvv;
	
	@FindBy(xpath="//button[@id='submitBtn']")
	private WebElement clksubmit;
	
	@FindBy(xpath="//div[@id='invalid-payment_type']")
	private WebElement txterrcartype;
	
	@FindBy(xpath="//div[@id='invalid-card_type']")
	private WebElement txterrcard;
	
	@FindBy(xpath="//div[@id='invalid-card_no']")
	private WebElement txterrcardno;
	
	@FindBy(xpath="//div[@id='invalid-card_name']")
	private WebElement txterrcardname;
	
	@FindBy(xpath="//div[@id='invalid-card_month']")
	private WebElement txterrcardmonth;
	
	@FindBy(xpath="//div[@id='invalid-cvv']")
	private WebElement txterrcvv;
	
	
	public String getBookHotelSuccessMessage() {
		String bookhoteltext = elementGetText(txtbookhotel);
		return bookhoteltext;
	}
	
	public void addGuestDetails(String selectSalutation,String firstName,String lastName,String mobileNo,String email) {
		implicitWait(300);
		elementClick(clkmyself);
		ddnSelectOptionByText(ddnsalutation, selectSalutation);
		elementSendKeys(txtfirstname, firstName);
		elementSendKeys(txtlastname, lastName);
		elementSendKeys(txtmobile, mobileNo);
		elementSendKeys(txtemail, email);
		
	}
	
	public void addGstDetails(String enterRegistrationNo,String enterCompanyName,String enterCompanyAddress) {
		elementClick(clkgst);
		elementSendKeys(txtregno, enterRegistrationNo);
		elementSendKeys(txtcompanyname, enterCompanyName);
		elementSendKeys(txtaddress, enterCompanyAddress);
	}
	
	public void clickFirstNext() {
		elementClick(clknext);
	}
	
	public void addSpecialRequest(String specialRequest) {
		elementClick(clklate);
		elementSendKeys(txtrequest, specialRequest);
		
	}
	
	public void clickSecondNext() {
		elementClick(clknext1);
		
	}
	
	
	
	public void addPaymentDetails(String cardType,String selectCard,String cardNo,String cardName,String month,String year,String cvv) {
		elementClick(clkpaymentoption);
		ddnSelectOptionByText(ddncardtype, cardType);
		ddnSelectOptionByText(ddncard, selectCard);
		elementSendKeys(txtcardno, cardNo);
		elementSendKeys(txtcardname, cardName);
		ddnSelectOptionByText(ddnmonth, month);
		ddnSelectOptionByText(ddnyear, year);
		elementSendKeys(txtcvv, cvv);
		elementClick(clksubmit);
	}
	
	public void clickWithoutEnterPaymentDetails() {
		elementClick(clkpaymentoption);
		elementClick(clksubmit);
	}
	
	public String getCardTypeErrorMessage() {
		String errcardtype = elementGetText(txterrcartype);
		return errcardtype;
	}
	
	public String getCardErrorMessage() {
		String errcard = elementGetText(txterrcard);
		return errcard;
	}
	
	public String getCardNoErrorMessage() {
		String errcardno = elementGetText(txterrcardno);
		return errcardno;
	}
	
	public String getCardNameErrorMessage() {
		String errcardname = elementGetText(txterrcardname);
		return errcardname;
	}
	
	public String getCardMonthErrorMessage() {
		String errcardmonth = elementGetText(txterrcardmonth);
		return errcardmonth;
	}
	
	public String getCardCvvErrorMessage() {
		String errcardcvv = elementGetText(txterrcvv);
		return errcardcvv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
