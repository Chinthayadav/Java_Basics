package com.fresher_level.java_Access_Modifier;


abstract class Sup {
	// abstract method is without body
	public abstract void methodOne();
}
class Chi extends Sup {
	public void methodOne(){
		System.out.println("this is implementation of abstract method in child class");
	}
}
public class Abstract {

	public static void main(String[] args) {
		
		// we are not want or able to create child class then declare as abstract 
		 // Sup s =new Sup(); error:Cannot instantiate the type Sup
		Chi c = new Chi();
		c.methodOne();
	}

}
