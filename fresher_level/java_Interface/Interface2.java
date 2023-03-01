package com.fresher_level.java_Interface;

/*Create two interfaces with the same method (same signature) in both the interfaces. 
Implement these two interfaces in one class. Call the method.*/

interface A{
	public abstract int getSum(int x, int y);
}
interface B{
	public abstract int getSum(int x, int y);
}
class C implements A,B{
	public int getSum(int x,int y) {
		return x+y;
	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		C c=new C();
		int x=c.getSum(19, 20);
		System.out.println(x);

	}

}
