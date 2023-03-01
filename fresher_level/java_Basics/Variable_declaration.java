package com.fresher_level.java_Basics;

public class Variable_declaration {

// instance variable declaration inside class
	int a = 10;
	// static variable declaration
	static int i = 100;

	public static void main(String[] args) {

		// object creation for class
		Variable_declaration vd = new Variable_declaration();

		// accessing value from instance variable
		System.out.println(vd.a);
		// we cannot access instance variable without object reference
		// System.out.println(a);
		// accessing value from static variable
		System.out.println(vd.i);
		System.out.println(i);

	}
	// Through method we can access instance variables

	public void methodOne() {
		System.out.println(a);
	}

}
