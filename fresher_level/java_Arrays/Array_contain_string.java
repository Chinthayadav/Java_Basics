package com.fresher_level.java_Arrays;

// Write a function to test if array contains a specific value
// import arrays
import java.util.Arrays;

public class Array_contain_string {

	public static void main(String[] args) {
// string array creation
		String[] string = { "chintha", "chinnayya", "yaswanth", "yathish", "nani", "danush" };
		String find = "chintha";
		// By using array stream method
		boolean found = Arrays.stream(string).anyMatch(element -> element.equals(find));
		if (found)
			System.out.println(find + " is found in an existing String array");
		else
			System.out.println(find + " is not found in an existing String array");

	}

}
