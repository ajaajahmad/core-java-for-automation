package com.java.practices;

public class ReverseLastString {
	public static void main(String[] args) {
		String str = "ajaaj ahmad from mumbai";

		// 1. Find the index of the last space to isolate the last word
		int lastSpaceIndex = str.lastIndexOf(" ");

		// 2. Extract the last word and the rest of the string
		// Everything before the last space
		String restOfString = str.substring(0, lastSpaceIndex);
		// Everything after the last space
		String lastWord = str.substring(lastSpaceIndex + 1);

		// 3. Reverse the last word using StringBuilder
		String reversedLastWord = new StringBuilder(lastWord).reverse().toString();

		// 4. Combine them: [Reversed Word] + [Space] + [Rest of String]
		String result = reversedLastWord + " " + restOfString;

		//System.out.println("Original: " + str);
		System.out.println("Result:   " + result);
	}
}