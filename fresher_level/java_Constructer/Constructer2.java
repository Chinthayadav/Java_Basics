package com.fresher_level.java_Constructer;

class Father {
	String s1 ;
	Father(){
		s1 ="chintha chinnayya";
	}
	void display() {
	
		System.out.println(s1);
		
	}
	/* Write constructors with return type int and String
	 * int display() { System.out.println(name); } String display() {
	 * System.out.println(name); }
	 */
}

public class Constructer2 {

	public static void main(String[] args) {
		Father f = new Father();
		// Try to call the constructor multiple times with the same object
		for (int i = 0; i <= 10; i++) {
			f.display();
		}
	}

}
