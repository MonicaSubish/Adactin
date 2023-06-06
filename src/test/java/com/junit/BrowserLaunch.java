package com.junit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class BrowserLaunch {
	
	@Test
	public void test1()
	{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	
	
	
	String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	//To validate URL
	Assert.assertEquals(currentUrl, "https://www.facebook.com/");
	
	System.out.println("Done");
	

}
}