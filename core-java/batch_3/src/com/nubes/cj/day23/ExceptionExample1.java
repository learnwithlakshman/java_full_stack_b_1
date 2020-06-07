package com.nubes.cj.day23;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {
		System.out.println("Main");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1:");
		int a = sc.nextInt();
		System.out.println("Enter the num2:");
		int b = sc.nextInt();
		try {
			int res = divide(a, b);
			System.out.println("Result :" + res);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("End of Main");
		sc.close();
	}

	public static int divide(int a, int b) {
		int res = a / b;
		return res;
	}

}
