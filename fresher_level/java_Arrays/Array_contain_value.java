package com.fresher_level.java_Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Write a function to test if array contains a specific value
public class Array_contain_value {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 33, 445, 66, 887, 223, 45 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element: ");
		int element = sc.nextInt();

		boolean found = Arrays.stream(arr).anyMatch(element1 -> element1 == element);
		if (found)
			System.out.println(element + " is found in existing array");
		else
			System.out.println(element + " is not found in existing array");
		/*
		 * boolean check = false; for (int i : arr) { if (i == element ) { check = true;
		 * break; } } if (check) System.out.println(element +
		 * " is found in existing array"); else System.out.println(element +
		 * " is not found in existing array");
		 */

	}
}