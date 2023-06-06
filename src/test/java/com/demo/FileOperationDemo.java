package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperationDemo {

	public static void main(String[] args) throws IOException {
		// File Operation
		File f = new File("C:\\Users\\monic\\OneDrive\\Desktop\\FileOperation\\Java\\Sample.txt");
		File f1 = new File("C:\\Users\\monic\\OneDrive\\Desktop\\FileOperation\\Java\\demo.txt");

		//boolean m = f.mkdir();// To create Folder
		//boolean m = f.mkdirs();// to create Folder inside folder
		// f.isFile();// To check file is pResent
		//boolean m = f.createNewFile();// To create notepad
		// System.out.println(m);
		//FileUtils.write(f, "Hello World");// To write something to notepad
		//FileUtils.write(f,"Java Class ",false);//To replace something 
		//FileUtils.write(f,"Java Class ",true);//to add something
		//System.out.println("Done");
		FileUtils.copyFile(f, f1);
		List<String> read = FileUtils.readLines(f1);
		
		for (String string : read) {
			System.out.println(string);
		}
	}
	
	 

}
