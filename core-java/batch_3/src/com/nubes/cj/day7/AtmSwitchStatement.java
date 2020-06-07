package com.nubes.cj.day7;

import java.util.Scanner;

public class AtmSwitchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Withdraw 2. Change Password 3.Mini statement 4.Exit");
		int num = sc.nextInt();
		switch (num) {
		case  1:
			System.out.println("You clicked on withdraw method");
			break;
		case 2:
			System.out.println("You clicked on change password method");
			break;
		case 3:
			System.out.println("You clicked on mini statement");
			break;
		case 4: 
			System.out.println("Thank you visit agin...");
			break;
		default:
			break;
		}
		sc.close();
	}
}
