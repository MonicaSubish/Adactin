package com.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test(invocationCount = 2)
	private void tc1() {
		System.out.println("Test1");

	}

	@Test(priority = 3)
	private void tc2() {
		System.out.println("Test2");

	}

	@Test(priority = 1)
	private void tc3() {
		System.out.println("Test3");

	}

	@Test(priority = 2)
	private void tc4() {
		System.out.println("Test4");

	}

	@Test(enabled = false)
	private void tc5() {
		System.out.println("Test5");

	}

}
