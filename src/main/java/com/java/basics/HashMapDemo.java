package com.java.basics;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Ajaaj");
		map.put(2, "Ahmad");
		map.put(3, "Rahul");

		System.out.println(map.size());

		for (Integer i : map.keySet()) {
			System.out.println(i + " " + map.get(i));
		}

	}

}