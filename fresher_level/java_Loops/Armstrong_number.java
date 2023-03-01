package com.fresher_level.java_Loops;

import java.util.Scanner;

// Write a program to find Armstrong number or not
public class Armstrong_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int remainder, temp, result;
		temp = number;
		result = 0;
		while (temp != 0) {
			remainder = temp % 10;
			result += Math.pow(remainder, 3);
			temp /= 10;

		}
		if (result == number) {
			System.out.println("This is armstrong number");
		} else {
			System.out.println("This is not a armstrong number");
		}

	}

}
//to order code in proper way then ctrl + shift + f