package com.java.interview;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int[] arr = {10, 15, 20, 25, 30};

		System.out.println("Even Number:");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.println("Odd Number:");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
