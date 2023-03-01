package com.fresher_level.java_Constructer;
/* constructer is nothing but to create an object 
 *It is nothing but to initialize values within class
 **/

/*Write a class with a default constructor, one argument constructor and two argument 
constructors. Instantiate the class to call all the constructors of that class from a main 
class*/
// constructer overloading concept
/*
 * Rules for constructer creation
 * class name and constructer should be same
 * implicit calling
 * no return type is declared*/
class Robo {
	int x, y, total;

	// constructor creation with default
	Robo() {
		x = 10;
		y = 20;
	}

	// constructer with one parameter
	Robo(int a) {
		x = a;
		y = a;
	}

	// constructer with two parameters
	Robo(int a, int b) {
		x = a;
		y = b;
	}

	void sum() {
		total = x + y;
		System.out.println("Sum:" + total);
	}
}

public class Java_Constructer {

	public static void main(String[] args) {

		// object creation

		Robo r = new Robo();
		Robo r1 = new Robo(10);
		Robo r2 = new Robo(20,30);
		
		r.sum();
		r1.sum();
		r2.sum();

	}

}
