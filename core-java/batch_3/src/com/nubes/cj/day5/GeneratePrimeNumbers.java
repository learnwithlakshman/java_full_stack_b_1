package com.nubes.cj.day5;

public class GeneratePrimeNumbers {

	public static void main(String[] args) {
		int lb = 10, ub = 100;

		for (int j = lb; j <= ub; j++) {
			boolean is_prime = true;
			int num = j;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					is_prime = false;
					break;
				}
			}
			if (is_prime) {
				System.out.print(num+" ");
			}
		}
	}
}
