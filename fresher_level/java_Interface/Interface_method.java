package com.fresher_level.java_Interface;

/*Create an interface with only one method and implement it in a class. Call the method 
implemented.*/

interface Sup {
	public abstract void methodOne();
}

class Child implements Sup {
	public void methodOne() {
		System.out.println("this is abstract method impletion in child class");
	}

}

public class Interface_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.methodOne();
	}

}
