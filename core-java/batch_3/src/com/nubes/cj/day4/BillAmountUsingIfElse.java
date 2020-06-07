package com.nubes.cj.day4;

import java.util.Scanner;

public class BillAmountUsingIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		int amount = sc.nextInt();

		float discount = 0;

		if (amount > 10000) {
			discount = amount * .2f;
		} else if (amount >= 5000 && amount <= 10000) {
			discount = amount * 0.1f;
		} else {
			discount = amount * 0.05f;
		}
		System.out.println("Total bill amount :" + amount);
		System.out.println("Discount :" + discount);
		sc.close();
	}
}
