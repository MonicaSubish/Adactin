package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List li = new ArrayList();
		li.add(10);
		li.add('A');
		li.add("Minnesota");
		li.add(99.9);
		li.add(10);
		System.out.println(li);

		// to know the index
		int i = li.indexOf(99.9);
		System.out.println(i);

		int l = li.lastIndexOf(10);
		System.out.println(l);

		// To fetch particular value
		Object o = li.get(3);
		System.out.println(o);

		// To add value inbetween
		li.add(3, 20);
		System.out.println(li);

		// To remove any value
		li.remove(4);
		System.out.println("After removal " + li);

		// To replace any value
		li.set(3, "Texas");
		System.out.println(li);

		for (int j = 0; j < li.size(); j++) {
			System.out.println(li.get(j));

		}
		for (Object x : li) {
			System.out.println(x);
		}
	}

}
