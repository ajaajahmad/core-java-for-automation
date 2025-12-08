package com.java.interview;

public class SmallestLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 23, 87, 22, 55 };

		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < smallest) {
				smallest = arr[i];
			}
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println(smallest);
		System.out.println(largest);
	}

}
