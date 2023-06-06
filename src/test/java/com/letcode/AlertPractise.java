package com.letcode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractise {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		//Simple Alert
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//Dismiss the alert and print text
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Alert alert1=driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.dismiss();
		
		//Enter the name and accept alert
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Monica");
		alert2.accept();
		
		

		
	}

}
