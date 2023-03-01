package com.fresher_level.java_Operators;

// Write a method for increment and decrement operators(++, --)
public class Incr_dec {

	public static void main(String[] args) {

		int a = 10;
		System.out.println("The original value of a is "+a);
		// after increment a value is
		a++; // post increment
		System.out.println("post increment value of a is " + a);
		int b = 100;
		++b; // pre increment
		System.out.println("pre increment value of b is " + b);
		int c = 12;
		// decrement a value is
		c--; // post decrement
		System.out.println("post decrement value of a is " + c);
		--c; // pre decrement
		System.out.println("pre decrement value of a is " + c);

	}

}
//to order code in proper way then ctrl + shift + f
