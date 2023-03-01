package com.fresher_level.java_Arrays;

// Write a function to copy an array to another array
public class Copyvalues {

	public static void main(String[] args) {

		// intialize first array and assign values
		int[] a = new int[] { 1, 12, 3, 445, 6, 7, 8, 4 };
		// initialize second array and copy values first array to second array
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("The elements of first array :");
		for (int k = 0; k < a.length; k++) {

			System.out.println(a[k]);
		}
		System.out.println("\n");
		System.out.println("The elements of first array copied to second array :");
		for (int j = 0; j < a.length; j++) {
			System.out.println(b[j]);
		}
	}

}
