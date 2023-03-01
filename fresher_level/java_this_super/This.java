package com.fresher_level.java_this_super;

/*Print the fields/instance members of the current class using this and without using object*/
class Super {
	int x;
	int y;

	public Super(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	void dispaly() {
		System.out.println(x);
		System.out.println(y);
	}
}

public class This {

	public static void main(String[] args) {

		Super s = new Super(10, 20);
		s.dispaly();

	}

}
