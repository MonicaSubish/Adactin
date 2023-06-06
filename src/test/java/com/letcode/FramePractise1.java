package com.letcode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePractise1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://letcode.in/frame");
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		int size = frame.size();
		System.out.println(size);
		
		driver.switchTo().frame("firstFr");
		WebElement firstName = driver.findElement(By.name("fname"));
		firstName.sendKeys("Monica");
		WebElement lastName = driver.findElement(By.name("lname"));
		lastName.sendKeys("Subish");
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(frame2);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("monica.subish");

	}

}
