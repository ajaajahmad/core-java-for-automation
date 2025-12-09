package com.java.interview;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 4, 3, 5 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		System.out.println("Array after removing duplicate:");
		// for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
		// int num = it.next();

		for (Integer num : set) {
			System.out.println(num);
		}
	}

}
