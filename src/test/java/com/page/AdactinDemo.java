package com.page;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import com.base.Utility;

public class AdactinDemo extends Utility{

	public static void main(String[] args) throws IOException {
		
		browserLaunch("https://adactinhotelapp.com/");
		
		//Username , Password and Login
		AdLoginPage ad= new AdLoginPage();
		ad.getUser().sendKeys(stringData(1, 0));
		ad.getPassword().sendKeys(stringData(1, 1));
		ad.getLogin().click();
		
		//Search Hotel
		AdSearchPage ads = new AdSearchPage();
		Select loc =new Select(ads.getLocation());
		loc.selectByVisibleText(stringData(1,2));
		
		Select hot=new Select(ads.getHotel());
		hot.selectByValue(stringData(1, 3));
		
		Select rom=new Select(ads.getRoom());
		rom.selectByValue(stringData(1,4));
		
		Select romno=new Select(ads.getRoomNo());
		romno.selectByVisibleText(stringData(1,5));
		
		ads.getCheckInDate().sendKeys(stringData(1, 6));
		ads.getCheckOutDate().sendKeys(stringData(1, 7));
		
		Select adl=new Select(ads.getAdult());
		adl.selectByVisibleText(stringData(1, 8));
		
		Select chi=new Select(ads.getChild());
		chi.selectByVisibleText(stringData(1, 9));
		
		ads.getSearch().click();
		
		//Select Hotel
		
		AdSelect adse=new AdSelect();
		adse.getRadio().click();
		
		adse.getContinueBtn().click();
		
		//Booking Hotel
		
		AdBook adb=new AdBook();
		adb.getFname().sendKeys(stringData(1, 10));
		adb.getLname().sendKeys(stringData(1, 11));
		adb.getAddress().sendKeys(stringData(1,12));
		adb.getCard().sendKeys(stringData(1, 13));
		
		Select cardType=new Select(adb.getcType());
		cardType.selectByVisibleText(stringData(1, 14));
		
		Select mon=new Select(adb.getMonth());
		mon.selectByVisibleText(stringData(1, 15));
		
		Select yea= new Select(adb.getYear());
		yea.selectByVisibleText(numericData(1, 16));
		
		adb.getCvv().sendKeys(numericData(1, 17));
		
		adb.getBook().click();
		
		
		
		

	}

}
