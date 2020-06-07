package com.nubes.cj.day5;

public class MultiplicationOfTable {
	public static void main(String[] args) {

		/*
		 * for (int c = 1; c <= 20; c++) { for (int i = 1; i <= 10; i++) {
		 * System.out.println(c + " * " + i + " = " + (c * i)); }
		 * System.out.println("-----------------"); }
		 */

		/*
		 * for (int i = 1; i <= 6; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print(j+" "); } System.out.println(); }
		 */

		for (int i = 6; i >= 1; i--) { // 6 5 4 3 2 1
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
