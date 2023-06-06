package com.demo;

public class ChainingDemo {

	public ChainingDemo() {
		this("Monica");
		System.out.println("default Constructor");
	}
	public ChainingDemo(String name) {
		 this(123); 
		System.out.println("Name - "+name);
	}
	public ChainingDemo(int no) {
		System.out.println("No - "+no);
	}
	public static void main(String[] args) {
     ChainingDemo ch=new ChainingDemo();
	}

}
