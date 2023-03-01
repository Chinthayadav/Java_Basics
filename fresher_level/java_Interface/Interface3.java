package com.fresher_level.java_Interface;

/*Create an interface with a default method and implement it in a class. Do not provide 
implementation to the default method and call the method.*/

interface X {
	public void msgDisplay();
}

class Y implements X {
	public void msgDisplay() {
		System.out.println("default method");
	}
}

public class Interface3 {

	public static void main(String[] args) {
		Y y = new Y();
		y.msgDisplay();
	}

}
