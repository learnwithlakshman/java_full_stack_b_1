package com.nubes.cj.day6;

import java.util.Scanner;

public class NumberOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		int rev = reverse(num);
		System.out.println("Reverse of "+num+" is "+rev);
		
		if(rev == num) {
			System.out.println("Given number :"+num+" is palindrome");
		}else {
			System.out.println("Given number:"+num+" is not palindrome");
		}
		
		sc.close();
		
	}

	public static int reverse(int num) {
		if (num >= 0 && num <= 9) {
			return num;
		}

		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}
	
	public static int sumOfDigits(int num) {
		// 1234 => 1 + 2 + 3 + 4 => 10
		return 0;
	}
	public static boolean amstrongNumber(int num) {
		// 153  => 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125 + 27 => 153
		return false;
	}
}
