package com.fresher_level.java_Access_Modifier;

// Create a class with DEFAULT fields and methods. 
class AA {
	int xy = 100;

	public static int getSum(int x, int y) {
		return x + y;
	}
}

/*
 * Access these fields and methods from any other class in the same package
 */
public class Default_modifier {

	public static void main(String[] args) {
		AA a = new AA();
		System.out.println(a.xy);
		int result = a.getSum(10, 20);
		System.out.println(result);

	}

}
