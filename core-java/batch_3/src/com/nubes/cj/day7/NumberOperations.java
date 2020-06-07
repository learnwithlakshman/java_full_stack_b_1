package com.nubes.cj.day7;

public class NumberOperations {

	public int sumOfDigits(int num) {
		int sum = 0;
		if (num > 0 && num < 10) {
			sum = num;
		}
		while (num != 0) {
			sum += num % 10; // sum = sum + num % 10;
			num /= 10; // num = num /10
		}
		return sum;
	}

	public boolean isPrime(int num) {
		if (num < 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public int reverseOfNumber(int num) {
		if(num < 0) {
			return 0;
		}
		if(num > 0 && num < 10) {
			return num;
		}
		int rev = 0;
		while(num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}
}
