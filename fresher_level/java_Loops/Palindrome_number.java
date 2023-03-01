package com.fresher_level.java_Loops;

import java.util.Scanner;

//  Write a program to palindrome or not.
public class Palindrome_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number value:");
		int number= sc.nextInt();
		int remainder,temp,result;
		result=0;
		temp=number;
		while(temp>0) {
			remainder=temp%10;
			result=(result*10)+remainder;
			temp/=10;
		}
		if (result==number) {
			System.out.println("This is a palindrome number");
		}
		else {
			System.out.println("This is not a palindrome number");
		}
	}

}
