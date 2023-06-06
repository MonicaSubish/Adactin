package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before method ");
	}

	@Test
	public void tc1() {
		System.out.println("Test 1");
	}

	@After
	public void after() {
		System.out.println("After method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Test
	public void tc2() {
		System.out.println("Test 2");
	}

}
