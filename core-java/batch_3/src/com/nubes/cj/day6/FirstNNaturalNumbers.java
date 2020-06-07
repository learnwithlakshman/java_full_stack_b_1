package com.nubes.cj.day6;

import java.util.Scanner;

public class FirstNNaturalNumbers {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the N:");
			int N = sc.nextInt();
			
			int i = 1;
			while(i <= N) {
				System.out.println(i);
				i++;
			}
			sc.close();
		}
}
