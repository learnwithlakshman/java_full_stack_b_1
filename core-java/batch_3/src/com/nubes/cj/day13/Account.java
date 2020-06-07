package com.nubes.cj.day13;

public class Account {
	
		private int accno;
		private String name;
		private double balance;
		
		public Account() {
			this.accno = 0;
			this.name = null;
			this.balance = 0.0;
		}
		public Account(int accno,String name,double balance) {
			this.accno = accno;
			this.name = name;
			this.balance = balance;
			
		}
		
		public void deposite(double amount) {
			balance += amount;
		}
		public void withDraw(double amount) {
			balance -= amount;
		}
		public void showInfo() {
			System.out.println("Account Number:"+accno);
			System.out.println("Name: "+name);
			System.out.println("Balance: "+balance);
		}
		

}
