package com.java.practices;

public class CountCharFrequency {

	public static void main(String[] args) {

		String str = "test automation engineer";
		int[] count = new int[127];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (count[ch] > 0) {
				System.out.println("'" + ch + " :" + count[ch]);
				count[ch] = 0;
			}
		}
	}

}
