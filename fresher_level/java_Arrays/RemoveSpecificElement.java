package com.fresher_level.java_Arrays;

// Write a function to remove a specific element from an array
public class RemoveSpecificElement {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// int toDelete = 100;
		int toDelete = 3;
		int count = 0;
		// printing elements before deletion
		System.out.println("The elements before delete specific element in array ");
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
		// logic of deletion of element
		for (int i = 0; i < a.length; i++) {
			if (toDelete == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				count = count + 1;
				break;
			}
		}
		// dispaly message
		if (count == 0) {
			System.out.println(toDelete + " is not present in existing array list ");
		} else {
			System.out.println(toDelete + " is element successfully deleted ");
		}
		System.out.println("The elements after deletion");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(a[i] + "  ");
		}

	}

}
