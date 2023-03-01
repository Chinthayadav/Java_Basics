package com.fresher_level.java_Interface;

/*Create an interface with two methods, but implement only one in a class. Call the 
method implemented.*/

interface Supper {
	public abstract void getDisplay();

	public abstract void dispalyData();
}

class Hero implements Supper {
	/*
	 * create two methods in interface and implement one only it gives error
	 * Error:The type Hero must implement the inherited abstract method
	 * Supper.getDisplay()
	 */

	public void getDisplay() {
		System.out.println("This is getdisplay method");
	}

	public void dispalyData() {
		System.out.println("This is display method");
	}

}

public class Interface1 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.dispalyData();
		h.getDisplay();

	}

}
