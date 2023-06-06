package com.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleDemo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Current URL" + driver.getCurrentUrl());

		String firstWindowId = driver.getWindowHandle();

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','iphone 13')", searchBox);
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.xpath("(//img[@class='s-image'])[2]")).click();
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String allWindows : allWindowsId) {
			if (!allWindows.equals(firstWindowId)) {
				driver.switchTo().window(allWindows);
			}
		}
		driver.findElement(By.id("add-to-cart-button")).click();

	}

}
