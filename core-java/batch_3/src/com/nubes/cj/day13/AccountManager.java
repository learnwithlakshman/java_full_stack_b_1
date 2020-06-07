package com.nubes.cj.day13;

public class AccountManager {
		public static void main(String[] args) {
		
			Account acc1 = new Account(1001, "Nirmala", 10000);
			Account acc2 = new Account(1002, "Sai", 20000);
			Account acc3 = new Account(1003, "Tanvi", 90000);
			Account acc7 = new Account(1001, "Nirmala", 10000);
			Account acc8 = new Account(1002, "Sai", 20000);
			Account acc4 = new Account(1003, "Tanvi", 90000);
			
		
			Account[] accounts = {acc1,acc2,acc3,acc7,acc8,acc4};
			
			for(Account account:accounts) {
				account.showInfo();
				System.out.println("---------------------");
			}
			
			
	}
}
