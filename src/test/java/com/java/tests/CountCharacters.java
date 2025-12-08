package com.java.tests;

import java.util.HashMap;

public class CountCharacters {

	public static void main(String[] args) {
		
		String name = "automation";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			System.out.println(ch);
		}
		
		
	}

}
