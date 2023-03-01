package com.fresher_level.java_Arrays;

// Write a program to find the common values between two arrays

public class Common_values {

	public static void main(String[] args) {
		// first array
		int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
		// second array
		int[] b = new int[] { 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println("The common elements in both arrays: ");
		// outer loop
		for (int i = 0; i < a.length; i++) {
			// inner loop
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					//System.out.println(b[j] + " ");
					System.out.println(a[i]);
				}

			}
		}
	}

}
