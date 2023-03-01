package com.fresher_level.java_Interface;

/*Create two interfaces with one method each. Implement these two interfaces in one 
class. */

interface One {
	public abstract void displayMsg();
}

interface Second {
	public abstract int displayNumber();
}

class Third implements One, Second {
	public void displayMsg() {
		System.out.println("this displayMsg() method");
	}

	public int displayNumber() {
		System.out.println("this displayNumber() method");
		 return 10 + 1;
	}

}

public class Interface_multiple_inheritance {

	public static void main(String[] args) {
		Third t = new Third();
		t.displayNumber();
		t.displayNumber();

	}

}
