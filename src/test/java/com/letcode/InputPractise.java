package com.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputPractise {

	public static void main(String[] args) {
		// Browser Launch

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\monic\\Downloads\\chromedriver_win32 (1)");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();

		// Entering fullName
		WebElement fullName = driver.findElement(By.id("fullName"));
		fullName.sendKeys("Monica Subish");

		// Append and Tab key
		WebElement append = driver.findElement(By.xpath("//*[@id ='join']"));
		append.sendKeys("World");
		append.sendKeys(Keys.TAB);

		// read/print the text
		WebElement text = driver.findElement(By.id("getMe"));
		String text2 = text.getAttribute("value");
		System.out.println(text2);

		// Clear the Text
		driver.findElement(By.id("clearMe")).clear();

		// Confirm Edit field is enabled
		boolean enabledBox = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(enabledBox);

		// confirm Text is Readonly
		String readonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(readonly);
		driver.quit();
	}

}
