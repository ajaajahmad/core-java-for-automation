package com.java.practices;

public class ReverseString {
	public static void main(String[] args) {
		String str = "test automation engineer";
		String reversed = "";

		// Start from the last index and move to 0
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}

		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reversed);
	}
}