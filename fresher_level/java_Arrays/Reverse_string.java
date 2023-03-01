package com.fresher_level.java_Arrays;

// Write a function to reverse an array of integer values
public class Reverse_string {

	public static void main(String[] args) {
//creation of array
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Before reverse array elements");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println();
		// set position zero
		int pos = 0;
		System.out.println("After reverse array elements");
		System.out.println();
		// printing array elements in reverse order
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");

		}

	}

}
