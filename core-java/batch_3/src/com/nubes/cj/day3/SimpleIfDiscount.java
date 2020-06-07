package com.nubes.cj.day3;

import java.util.Scanner;

public class SimpleIfDiscount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		float b_amount = sc.nextFloat();
		float net_amount = b_amount;
		float discount = 0;
	
		if (b_amount > 6000) {
			discount = b_amount * 0.1f;
			net_amount = b_amount - discount;
		}
		
		System.out.println("Total bill amount:" + b_amount);
		System.out.println("Discount :" + discount);
		System.out.println("Net amount :" + net_amount);
		sc.close();

	}
}
