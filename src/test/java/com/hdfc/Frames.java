package com.hdfc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Utility;

public class Frames extends Utility {
	public static void main(String[] args) {

		browserLaunch("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frame);
		WebElement userId = driver.findElement(By.xpath("//*[@type='text']"));
		userId.sendKeys("Hello World");
		List<WebElement> count = driver.findElements(By.tagName("frameset"));
		int size = count.size();
		System.out.println(size);
	}
}
