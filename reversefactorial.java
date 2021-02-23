package com.qa.testing;

public class ReverseFactorial {

	public static void main(String[] args) {

		System.out.println(reverseFactorial(120));

	}

	public static String reverseFactorial(int i) {
		int counter = 0;
		int product = i;

		for (int j = 1; j > 0; j++) {
			product /= j;
			counter += 1;

			if (product == 1) {
				break;
			}

			if (i % counter != 0) {
				return "None";
			}

			if (i == 0) {
				return "1!";
			}

		}
		return String.valueOf(counter + "!");

	}

}
