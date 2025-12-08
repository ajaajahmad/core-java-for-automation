package com.java.tests;

import java.util.HashMap;

public class CountCharacters {

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

		for (Character key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}

	}

}
