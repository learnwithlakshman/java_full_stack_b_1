package com.nubes.cj.day7;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(6) + 1;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Guess a number :");
			int user_num = sc.nextInt();
			if (num == user_num) {
				System.out.println("Good you guessed number.... in "+i+" times ");
				flag = true;
				break;
			} else {
				System.out.println("Sorry! it's wrong guess, try again...");
			}
		}
		if(!flag) {
			System.out.println("You reached max attempts....");
		}
		sc.close();
	}
}
