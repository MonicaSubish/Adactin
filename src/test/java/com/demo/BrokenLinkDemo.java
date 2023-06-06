package com.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Utility;

public class BrokenLinkDemo extends Utility {

	@Test
	public void brokenLinkDemo() throws IOException {
		browserLaunch("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		// System.out.println(size);

		for (WebElement w : links) {
			String allLinks = w.getAttribute("href");
			// System.out.println(allLinks);

			// Create an instance for the URL
			URL url = new URL(allLinks);
			// Open connection to the server
			URLConnection urlConnection = url.openConnection();
			// To send request to the server
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			// To connect with the server
			httpURLConnection.connect();
			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(allLinks + "-" + httpURLConnection.getResponseMessage());
			} else {
				System.err.println(allLinks + "-" + httpURLConnection.getResponseMessage());
			}

		}

	}
}
