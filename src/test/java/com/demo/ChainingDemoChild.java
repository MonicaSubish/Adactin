package com.demo;

public class ChainingDemoChild extends ChainingDemo {

	public ChainingDemoChild() {
		super(13);
		System.out.println("child Default  constructor");
	}

	public static void main(String[] args) {
		ChainingDemoChild chd = new ChainingDemoChild();
	}

}
