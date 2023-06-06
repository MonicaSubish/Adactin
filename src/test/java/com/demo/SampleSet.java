package com.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Demo> s = new HashSet();
		Demo s1= new Demo();
		s1.setId(12);
		s1.setMobile(9876543210l);
		s1.setName("Monica");
		s1.setSalary(76548.457f);
		
		Demo s2= new Demo();
		s2.setId(14);
		s2.setMobile(9876673210l);
		s2.setName("subish");
		s2.setSalary(876548.457f);
		
		s.add(s1);
		s.add(s2);
		
		for (Demo demo : s) {
			System.out.println(demo.getId());
			System.out.println(demo.getMobile());
			System.out.println(demo.getSalary());
			System.out.println(demo.getName());



		}

	}

}
