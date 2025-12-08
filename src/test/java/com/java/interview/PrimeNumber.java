package com.java.interview;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 7;
		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		} else {

		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}
}