package com.nubes.cj.day9;

import java.util.Random;

public class SearchElements {
	public static void main(String[] args) {
		int[] nums = randomNumbers();
		int key = 5;
		for (int i : nums) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < nums.length; i++) {
			if (key == nums[i]) {
				System.out.println("\n" + key + " is found at: " + i);
			}
		}

		int sum = 0;
		for(int n:nums) {
			sum+= n;
		}
		System.out.println(sum);
	}

	private static int[] randomNumbers() {
		int[] arr = new int[20];
		Random rn = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(50) + 1;
		}
		return arr;
	}
}
