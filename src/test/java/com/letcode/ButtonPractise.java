package com.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPractise {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();

		// GoToHome and navigate back to same page
		driver.findElement(By.xpath("//*[@id='home']")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		// Finding X and Y coordinates
		WebElement location = driver.findElement(By.id("position"));
		Point location2 = location.getLocation();
		System.out.println(location2);

		// Color of the button
		WebElement color = driver.findElement(By.xpath("//*[@id='color']"));
		String btncolor = color.getCssValue("background-color");
		System.out.println(btncolor);

		// Height and Width of button
		Rectangle rect = driver.findElement(By.xpath("//*[@id='property']")).getRect();
		Dimension dimension2 = rect.getDimension();
		System.out.println(dimension2.getHeight());
		System.out.println(dimension2.getWidth());
		
		//button is disabled
		boolean enabled = driver.findElement(By.xpath("//*[@id='isDisabled']")).isEnabled();
		System.out.println(enabled);
		
		//button hold
		Actions action=new Actions(driver);
		WebElement hold = driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
		action.clickAndHold(hold);
		
		driver.quit();
		
	}
	

}
