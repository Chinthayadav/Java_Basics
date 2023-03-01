package com.fresher_level.java_Loops;

// Write a program to print largest number among three numbers.
// Program for multiple if else statement(Largest number in 10,20 and 30
public class Largest_number {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		if (a > b && a > c) {
			System.out.println(" this is largest number " + a);

		} else if (b > c && b > a) {
			System.out.println(" this is largest number " + b);
		} else {
			System.out.println(" this is largest number " + c);
		}
	}

}
// to order code in proper way then ctrl + shift + f