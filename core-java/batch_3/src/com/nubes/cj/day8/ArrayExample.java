package com.nubes.cj.day8;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		int[] person_ages = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<person_ages.length;i++) {
			System.out.println("Enter person "+(i+1)+" age:");
			person_ages[i] = sc.nextInt();
		}
		//Sum and average
		int sum = 0;
	
		for(int i=0;i<person_ages.length;i++) {
			sum += person_ages[i];
		}
		
		float average = sum /(float)person_ages.length;  // 5 convert into 5.0
		System.out.println("Sum of ages: "+sum);
		System.out.println("Average of age:"+average);
		
		for(int i=0;i<person_ages.length;i++) {
			System.out.println(person_ages[i]);
		}
			
		sc.close();
	}
}
