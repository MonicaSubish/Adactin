package com.demo;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Utility;

public class WebTableDemo2 extends Utility {

	@Test
	public void webTableCorrespondingName() throws InterruptedException {
		browserLaunch("https://letcode.in/table");
		driver.manage().window().maximize();
		List<WebElement> allRows = driver.findElements(By.xpath("//*[@id='simpletable']//tbody//tr"));
		int size = allRows.size();

		for (int i = 0; i < size; i++) {

			List<WebElement> rows = allRows.get(i).findElements(By.tagName("td"));
			WebElement lastName = rows.get(1);
			String text = lastName.getText();
			System.out.println(text);

			if (text.equals("Raj")) {
				Thread.sleep(5000);
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				break;
			}

		}

	}

}
