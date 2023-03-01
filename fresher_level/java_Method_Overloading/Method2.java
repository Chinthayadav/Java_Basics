package com.fresher_level.java_Method_Overloading;

/*Write two methods with the same name and same number of parameters of same type 
and call from main method*/
public class Method2 {
	private static void display(int a, int b) {
		System.out.println("the value of a: " + a);
		System.out.println("the value of b: " + b);
	}

	private static void display(double d, double d1) {
		System.out.println("the value of d: " + d);
		System.out.println("the value of d: " + d1);
	}

	public static void main(String[] args) {
		display(123.78d, 12456.70d);
		display(123, 240);

	}

}
