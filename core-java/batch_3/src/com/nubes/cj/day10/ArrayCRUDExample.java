package com.nubes.cj.day10;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCRUDExample {

	public static void main(String[] args) {
		int[] idArray = new int[2];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Add new id 2. Delete id 3.View all 4.Search 5.Update 6.exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (count >= idArray.length) {
					int[] temp = new int[idArray.length + 3];
					System.arraycopy(idArray, 0, temp, 0, idArray.length);
					idArray = temp;
					System.out.println(Arrays.toString(idArray));
       			}
				addNewId(idArray, count);
				count++;
				break;
			case 2:
				break;
			case 3:
				viewAllIds(idArray, count);
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.exit(0);
			default:
				break;
			}
		}
	}

	private static void viewAllIds(int[] idArray, int count) {
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			if (i < count - 1)
				System.out.print(idArray[i] + ", ");
			else
				System.out.print(idArray[i]);
		}
		System.out.println("]");

	}

	private static void addNewId(int[] idArray, int count) {
		System.out.println("Enter the new id:");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		idArray[count] = id;
		

	}

}
