package com.fresher_level.java_Inheritance;

// single level inheritance
/*A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B*/
class Father {
	public static void buildHouse() {
		System.out.println("Father's house");
	}
}

class Child extends Father {
	public static void sonBuildHouse() {
		System.out.println("Father's house+Son house");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {

		// object creation for last child class only
		Child hs = new Child();
		hs.buildHouse();
		hs.sonBuildHouse();

	}

}
