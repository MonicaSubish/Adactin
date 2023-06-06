package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class JavaScriptExecutorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		WebElement sdown = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		WebElement sup = driver.findElement(By.xpath("//a[@id='skiplink']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", sdown);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", sup);
	

	}

}
