package com.fresher_level.java_Loops;

import java.util.Scanner;

// Write a program to print even number between 10 and 100 using while
public class Print_even_numbers {

	public static void main(String[] args) {
		
		int number ,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter limit:");
		number=sc.nextInt();
		i=10;
		System.out.println("List of even numbers");
		while(i<=number) {
			System.out.println(i+" ");
			i=i+2;
			
		}
		
	}

}
//to order code in proper way then ctrl + shift + f
