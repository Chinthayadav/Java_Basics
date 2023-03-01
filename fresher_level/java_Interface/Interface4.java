
package com.fresher_level.java_Interface;

/*Create an interface and inherit it from the other interface*/
interface AB {
	public abstract int addData(int x, int y);
}

interface CD extends AB {
	public abstract int subData1(int x, int y);
}

class D implements AB, CD {
	public int addData(int x, int y) {
		return x + y;
	}

	public int subData1(int x, int y) {
		return x - y;
	}
}

public class Interface4 {

	public static void main(String[] args) {
		D d = new D();
		int val = d.addData(10, 20);
		int val2 = d.subData1(20, 10);
		System.out.println(val);
		System.out.println(val2);

	}

}
