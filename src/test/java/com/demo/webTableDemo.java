package com.demo;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();

		//To print size of the header
		List<WebElement> allHeader = driver.findElements(By.xpath("//*[@id='customers']//th"));
		int size = allHeader.size();
		System.out.println(size);

		// To print all Headers
		for (WebElement w : allHeader) {
			String text = w.getText();
			System.out.println(text);
		}
		
		//To check particular text is present
			List<WebElement> allData = driver.findElements(By.xpath("//*[@id='customers']//td"));
			for (WebElement x : allData) {
				String text2 = x.getText();
				// System.out.println(text2);

				if (text2.equalsIgnoreCase("selenium")) {
					System.out.println("Test is passed");
					break;
				}
			}

		}

	}

