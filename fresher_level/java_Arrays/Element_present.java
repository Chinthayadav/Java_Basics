package com.fresher_level.java_Arrays;

// Write a method to verify if the array contains two specified elements(12,23)

public class Element_present {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 34, 21, 7, 8, 12, 23 };
		int a1 = 12, b = 23;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a1) {
				System.out.println(a1 + " is present in array");
			} else if (a[i] == b) {
				System.out.println(b + " is present in array");
			}
		}

	}

}
