package com.demo;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> mm = new TreeMap<Integer, String>();

		mm.put(100, "Java");
		mm.put(200, "Selenium");
		mm.put(300, "SQL");
		mm.put(400, "DevOps");
		mm.put(500, "AWS");
		mm.put(600, "Linux");
		mm.put(200, "DevOps");

		System.out.println(mm);

		// To print only values
		Collection<String> val = mm.values();
		System.out.println(val);

		// To print only key
		Set<Integer> k = mm.keySet();
		System.out.println(k);

		// To iterate in Map
		// Entry set to eliminate duplicaes before iteration
		Set<Entry<Integer, String>> e = mm.entrySet();
		for (Entry<Integer, String> x : e) {
			System.out.println(x);
		}
	}

}
