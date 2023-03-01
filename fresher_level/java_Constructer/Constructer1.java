package com.fresher_level.java_Constructer;

/* the constructors(both default and argument constructors) of super class from a child 
class*/
class Super {
	int x, y, total;

	Super() { // default constructer
		x = 10;
		y = 20;
	}

	Super(int a, int b) { // parameterized constructer
		x = a;
		y = b;
	}

	// overridden method
	void sum() {
		total = x + y;
		System.out.println("Sum:" + total);
	}
}

class Child extends Super {
	// overriding method
	void display1() {
		System.out.println("This is just begin of carrer with jala acadamy");
	}

	public void printMessage() {
		// this calls overridden method
		super.sum();

		// this calls overriding method
		display1();
	}
}

public class Constructer1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.printMessage();

	}

}
