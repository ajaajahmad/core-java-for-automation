package com.java.oops;

public class Encapsulation {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		Encapsulation obj = new Encapsulation();
		obj.setId(10);

		System.out.println(obj.getId());
	}

}
