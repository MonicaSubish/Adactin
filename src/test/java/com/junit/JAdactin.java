package com.junit;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import com.base.Utility;
import com.page.AdBook;
import com.page.AdLoginPage;
import com.page.AdSearchPage;
import com.page.AdSelect;

import junit.framework.Assert;

public class JAdactin extends Utility {

	@Test
	public void Adactin() throws IOException {
		browserLaunch("https://adactinhotelapp.com/index.php");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, inputData(1, 0));
		System.out.println("Validated login URL");

		// Sending Username ,Password and Validating
		AdLoginPage jadLogin = new AdLoginPage();
		jadLogin.getUser().sendKeys(stringData(1, 0));
		String username = jadLogin.getUser().getAttribute("value");
		Assert.assertEquals(username, stringData(1, 0));
		System.out.println("Username Validated");

		jadLogin.getPassword().sendKeys(stringData(1, 1));
		String password = jadLogin.getPassword().getAttribute("value");
		Assert.assertEquals(password, stringData(1, 1));
		System.out.println("Password Validated");
		jadLogin.getLogin().click();

		String currentUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl2, inputData(2, 0));
		System.out.println("Search Hotel URL validated");

		// passing data to book to search hotel

		AdSearchPage jadSearch = new AdSearchPage();
		Select jLoc = new Select(jadSearch.getLocation());
		jLoc.selectByVisibleText(stringData(2, 2));
		String location1 = jadSearch.getLocation().getAttribute("value");
		Assert.assertEquals(location1, stringData(2, 2));
		System.out.println("Location Validated");

		Select jHotel = new Select(jadSearch.getHotel());
		jHotel.selectByVisibleText(stringData(2, 3));
		String hotel1 = jadSearch.getHotel().getAttribute("value");
		Assert.assertEquals(hotel1, stringData(2, 3));
		System.out.println("Hotel Validated");

		Select jroom = new Select(jadSearch.getRoom());
		jroom.selectByVisibleText(stringData(2, 4));
		String room1 = jadSearch.getRoom().getAttribute("value");
		Assert.assertEquals(stringData(2, 4), room1);
		System.out.println("Room Validated");

		Select jroomNo = new Select(jadSearch.getRoomNo());
		jroomNo.selectByValue(numericData(2, 5));
		String roomNo1 = jadSearch.getRoomNo().getAttribute("value");
		Assert.assertEquals(numericData(2, 5), roomNo1);
		System.out.println("Room No Validated");

		jadSearch.getCheckInDate().clear();
		jadSearch.getCheckInDate().sendKeys(stringData(1, 6));
		String jdate = jadSearch.getCheckInDate().getAttribute("value");
		Assert.assertEquals(stringData(1, 6), jdate);
		System.out.println("Check in date validated");

		jadSearch.getCheckOutDate().clear();
		jadSearch.getCheckOutDate().sendKeys(stringData(1, 7));
		String jdate1 = jadSearch.getCheckOutDate().getAttribute("value");
		Assert.assertEquals(stringData(1, 7), jdate1);
		System.out.println("Checkout date is Validated");

		Select jadult = new Select(jadSearch.getAdult());
		jadult.selectByValue(numericData(2, 8));
		String jadult1 = jadSearch.getAdult().getAttribute("value");
		Assert.assertEquals(numericData(2, 8), jadult1);
		System.out.println("No of Adults validated");

		Select jchild = new Select(jadSearch.getChild());
		jchild.selectByValue(numericData(1, 9));
		String jchild1 = jadSearch.getChild().getAttribute("value");
		Assert.assertEquals(numericData(1, 9), jchild1);
		System.out.println("No of children validated");
		jadSearch.getSearch().click();

		// Selecting Hotel and continue
		AdSelect jadselect = new AdSelect();
		jadselect.getRadio().click();
		jadselect.getContinueBtn().click();

		// Booking hotel
		String currentUrl3 = driver.getCurrentUrl();
		Assert.assertEquals(inputData(3, 0), currentUrl3);
		System.out.println(" Hotel Booking URL is validated");

		AdBook jadbook = new AdBook();
		jadbook.getFname().sendKeys(stringData(1, 10));
		String firstname = jadbook.getFname().getAttribute("value");
		Assert.assertEquals(stringData(1, 10), firstname);
		System.out.println("First Name Validated");

		jadbook.getLname().sendKeys(stringData(1, 11));
		String lastname = jadbook.getLname().getAttribute("value");
		Assert.assertEquals(stringData(1, 11), lastname);
		System.out.println("Last name is validated");

		jadbook.getAddress().sendKeys(stringData(1, 12));
		String jaddress = jadbook.getAddress().getAttribute("value");
		Assert.assertEquals(stringData(1, 12), jaddress);
		System.out.println("Address validated");

		jadbook.getCard().sendKeys(stringData(1, 13));
		String jcard = jadbook.getCard().getAttribute("value");
		Assert.assertEquals(stringData(1, 13), jcard);
		System.out.println("Card Validated");

		Select jctype = new Select(jadbook.getcType());
		jctype.selectByVisibleText(stringData(2, 14));
		String jctype1 = jadbook.getcType().getAttribute("value");
		Assert.assertEquals(stringData(2, 14), jctype1);
		System.out.println("Card Type is validated");

		Select jmonth = new Select(jadbook.getMonth());
		jmonth.selectByValue(numericData(3, 15));
		String jmonth1 = jadbook.getMonth().getAttribute("value");
		Assert.assertEquals(numericData(3, 15), jmonth1);
		System.out.println("Card Expiry month validated");

		Select jyear = new Select(jadbook.getYear());
		jyear.selectByValue(numericData(1, 16));
		String jyear1 = jadbook.getYear().getAttribute("value");
		Assert.assertEquals(numericData(1, 16), jyear1);
		System.out.println("Card expiry year is validated");

		jadbook.getCvv().sendKeys(numericData(1, 17));
		String jcvv = jadbook.getCvv().getAttribute("value");
		Assert.assertEquals(numericData(1, 17), jcvv);
		System.out.println("CVV is validated");
		jadbook.getBook().click();

		// booking confirmation
		String currentUrl4 = driver.getCurrentUrl();
		Assert.assertEquals(inputData(4, 0), currentUrl4);
		System.out.println("Booking Confirmed");

		quit();
	}

}
