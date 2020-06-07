package com.nubes.cj.day2;

import java.util.Scanner;

public class RelationOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 value:");
		int num_1 = sc.nextInt();
		System.out.println("Enter the num2 value:");
		int num_2 = sc.nextInt();
		System.out.println("Num_1:" + num_1 + " and Num_2 :" + num_2);
		System.out.println(" > " + (num_1 > num_2));
		System.out.println(" >= " + (num_1 >= num_2));
		System.out.println(" < " + (num_1 < num_2));
		System.out.println(" <= " + (num_1 <= num_2));
		System.out.println(" == " + (num_1 == num_2));
		System.out.println(" != " + (num_1 != num_2));
		sc.close();
	}
}
