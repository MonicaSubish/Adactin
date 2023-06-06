package com.array;

public class Arraydemo {

	public static void main(String[] args) {
		int a[] = new int[7];
		a[0] = 14;
		a[1] = 15;
		a[2] = 16;
		a[3] = 17;
		a[4] = 18;
		a[5] = 19;
		a[6] = 20;
		// for loop using index
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("end");

		// enhanced for each loop using value
		for (int i : a) {
			System.out.println(i);
		}
        //finding length or size of the array
		int len = a.length;
		System.out.println("Array size is :" + len);
		System.out.println("Value of index 3 is  "+a[3]);

	}

}
