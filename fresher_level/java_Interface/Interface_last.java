package com.fresher_level.java_Interface;
 
// Create an interface with static final variable

interface LAst{
	public static final int x=10;
	public void getMsg();
}
class AS implements LAst{
	public void getMsg() {
		System.out.println("tHe last msg I print");
	}
}
public class Interface_last {

	public static void main(String[] args) {
		AS as = new AS();
		as.getMsg();

	}

}
