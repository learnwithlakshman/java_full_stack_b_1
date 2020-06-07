package com.nubes.cj.day18;
import static com.nubes.cj.day18.MathOperations.*;
class MathOperations {

	public static int max(int a, int b) {
		System.out.println("Method with 2 arguments");
		return a > b ? a : b;
	}

	public static int max(int a, int b, int c) {
		System.out.println("Method with 3 arguments");
		return a > b && a > c ? a : b > c ? b : c;
	}

	public static int max(int... nums) {
		System.out.println("Method with n arguments");
		int big = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (big < nums[i]) {
				big = nums[i];
			}
		}
		return big;
	}

}

public class StaticKeyWordExample1 {
	public static void main(String[] args) {
		System.out.println(max(1,2,3));
	}
}
