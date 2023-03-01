package com.fresher_level.java_Method_Overloading;

/*Write two methods with the same name but different number of parameters of different 
data type and call the methods from main method*/
public class Method1 {

	private static void display(int a,float f) {
		System.out.println("the value of a: " + a);
		System.out.println("the value of f: " + f);
	}

	private static void display(double d, int b) {
		System.out.println("the value of d: " + d);
		System.out.println("the value of b: " + b);
	}
	public static void main(String[] args) {
		display(10,123.45f);
		display(125673.45d, 12340);

	}

}
