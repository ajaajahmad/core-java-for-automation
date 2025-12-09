package com.java.interview;

public class StringPlusInceament {

	public static void main(String[] args) {
		
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

		String s = "Java";
		int xz = 5;
		System.out.println(s + xz++);
		System.out.println(s + xz);
	}

}
