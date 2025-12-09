package com.java.interview;

public class StringConstantPoolRule {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = new String("hello");
		String s4 = new String("hello");

		System.out.println(s3.equals(s4));

		String as = "Test";
		String bs = new String("Test");
		
		System.out.println(as == bs);
		System.out.println(as.equals(bs));

	}

}
