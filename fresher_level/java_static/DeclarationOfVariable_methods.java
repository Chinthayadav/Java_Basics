package com.fresher_level.java_static;

/*Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
  methods and a main method.

  Print instance variables in static methods

  Print static variables in Instance methods
 all instance methods in static methods

 Print all the static, instance variables in main method
Call static methods and instance methods in main method*/
public class DeclarationOfVariable_methods {
	/*
	 * Every variable in java should be either instance or static or local. Every
	 * variable in java should be either primitive or reference
	 */
	int a = 10; // instance primitive variable
	int[] b = new int[4]; // instance reference variable
	static int c = 20; // static primitive variable
	static int[] a1 = new int[4]; // static reference variable

	// instance method
	public void getValue() {
		System.out.println(a);
		System.out.println(b.length);
		/* Printing static values in instance method */
		System.out.println(c);
		System.out.println(a1.length);
		/* Call instance methods in static methods */
		accessValue();
	}

	// static method
	public static void accessValue() {
		System.out.println(c);
		System.out.println(a1.length);

		/*
		 * printing instance variable in static method is not possible it gives error
		 * System.out.println(a); System.out.println(b.length); Call instance methods in
		 * static methods getValue();
		 */
	}

// main method
	public static void main(String[] args) {

		/* Print all the static, instance variables in main method */
		// object creation for class
		DeclarationOfVariable_methods var = new DeclarationOfVariable_methods();
		// accessing values from instance variable
		System.out.println(var.a);
		/* Call static methods and instance methods in main method */
		var.getValue();
		var.accessValue();
		System.out.println(c);
		System.out.println(DeclarationOfVariable_methods.c);
		System.out.println(var.c);

	}

}
