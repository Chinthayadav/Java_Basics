package com.fresher_level.java_Arrays;

public class NumberOf_Even_Odd {

	public static void numberOfEvenOdd(int[] myArray) {

		int even_count = 0, odd_count = 0;

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 == 0) {
				even_count++;
			}
		}

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 != 0) {
				odd_count++;
			}

		}
		System.out.println();
		System.out.println("Even count in array :" + even_count);
		System.out.println("Odd count in array :" + odd_count);
	}

	public static void main(String[] args) {

		int[] myArray = { 23, 93, 56, 92, 39 };
		numberOfEvenOdd(myArray);

	}

}
