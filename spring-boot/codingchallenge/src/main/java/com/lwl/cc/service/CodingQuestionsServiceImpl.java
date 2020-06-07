package com.lwl.cc.service;

import org.springframework.stereotype.Service;

@Service
public class CodingQuestionsServiceImpl implements CodingQuestionsService {

	@Override
	public boolean search(int[] arr, int key) {
		for (int ele : arr) {
			if (ele == key)
				return true;
		}
		return false;
	}

	@Override
	public int countPrimes(int[] arr) {
		int count = 0;
		for (int ele : arr) {
			if (isPrime(ele)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int biggest(int a, int b, int c) {
		if(a > b && a >c) {
			return a;
		}else if(b > c) {
			return b;
		}else {
			return c;
		}
		
	}

	@Override
	public int biggest(int... arr) {
		int big = arr[0];
		for(int i=1;i< arr.length;i++) {
			if(big < arr[i])
				big = arr[i];
		}
		return big;
	}

	private boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
