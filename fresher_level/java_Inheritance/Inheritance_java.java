package com.fresher_level.java_Inheritance;

// multi level inheritance
/*Create a class with main method. Create an object for each class A, B and C in main 
method and call every method of each class using its own object/instance*/
class A {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}
}

class B extends A {
	public static int multi(int a, int b) {
		return a * b;
	}
}

class C extends B {
	public static int div(int a, int b) {
		return a / b;
	}
}

public class Inheritance_java {

	public static void main(String[] args) {
		int a = 50, b = 5;
		C obj = new C();
		System.out.println(" Addition of two numbers: " + obj.add(a, b));
		System.out.println(" Subtraction of two numbers: " + obj.sub(a, b));
		System.out.println(" Multiplication of two numbers: " + obj.multi(a, b));
		System.out.println("division of two numbers: " + obj.div(a, b));

	}

}
