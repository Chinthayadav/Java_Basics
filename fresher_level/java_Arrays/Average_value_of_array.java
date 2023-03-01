package com.fresher_level.java_Arrays;

// Write a function to calculate the average value of an array of integers
public class Average_value_of_array {

	public static void main(String[] args) {

//array initialiazation in single line
		int[] a = { 10, 20, 30, 40, 50 };
		// getting array length
		int length = a.length;
		// initialized sum with zero
		int sum = 0;
		// sum of all values in array by using loop

		/*
		 * for (int i=0;i<=a.length;i++) { sum+=a[i]; }
		 */

		int i = 0;
		while (i < a.length) {
			sum += a[i];
			i++;
		}
		System.out.println(sum);
		double avg = sum / a.length;
		System.out.println("The avg of array is :" + avg);
	}

}
