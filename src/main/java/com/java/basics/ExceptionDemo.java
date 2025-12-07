package com.java.basics;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int[] arr = { 10, 20, 30 };
			System.out.println(arr[5]); // error
		} catch (Exception e) {
			System.out.println("Exception handled");
		} finally {
			System.out.println("Program completed");
		}
	}
}
