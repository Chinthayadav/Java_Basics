package com.fresher_level.java_Interface;

/*Create a PUBLIC interface with fields and methods, fields should have values assigned. 
Implement this interface to some class and print the values of the interface fields and 
call the interface methods*/
/*Create a PRIVATE or PROTECTED interface and print the values as above scenario
 * error: Illegal modifier for the interface In; only public & abstract are permitted*/

interface In {
	public  final int x = 1000;

	public abstract void disMessage();
}

class Ni implements In {
	public void disMessage() {
		System.out.println(x);
		System.out.println("This is dismessage() method ");
	}
}

public class Interfac5 {

	public static void main(String[] args) {
		Ni v = new Ni();
		v.disMessage();

	}

}
