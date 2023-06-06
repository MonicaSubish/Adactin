package com.letcode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Utility;

public class DropDownDemo extends Utility {

	public static void main(String[] args) {
		browserLaunch("https://letcode.in/dropdowns");

		// Select by visible text and print
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select myFruits = new Select(fruits);
		myFruits.selectByVisibleText("Apple");

		// Multiple Select and print selected
		WebElement heroes = driver.findElement(By.id("superheros"));
		Select myheroes = new Select(heroes);
		myheroes.selectByIndex(0);
		myheroes.selectByIndex(4);
		myheroes.selectByIndex(7);
		List<WebElement> allSelectedOptions = myheroes.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		
		// Select Last option and print all options
		WebElement language = driver.findElement(By.id("lang"));
		Select lastlang = new Select(language);
		lastlang.selectByValue("sharp");
		List<WebElement> options = lastlang.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			
		//Select Specific option
			WebElement country = driver.findElement(By.id("country"));
			Select myCountry=new Select(country);
			myCountry.selectByValue("India");
			WebElement firstSelectedOption = myCountry.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
			
			driver.quit();
		}

	}

}
