package com.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Utility;

public class BrokenImageDemo extends Utility {
	@Test
	public void brokenImageDemo() throws IOException {
		browserLaunch("https://the-internet.herokuapp.com/broken_images");
		List<WebElement> image = driver.findElements(By.tagName("img"));
		for (WebElement w : image) {
			String allImages = w.getAttribute("src");

			// Create instance for the URL
			URL url = new URL(allImages);

			// Open Connection to the Server
			URLConnection urlConnection = url.openConnection();

			// to send request to the server
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

			// connect to the server
			httpURLConnection.connect();
			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(allImages + "-" + httpURLConnection.getResponseMessage());
			} else {
				System.err.println(allImages + "-" + httpURLConnection.getResponseCode() + "-"
						+ httpURLConnection.getResponseMessage());
			}
		}
	}
}
