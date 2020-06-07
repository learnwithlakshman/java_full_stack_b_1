package com.nubes.cj.day8;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
	public static void main(String[] args) {

		
		int[] arr = new int[5];

		Random rm = new Random();
		for (int i = 0; i < arr.length; i++) {
			int num = rm.nextInt(100) + 1;
			arr[i] = num;
		}
		int even_count = 0;
		int odd_count = 0;
		int prime_count = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (isEven(num)) {
				even_count++;
			} else {
				odd_count++;
			}
			if (isPrime(num)) {
				prime_count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Even number count :" + even_count);
		System.out.println("Odd number count :" + odd_count);
		System.out.println("Prime count is: " + prime_count);

	}

	private static boolean isEven(int num) {
		return num % 2 == 0;
	}

	private static boolean isPrime(int num) {
		boolean is_prime = true;
		for (int j = 2; j <= num / 2; j++) {
			if (num % j == 0) {
				is_prime = false;
			}
		}

		if (is_prime && num >= 1) {
			return is_prime;
		}
		return is_prime;
	}
}
