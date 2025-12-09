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

		int x = 10;
		System.out.println(x++);
		System.out.println(x);

		int y = 10;
		System.out.println(++y);

		int a = 5;
		System.out.println(a++ + ++a);

		int b = 3;
		b = b++ + b++;
		System.out.println(b);

		int c = 5;
		System.out.println(++c + ++c);

	}

}
