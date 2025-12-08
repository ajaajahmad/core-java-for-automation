package com.java.interview;

import java.util.HashMap;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String name = "automation";
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		System.out.println("Duplicate characters are:");

		for (Character key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key);
			}
		}
	}

}