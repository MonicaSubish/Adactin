package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateFileDemo {

	public static void main(String[] args) throws IOException {
		// Update File In Excel
		File f = new File("C:\\Users\\monic\\eclipse-workspace\\Maven\\TestData\\Sample.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("JavaWorld");
		Row r = s.getRow(3);
		Cell c = r.getCell(1);
		String s1 = c.getStringCellValue();
		if (s1.equals("BesantOnline")) {
			c.setCellValue("BesantOffline");

		}
		FileOutputStream output = new FileOutputStream(f);
		w.write(output);
		System.out.println("Done");

	}

}
