package com.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrteFileDemo {

	public static void main(String[] args) throws IOException {
		// To Write Values to Excel
		File f = new File("C:\\Users\\monic\\eclipse-workspace\\Maven\\TestData\\Sample.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("JavaWorld");
		Row r = s.createRow(3);
		Cell c = r.createCell(1);
		c.setCellValue("BesantOnline");
		FileOutputStream output = new FileOutputStream(f);
		w.write(output);
		System.out.println("Done");

	}

}
