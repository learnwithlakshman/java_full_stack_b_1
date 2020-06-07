package com.nubes.cj.day5;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();

		boolean is_prime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				is_prime = false;
				break;
			}
		}
		if (is_prime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		sc.close();

	}
}
