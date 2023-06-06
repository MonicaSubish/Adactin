package com.guru;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Module1 {
	@Test
	public void browserLaunch()
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
