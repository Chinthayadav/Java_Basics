package com.fresher_level.java_this_super;

// Print the fields/instance members of the parent class using super
//  Call constructor of the parent class using super()

class Large {
	String s;

	Large() {
		s = "Sahitya";
	}

	// over ridden method
	void display() {
		System.out.println(s);
	}
}

class Small extends Large {
	String s1 = "Chintha Chinnayya";

	// over ridding method
	void disply() {
		System.out.println(s1);
	}

	void getResult() {
		disply();
		super.display();
	}

}

public class Java_super {

	public static void main(String[] args) {
	
		Small s = new Small();
		s.getResult();
		
		

	}

}
