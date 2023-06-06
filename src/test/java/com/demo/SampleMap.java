package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleMap {

	public static void main(String[] args) {
		Map<Integer, Demo> m = new HashMap();
		Demo s1 = new Demo();
		s1.setId(12);
		s1.setMobile(9876543210l);
		s1.setName("Monica");
		s1.setSalary(76548.457f);

		Demo s2 = new Demo();
		s2.setId(14);
		s2.setMobile(9876673210l);
		s2.setName("subish");
		s2.setSalary(876548.457f);

		m.put(100, s1);
		m.put(200, s2);

		Set<Entry<Integer, Demo>> s = m.entrySet();
		for (Entry<Integer, Demo> e : s) {

			System.out.println(e.getKey());
			System.out.println(e.getValue().getId());
			System.out.println(e.getValue().getMobile());
			System.out.println(e.getValue().getSalary());
			System.out.println(e.getValue().getName());

		}

	}

}
