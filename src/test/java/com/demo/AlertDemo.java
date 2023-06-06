package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.id("confirmButton"));
		btn.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		Thread.sleep(2000);
		WebElement promptBtn = driver.findElement(By.cssSelector("button#promtButton"));
		promptBtn.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Monica");
		alert2.accept();
		

	}

}
