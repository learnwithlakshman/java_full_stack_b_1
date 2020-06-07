package com.nubes.cj.day4;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
