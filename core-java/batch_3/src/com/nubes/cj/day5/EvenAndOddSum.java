package com.nubes.cj.day5;

import java.util.Scanner;

public class EvenAndOddSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int e_sum = 0;
		int o_sum = 0;

		for (int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				e_sum += i;  // e_sum = e_sum + i;
			}else {
				o_sum += i;
			}
			
		}
		System.out.println("Even Sum :"+e_sum);
		System.out.println("Odd Sum :"+o_sum);
		sc.close();
	}
}
