package com.nubes.cj.day4;

import java.util.Scanner;

public class NaturalEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i = i + 2) {
			System.out.print(i+" ");
		}
		sc.close();

	}
}
