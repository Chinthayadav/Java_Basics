package com.fresher_level.java_Operators;

// Programs on Logical AND,OR operator and Logical NOT
public class Logical_op {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		// logical and
		if ((a < b) && (b < c)) {
			System.out.println(a);
			System.out.println("This is logical and operator");
		}
		// this a logical or
		if ((a > b) || (b < c)) {
			System.out.println(b);
			System.out.println("This is logical or operator");
		}
		if (a != b) {

			System.out.println("This values are not equal ");
			System.out.println("This is logical not operator ");
		}
	}

}
