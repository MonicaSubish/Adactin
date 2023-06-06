package com.demo;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set s= new TreeSet();
		
		s.add(5);
		s.add(10);
		s.add(40);
		s.add(70);
		s.add(25);
		s.add(99);
		
		System.out.println(s);
		for (Object o : s) {
			System.out.println(o);
		}
	}

}
