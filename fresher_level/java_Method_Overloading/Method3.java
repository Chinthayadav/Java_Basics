package com.fresher_level.java_Method_Overloading;

/*Write two methods with the same name, number of parameters and data type but 
different return Type*/
public class Method3 {

	private int sumValue(int a, int b) {
		return a + b;
	}

	private float sumValue(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		Method3 m = new Method3();
		int x = m.sumValue(10, 20);
		float y = m.sumValue(12.3f, 12.50f);
		System.out.println(x+" "+y);

	}

}
