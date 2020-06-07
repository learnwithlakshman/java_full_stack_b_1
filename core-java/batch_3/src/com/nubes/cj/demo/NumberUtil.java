package com.nubes.cj.demo;

public class NumberUtil {

	public int biggest(int a, int b) {
//		int big;
//		if(a > b) {
//			big = a;
//		}else {
//			big = b;
//		}
//		return big;
		return a > b ? a : b;
	}

	public int biggest(int a, int b, int c) {
//		int big;
//		if(a > b && a > c ) {
//			big = a;
//		}else if( b > c) {
//			big = b;
//		}else {
//			big = c;
//		}
//		return big;

		return (a > b && a > c) ? a : b > c ? b : c;
	}
}
