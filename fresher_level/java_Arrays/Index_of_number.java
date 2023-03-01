package com.fresher_level.java_Arrays;

// Write a program to find the index of an array element
public class Index_of_number {

	public static void main(String[] args) {

		// array creation
		int[] a = { 1, 2, 3, 56, 77, 98, 90 };
		int element = 56;
		// intialize index value
		int index = -1;
		int i = 0;
		while (i < a.length) {
			if (a[i] == element) {
				index = i;
				break;
			}
			i++;
		}
		System.out.println("The index of " + element + " value is " + index);

	}

}
