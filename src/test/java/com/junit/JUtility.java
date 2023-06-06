package com.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUtility {

	public static WebDriver driver;
	//public static Workbook w;

	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static String inputData(int row, int cell) throws IOException   {
		File f = new File("C:\\Users\\monic\\eclipse-workspace\\Maven\\TestData\\Facebook.xlsx");
		FileInputStream input = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("juni");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;

	}

}
