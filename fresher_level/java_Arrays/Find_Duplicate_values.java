package com.fresher_level.java_Arrays;

// Write a function to find the duplicate values of an array
public class Find_Duplicate_values {

	public static void main(String[] args) {
		// array creation
		int[] a = new int[] { 1, 2, 9,93, 1, 82, 93, 5, 6, 7, 8 };
		System.out.println("The duplicate values in array:");
		// outer loop
		for (int i = 0; i < a.length; i++) {
			// inner loop
			for (int j = i + 1; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					System.out.println(a[j] + " ");
				}
			}
		}

	}

}
