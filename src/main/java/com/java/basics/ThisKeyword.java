package com.java.basics;

public class ThisKeyword {

	int id;

	ThisKeyword(int id) {

		this.id = id;
	}

	public static void main(String[] args) {
		
		
		ThisKeyword tk = new ThisKeyword(10);
		System.out.println(tk.id);
	}

}
