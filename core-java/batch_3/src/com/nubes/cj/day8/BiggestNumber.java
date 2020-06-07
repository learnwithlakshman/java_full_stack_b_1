package com.nubes.cj.day8;

import java.util.Arrays;
import java.util.Random;

public class BiggestNumber {
	
	public static void main(String[] args) {
		int[] arr = new int[20];

		Random rm = new Random();
		for (int i = 0; i < arr.length; i++) {
			int num = rm.nextInt(100) + 1;
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0]; 
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
		
		
	}
}
