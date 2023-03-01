package com.fresher_level.java_Arrays;

/*Write a function to insert an element at a specific position in the array
*/
public class InsertElementIntoArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 45, 6, 7, 90 };
		System.out.println("Before insert element into an array: \n");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
		int pos = 3;
		int toInsertElement = 100;
		for (int i = a.length - 1; i > pos - 1; i--) {
			a[i] = a[i - 1];
		}

		a[pos - 1] = toInsertElement;
		System.out.println();
		System.out.println("After insertion of element into an array:\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
