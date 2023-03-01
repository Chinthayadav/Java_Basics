package com.fresher_level.java_Arrays;

// Write a function to add integer values of an array
public class Add_values_into_array {

	public static void main(String[] args) {

		// declaration of array
		int[] a;
		// array construction
		a = new int[3];
		int[] b = new int[5];
		// array initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		// classname@hexadecimalstringrepresentationofhashcode.
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		// declaration,creation and initialization variable at a single line
		int[] c = { 10, 20, 30 };
		// // classname@hexadecimalstringrepresentationofhashcode.
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);

	}

}
