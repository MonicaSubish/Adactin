package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("(//*[@class='login_input'])[1]"));
		userName.sendKeys("Monica84");
		WebElement password = driver.findElement(By.xpath("(//*[@class='login_input'])[2]"));
		password.sendKeys("monica1234");
		driver.findElement(By.className("login_button")).click();

		WebElement location = driver.findElement(By.cssSelector("select[name='location']"));
		Select loc = new Select(location);
		loc.selectByVisibleText("Melbourne");

		WebElement hotels = driver.findElement(By.cssSelector("select#hotels"));
		Select hot = new Select(hotels);
		hot.selectByIndex(4);

		WebElement roomType = driver.findElement(By.cssSelector("select#room_type"));
		Select type = new Select(roomType);
		type.selectByValue("Deluxe");

		WebElement roomNo = driver.findElement(By.cssSelector("select[name='room_nos']"));
		Select no = new Select(roomNo);
		no.selectByVisibleText("3 - Three");

		WebElement checkInDate = driver.findElement(By.cssSelector("input#datepick_in"));
		checkInDate.clear();
		checkInDate.sendKeys("31/03/2023");

		WebElement checkOutDate = driver.findElement(By.cssSelector("input#datepick_out"));
		checkOutDate.clear();
		checkOutDate.sendKeys("01/04/2023");

		WebElement adults = driver.findElement(By.cssSelector("select[id^='adult']"));
		Select adu = new Select(adults);
		adu.selectByValue("2");

		WebElement child = driver.findElement(By.cssSelector("select#child_room"));
		Select chd = new Select(child);
		chd.selectByVisibleText("1 - One");

		driver.findElement(By.cssSelector("input#Submit")).click();

		driver.findElement(By.cssSelector("input#radiobutton_0")).click();
		driver.findElement(By.cssSelector("input#continue")).click();

		WebElement fName = driver.findElement(By.cssSelector("input#first_name"));
		fName.sendKeys("Monica");

		WebElement lName = driver.findElement(By.cssSelector("input#last_name"));
		lName.sendKeys("Subish");

		WebElement address = driver.findElement(By.cssSelector("textarea.txtarea"));
		address.sendKeys("13, rajeswari nagar");

		WebElement card = driver.findElement(By.cssSelector("input#cc_num"));
		card.sendKeys("1234567890123456");
		
		WebElement cType = driver.findElement(By.cssSelector("select#cc_type"));
		Select cardtype= new Select(cType);
		cardtype.selectByIndex(2);
		
		WebElement expMonth = driver.findElement(By.cssSelector("select#cc_exp_month"));
		Select month =new Select(expMonth);
		month.selectByVisibleText("March");
		
		WebElement expYear = driver.findElement(By.cssSelector("select#cc_exp_year"));
		Select year=new Select(expYear);
		year.selectByVisibleText("2022");
		
		WebElement cvv = driver.findElement(By.cssSelector("input#cc_cvv"));
		cvv.sendKeys("123");
		
		driver.findElement(By.cssSelector("input#book_now")).click();
		
		
		

	}

}
