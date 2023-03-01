package com.fresher_level.java_Loops;

import java.util.Scanner;

// Program to check whether a number is EVEN or ODD using switch
public class Swicth_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();

		switch (number%2) {
		case 0:
			System.out.println("This is even number");
		case 1:
			System.out.println("This is odd number ");
		}

	}

}
