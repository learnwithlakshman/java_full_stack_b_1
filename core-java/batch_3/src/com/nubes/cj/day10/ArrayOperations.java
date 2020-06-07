package com.nubes.cj.day10;

public class ArrayOperations {

	public int biggestElement(int[] arr) {
		int big = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (big < arr[i]) {
				big = arr[i];
			}
		}
		return big;
	}

	public int smallestElement(int[] arr) {
		// TODO find smallest and return
		return 0;
	}

	public boolean searchElement(int[] arr, int ele) {
		// TODO
		return false;
	}

	public boolean subSet(int[] arr1, int[] arr2) {
		// TODO
		return false;
	}

	public int counPrimeNumbers(int[] arr) {
		// TODO
		return 0;
	}

	public int sumOfElements(int[][] arr) {
		// TODO
		return 0;
	}

	public int diagonalSum(int[][] arr) {
		// TODO
		return 0;
	}

	public boolean search(int[] arr, int key1, int key2, int key3) {
		// TODO
		return false;
	}

	public int missingNumber(int[] arr) {
		// TODO array contains natural numbers
		// Example-1 4,5,9,8,7 => missing number is 6
		// Example-2 9,6,5,4,7 => missing number is 8
		return 0;
	}

	public int[][] add(int[][] arr1, int[][] arr2) {
		// TODO
		return null;
	}

	public int[] getAllPrimeNubmers(int[] arr) {
		// TODO
		return null;
	}
}
