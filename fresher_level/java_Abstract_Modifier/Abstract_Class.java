package com.fresher_level.java_Abstract_Modifier;

// Create an abstract class with abstract and non-abstract methods.
abstract class File {
	int number = 123;
	String name = "Chintha Chinnayya";

	public void getMethod1() {
		System.out.println(number);
		System.out.println(name);
	}

	public abstract void getMethod();
}

class Data extends File {
	/*
	 * Create a sub class for an abstract class. Create an object in the child class
	 * for the abstract class and access the non-abstract methods
	 */
	/*
	 * File f = new File(); // Cannot instantiate the type File f.getMethod1();
	 */
	/*
	 * Create an instance for the child class in child class and call abstract
	 * methods 4. Create an instance for the child class in child class and call
	 * non-abstract method
	 */

	// creating new instance Class Child class

	public void getMethod() {
		System.out.println(number);
		System.out.println(name);
	}
}

public class Abstract_Class {

	public static void main(String[] args) {
		Data d = new Data();
		d.getMethod1(); // accessing values without abstract method
		d.getMethod(); // accesssing values with abstract method
	}

}
