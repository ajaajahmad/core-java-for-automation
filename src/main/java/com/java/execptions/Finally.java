package com.java.execptions;

public class Finally {

	public static void main(String[] args) {

		try {
			int x = 10 / 2;
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block executed");
		}
	}

}