package com.nubes.cj.day7;

import java.util.Scanner;

public class SwitchStatementExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2:");
		int num2 = sc.nextInt();
		System.out.println("Enter one of the +, -, *, /, % operator");
		sc.nextLine();
		String operator = sc.nextLine();
		
		int res = 0;
		switch (operator) {
		case "+":
			res = num1 + num2;
			//System.out.println(String.format("%d + %d is %d" ,num1,num2,res));
			System.out.println(num1+" + "+num2+" is "+res);
			break;
		case "-":
			res = num1 - num2;
			System.out.println(num1+" - "+num2+" is "+res);
			break;
		case "*":
			res = num1 * num2;
			System.out.println(num1+" * "+num2+" is "+res);
			break;
		case "/":
			res = num1 / num2;
			System.out.println(num1+" / "+num2+" is "+res);
			break;
		case "%":
			res = num1 - num2;
			System.out.println(num1+" % "+num2+" is "+res);
			break;
		default:
			System.out.println("Wrong input...");
			break;
		}
		sc.close();
		
	}
}
