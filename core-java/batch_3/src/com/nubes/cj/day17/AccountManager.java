package com.nubes.cj.day17;

public class AccountManager {

		public static void main(String[] args) {
			Account acc = new SavingsAccount(1001,"Krish",9000,1000);
			System.out.println(acc.showInfo());
			
			
		}
}
