package com.java.basics;

public class StringDemo {

	public static void main(java.lang.String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");

		System.out.println(s1 == s2); // true: same memory
		System.out.println(s1 == s3); // false: different memory

		System.out.println(s1.equals(s3)); // true: same content

		String name = "Ajaaj";
		name.concat(" Ahmad");

		System.out.println(name); // Ajaaj (immutable)

	}

}
