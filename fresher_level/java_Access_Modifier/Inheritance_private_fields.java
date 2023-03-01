package com.fresher_level.java_Access_Modifier;

// Create a sub class and try to access the private fields and methods from sub class.
class Superq {

	private int num = 1000;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class Child extends Superq {
	private String name = "chintha chinnayya";

	public void reportStatus() {
		System.out.println("Name :" + name); // with in same class private variable can access ,but outside of class
												// cannot
		System.out.println("Number: " + getNum()); // by using getter and setter methods we can access the private
													// fields outside of class
	}
}

public class Inheritance_private_fields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();

		c.reportStatus();

	}

}
