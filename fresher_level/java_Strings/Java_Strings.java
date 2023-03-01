package com.fresher_level.java_Strings;

public class Java_Strings {

	public static void main(String[] args) {

		// Different ways creating a string
		String s = "CHINTHA";
		String s1 = new String("Chinnayya");
		String str = "I Love My India";
		System.out.println(str);
		System.out.println(s);
		System.out.println(s1);
		// Concatenating two strings using + operator
		System.out.println(s1 + " " + s);
		// Finding the length of the string
		int length = s.length();
		int len = s1.length();
		System.out.println("length of the string:" + length);
		System.out.println(len);
		// Converting to uppercase and lowercase
		String s2 = s1.toUpperCase();
		String s3 = s.toLowerCase();
		// Converting integer objects to Strings
		// Converting Numbers to Strings with valueOf()
		int a = 19;
		String s4 = String.valueOf(a);
		System.out.println(a + 17);
		// Splitting strings with split()
		System.out.print(" Splited string: ");
		for (String str1 : str.split(" "))
			System.out.print(str1 + " ,");
		System.out.println();
		// Replacing characters in strings with replace()
		String str2 = str.replace("India", "Mother");
		System.out.println(str2);
		// isEmpty()
		String name = "";
		String name1 = "sahitya";
		System.out.println(name.isEmpty());
		System.out.println(name1.isEmpty());
		// isEquals() and isEqualsIgnoreCase()
		String S = "chintha";
		String S1 = "chinnayya";
		String S2 = "chintha";
		System.err.println(S.equals(S2));
		System.out.println(S.equals(S1));
		// equalsIgnoreCase()
		System.out.println(S.equalsIgnoreCase(str2));
		System.out.println(S.equalsIgnoreCase(str));
		// startsWith(), endsWith() and compareTo()
		System.out.println(S.startsWith("c")); // true
		System.out.println(S.endsWith("a")); // true
		System.out.println(S.endsWith("c")); // false
		System.out.println(S.startsWith("a")); // false
		System.out.println(S.compareTo(s)); // return a value
		System.out.println(S.equals(S1)); // false
		// Extract a string using Substring
		String nam = "Chintha Chinnayya ";
		String sub = nam.substring(8, nam.length());
		System.out.println(sub);
		// Searching in strings using indexOf()
		System.out.println(S.indexOf("a"));
		String NAME = "CHINTHA";
		System.out.println(s.equals(NAME)); // true
		// Matching a String Against a Regular Expression With matches()
		String pattern = "Love";
		boolean result = str.contains(pattern);
		if (result)
			System.out.println("pattern found");
		else
			System.out.println("pattern not found");

	}

}
