package com.fresher_level.java_Access_Modifier;

// Access modifier are public,private,default,protected 
class A {
	// declare variable with private modifier
	private int num;
	private String name;

	public int getNum() { // getter
		return num;
	}

	public void setNum(int num) {
		this.num = num; // setter
	}

	public String getName() {
		return name; // getter
	}

	public void setName(String name) {
		this.name = name; // setter
	}
}

public class Access_Modifier {

	public static void main(String[] args) {
		// creation of object to class name
		A a = new A();
		// set value
		a.setNum(26);
		a.setName("Chintha Chinnayya");
		// get value
		System.out.println("Num : " + (a.getNum()));
		System.out.println("Name : " + (a.getName()));

	}

}
