package com.fresher_level.java_Arrays;

public class Difference_max_min {

	// method function
	public static void toFindMaxAndMinValue(int[] a) {
		// initialization values to max,min
		int max_value = a[0];
		int min_value = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max_value) {
				max_value = a[i];
			} else if (a[i] < min_value) {
				min_value = a[i];
			}
		}
		System.out.println("The maximum value is :" + max_value);
		System.out.println("The minimum value is :" + min_value);
		// difference between largest and smallest number
		int value = max_value - min_value;
		System.out.println("difference between largest and smallest number :" + value);
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// calling method function in main method
		toFindMaxAndMinValue(a);
	}

}
