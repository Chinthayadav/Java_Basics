package com.fresher_level.java_Inheritance;

import java.lang.*;

// Hierarchical inheritance in java
// Call an overridden method with super class reference to B and C class’s objects
class Vehicle {
	public static void display() {
		System.out.println("This is a super class");
	}
}

class Bike extends Vehicle {
	public static void display1() {
		System.out.println("This is a child 1 class");
	}
}

class Car extends Vehicle {
	public static void display2() {
		System.out.println("This is a child 2 class");
	}
}

public class Hierac_inheritance {
	public static void main(String[] args) {
		// creation object child 1 class
		Bike b = new Bike();
		b.display1();
		b.display();
		// creation object child 2 class
		Car c = new Car();
		c.display2();
		c.display();

	}

}
