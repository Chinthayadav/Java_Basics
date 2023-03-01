package com.fresher_level.java_Loops;

// Write a program to find the prime or not.
public class Prime_number {

	public static void main(String[] args) {

		for (int num = 5; num <= 100; num++) {
			System.out.println(num);
			if (num % 2 == 1) {
				System.out.println("This is a prime number");
			} else {
				System.out.println("This is not a prime number ");
			}
		}
	}
}
//to order code in proper way then ctrl + shift + f
