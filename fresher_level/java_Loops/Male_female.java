package com.fresher_level.java_Loops;

import java.util.Scanner;

// Print gender (Male/Female) program according to given M/F using switch
public class Male_female {

	public static void main(String[] args) {

		Scanner SN = new Scanner(System.in);
		char gender;

		System.out.printf("Enter gender (M/m or F/f): ");
		gender = SN.next().charAt(0);

		switch (gender) {
		case 'M':
		case 'm':
			System.out.printf("Male.");
			break;

		case 'F':
		case 'f':
			System.out.printf("Female.");
			break;

		default:
			System.out.printf("Unspecified Gender.");
		}
		// System.out.printf("\n");

	}

}
