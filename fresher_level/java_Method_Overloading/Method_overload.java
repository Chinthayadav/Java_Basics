package com.fresher_level.java_Method_Overloading;

/*Write two methods with the same name but different number of parameters of same type 
and call the methods from main method*/

public class Method_overload {

	private static void display() {
		System.out.println("This is empty method");
	}

	private static void display(int a) {
		System.out.println("the value of a: " + a);
	}

	private static void display(int a, int b) {
		System.out.println("the value of a: " + a);
		System.out.println("the value of b: " + b);
	}

	public static void main(String[] args) {

		/*
		 * display(); display(10); display(10, 20);
		 */
		Method_overload md = new Method_overload();
		md.display();
		md.display(10);
		md.display(100, 120);
	}
}
