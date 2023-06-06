package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");

		String year = "2023";
		String month = "Nov";
		String date = "10";

		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
		while (true) {
			WebElement title = driver.findElement(By.xpath("//*[@class='monthTitle']"));
			String monthYear = title.getText();

			String[] split = monthYear.split(" ");
			String mon = split[0];
			String yr = split[1];
 
			if (mon.equalsIgnoreCase(month) && yr.equals(year)) {
				break;
			} else {
				driver.findElement(By.xpath("//button[text()='>']")).click();

			}

		}
		List<WebElement> date1 = driver.findElements(By.xpath("//*[@class='rb-monthTable first last']//td"));
		for (WebElement w : date1) {
			String text = w.getText();
			if (text.equals(date)) {
				w.click();
				break;
			}

		}
	}

}
