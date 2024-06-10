package org.omrbranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.omrbranch.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.sl.In;



public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	public static String hotel;
	public static String hotelName;
	public static String hotelPrice;
	
	
	@FindBy(xpath="//h5[text()='Select Hotel']")
	private WebElement txtselect;
	
	@FindBy(xpath="(//div[@class='col-md-5 hotel-suites']//h5)[1]")
	private WebElement txthotelname;
	
	@FindBy(xpath="(//strong[@class='total-prize'])[1]")
	private WebElement txthotelprice;
	
	@FindBy(xpath="(//a[@class='btn filter_btn'])[1]")
	private WebElement clkcontinue;
	
	@FindBy(xpath="//div[@class='col-md-5 hotel-suites']//h5")
	private List<WebElement> txtallselectedhotel;
	
	@FindBy(xpath="//label[text()='Price low to high']")
	private WebElement clklowtohigh;
	
	@FindBy(xpath="//label[text()='Price High to low']")
	private WebElement clkhightolow;
	
	@FindBy(xpath="//label[text()='Name Ascending']")
	private WebElement clkasc;
	
	@FindBy(xpath="//label[text()='Name Descending']")
	private WebElement clkdesc;
	 
	@FindBy(xpath="//strong[@class='total-prize']")
	private List<WebElement> txthotelpricelist;
	
	@FindBy(xpath="//a[@id='room_type']")
	private WebElement txtheader;
	
	public String getSelectHotelSuccessMsg() {
		implicitWait();
		String hotelText = elementGetText(txtselect);
		return hotelText;
		
	}
	
	public void verifyHotelNameEndsWithRoomType() {
		String roomtype="Deluxe";
		boolean b = false;
		List<Boolean> listres=new ArrayList<>();
		for (WebElement webElement : txtallselectedhotel) {
			String hotelnames = elementGetText(webElement);
			List<String> asList = Arrays.asList(hotelnames);
			for (String hotelname : asList) {
				b = hotelname.endsWith(roomtype);
			}	
		}
			listres.add(b);
			boolean contains = listres.contains(false);
			if (contains==false) {
				System.out.println("Hotel names ends with roomtype");
			}
			else
			{
				System.out.println("Hotel names not ended with roomtype");
			}
	}
	
	public String verifyHeader() {
		String header = elementGetText(txtheader);
		return header;
	}
	
	

	public void clickPriceLowToHigh() {
		elementClick(clklowtohigh);
	}
	
	public void verifyHotelPriceLowToHigh() {
		List<Integer> qa = new ArrayList<>();
		for (WebElement string : txthotelpricelist) {
			String text = string.getText();
			String substring = text.substring(2);
			String replace = substring.replace(",", "");
			int listint = Integer.parseInt(replace);
			qa.add(listint);
		}
		Collections.sort(qa);
		System.out.println("QA:" +qa);
		List<Integer> dev = new ArrayList<>();
		dev.addAll(qa);
		System.out.println("DEV:" +dev);
		boolean equals = qa.equals(dev);
		if (equals) {
			System.out.println("hotel price is in low to high");
		} else {
			System.out.println("hoel price is not correct");
		}
		
	}
	
	
	public void clickPriceHighToLow() {
		elementClick(clkhightolow);
	}
	
	public void verifyHotelPriceHighToLow() {
		List<Integer> qa = new ArrayList<>();
		for (WebElement string : txthotelpricelist) {
			String text = string.getText();
			String substring = text.substring(2);
			String replace = substring.replace(",", "");
			int listint = Integer.parseInt(replace);
			qa.add(listint);
		}
		Collections.sort(qa);
		Collections.reverse(qa);
		System.out.println("QA:" +qa);
		List<Integer> dev = new ArrayList<>();
		dev.addAll(qa);
		System.out.println("DEV:" +dev);
		boolean equals = qa.equals(dev);
		if (equals) {
			System.out.println("hotel price in high to low");
		} 
		else {
			System.out.println("hotel price is not correct");
		}
	}
	
	
	public void clickAscendingName() {
		elementClick(clkasc);
	}
	
	public void verifyHotelNameInAscendingOrder() {
		
		List<String> qa = new ArrayList<>();
		for (WebElement name : txtallselectedhotel) {
			String text = name.getText();
			qa.add(text);
		}
		Collections.sort(qa);
		System.out.println("QA:"+qa);
		List<String> dev = new ArrayList<>();
		dev.addAll(qa);
		System.out.println("DEV:"+dev);
		boolean equals = qa.equals(dev);
		if(equals) {
			System.out.println("hotel name is in ascending order");
		}else {
			System.out.println("not in ascending order");
		}
	}
	
	public void clickDescendingName() {
		elementClick(clkdesc);
	}
	
   public void verifyHotelNameInDescendingOrder() {
		
	   List<String> qa = new ArrayList<>();
		for (WebElement name : txtallselectedhotel) {
			String text = name.getText();
			qa.add(text);
		}
		Collections.sort(qa);
		Collections.reverse(qa);
		System.out.println("QA:"+qa);
		List<String> dev = new ArrayList<>();
		dev.addAll(qa);
		System.out.println("DEV:"+dev);
		boolean equals = qa.equals(dev);
		if(equals) {
			System.out.println("hotel name is in descending order");
		}else {
			System.out.println("not in descending order");
		}
	}
   
   public void getFirstHotelName() {
	   hotel = elementGetText(txthotelname);
	   String[] split = hotel.split(" ");
	   hotelName ="";
	   for (int i = 0; i < 2; i++) {
		   hotelName=hotelName+split[i]+" ";
	}
   }
   
   public void getFirstHotelPrice() {
	   hotelPrice = elementGetText(txthotelprice);
  }
   
   public void selectFirstHotel() {
	   elementClick(clkcontinue);
	  
  }
   
   public void acceptAlert() {
	   alertOk();
}
   
   public void DismissAlert() {
	   alertCancel();
   }
   
   
   
   
   
   
   
   
   
   
}
