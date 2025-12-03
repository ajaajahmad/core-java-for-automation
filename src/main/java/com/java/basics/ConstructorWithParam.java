package com.java.basics;

public class ConstructorWithParam {

	int id;
	String name;

	ConstructorWithParam(int i, String n) {

		id = i;
		name = n;
	}

	public static void main(String[] args) {

		ConstructorWithParam cwp = new ConstructorWithParam(10, "Ajaaj");

		System.out.println(cwp.id);
		System.out.println(cwp.name);
	}
}
