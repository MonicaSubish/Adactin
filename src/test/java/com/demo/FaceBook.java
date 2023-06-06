package com.demo;

import java.io.IOException;

import org.openqa.selenium.By;

import com.base.Utility;

public class FaceBook extends Utility {

	public static void main(String[] args) throws IOException {
		browserLaunch("https://www.facebook.com/");
		title();
		driver.findElement(By.id("email")).sendKeys(stringData(1, 0));
		driver.findElement(By.id("pass")).sendKeys(numericData(1, 1));
		quit();
	}

}
