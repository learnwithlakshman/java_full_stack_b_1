package com.nubes.cj.day10;

import java.util.Arrays;

public class ArrayCopySort {
	public static void main(String[] args) {
		int[] arr = new int[]{6,7,8,9,10,2,3,4,5};
		int[] carr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			carr[i] = arr[i];
		}
		
//		System.out.println("Before copy:"+Arrays.toString(carr));
//		System.arraycopy(arr, 0, carr, 0, arr.length);
//		System.out.println("After copy:"+Arrays.toString(carr));
	
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	
		//Arrays.sort(arr);
		System.out.println("Sort :"+Arrays.toString(arr));
	System.out.println(3 & 5);
	System.out.println(3 | 5);
	}
}
