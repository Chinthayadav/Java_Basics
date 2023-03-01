package com.fresher_level.java_Inheritance;

// multiple inheritance it not  possible to implement in java to overcome this problem they intrduce interfaces

interface sup1 {
	public final int x = 10;

	public abstract void getx();
}

interface sup2 {
	public final int y = 20;

	public abstract void gety();
}

class sub implements sup1, sup2 {
	public void getx() {
		System.out.println(x);
	}

	public void gety() {
		System.out.println(y);
	}

	void sum() {
		System.out.println(+(x + y));
	}
}

public class Multiple_inheritance {

	public static void main(String[] args) {
		sub b = new sub();
		b.getx();
		b.gety();
		b.sum();
	}

}
