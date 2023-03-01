package com.fresher_level.java_Basics;

// declare class with acess to all
public class Classname_declaration {
	// declaration of method and its signature
	public int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public static void main(String[] args) {
		// object creation for class name
		Classname_declaration cd = new Classname_declaration();
		int result = cd.add(12, 21);
		System.out.println(result);

	}
	//to order code in proper way then ctrl + shift + f
}
