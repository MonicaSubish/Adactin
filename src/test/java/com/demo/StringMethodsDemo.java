package com.demo;

public class StringMethodsDemo {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "JAVA";

		boolean b = s1.isEmpty();
		System.out.println(b);
		
		boolean c = s2.contains("v");
		System.out.println(c);
		
		int length = s1.length();
		System.out.println(length);
		
		boolean d = s2.startsWith("A");
		System.out.println(d);
		
		boolean e = s1.endsWith("a");
        System.out.println(e);
        
        String f = s1.toUpperCase();
        System.out.println(f);
        
        String g = s2.toLowerCase();
        System.out.println(g);
        
        int i = s1.lastIndexOf('v');
        System.out.println(i);
        
        boolean j = s1.equals(s2);
        System.out.println(j);
        
        boolean h = s2.endsWith(s1);
        System.out.println(h);
        
        String k = s1.replace('a', 'b');
        System.out.println(k);
        
        String l = s2.substring(0, 3);
        System.out.println(l);
	}

}
