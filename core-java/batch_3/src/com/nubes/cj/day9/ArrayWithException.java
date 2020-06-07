package com.nubes.cj.day9;

import java.util.Arrays;

public class ArrayWithException {
	public static void main(String[] args) {

		float[] arr = getElements();

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Reverse order:");
		for (int i = arr.length -1 ; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("Processing using for-each:");
		
		int[] numberArr = new int[]{2,3,4,5,6,7};
		
		for(int ele:numberArr) {
			System.out.println(ele);
		}

	}

	private static float[] getElements() {

		return new float[] { 3.4f, 4.5f, 5.5f, 6.5f };
	}
}
