package com.fresher_level.java_Access_Modifier;

/*Create a class with PROTECTED fields and methods. Access these fields and methods 
from any other class in the same package.*/
class Super {
	protected int num = 10;

	protected void methodOne() {
		System.out.println(" This is protected method ");
	}
}

public class Protected_modifier {
	protected int number = 10;

	protected void methodOne1() {
		System.out.println(" This is protected method ");
	}

	public static void main(String[] args) {
		Super a = new Super();
		System.out.println(a.num);
		a.methodOne();

	}

}
