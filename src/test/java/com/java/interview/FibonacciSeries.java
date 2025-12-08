package com.java.interview;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int sum;
		int count = 10;

		System.out.print(a + " " + b + " ");

		for (int i = 2; i < count; i++) {
			sum = a + b;
			System.out.println(sum + " ");

			a = b;
			b = sum;
		}

	}

}
