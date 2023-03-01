package com.fresher_level.java_Constructer;

// Apply private, public, protected and default access modifiers to the constructor
class Large {
	String name ;
	public Large() {
		name = "Sahitya";
	}
	void dispaly() {
		System.out.println(name);
	}
	/*
	 * private Large() {
	 * 
	 * } protected Large() {
	 * 
	 * } default Large() {
	 *  this modifier gives error while declaring constructer as private,protected,default except public modifier
	 * }
	 */
}

public class Interface6 {

	public static void main(String[] args) {
		Large l = new Large();
		l.dispaly();

	}

}
