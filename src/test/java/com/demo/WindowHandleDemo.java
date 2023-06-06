package com.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);

		WebElement firstOption = driver.findElement(By.id("newWindowBtn"));
		firstOption.click();
		driver.manage().window().maximize();

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);

		for (String allWindows : allWindowsId) {

			if (!allWindows.equals(parentWindowId)) {
				driver.switchTo().window(allWindows);

				driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Monica");
				//driver.close();

			}
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Back to ParentWindow");
	}

}
