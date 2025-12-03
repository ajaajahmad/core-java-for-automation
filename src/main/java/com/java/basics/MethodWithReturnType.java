package com.java.basics;

public class MethodWithReturnType {

	public static void main(String[] args) {
		int sum = add(10, 20);
		System.out.println(sum);
	}

	public static int add(int a, int b) {
		return a + b;
	}
}
