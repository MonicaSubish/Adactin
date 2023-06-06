package com.exception;

public class ArithmeticException {

	public static void main(String[] args) {

		System.out.println(2);
		System.out.println(3);
		System.out.println(4);

		try {
			System.out.println(1 / 0);

		} catch (Exception e) {
			System.out.println("Arithmetic Exception Handeled");
		}  finally {
			System.out.println("Finally is optional");
		}

		System.out.println(5);
	}

}
