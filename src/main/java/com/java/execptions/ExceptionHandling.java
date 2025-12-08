package com.java.execptions;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {

			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("Execption Handalled");
		}
	}

}