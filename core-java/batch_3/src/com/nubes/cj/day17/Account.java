package com.nubes.cj.day17;

public class Account {

		int accno;
		String name;
		double balance;
		
		public Account(int accno,String name,double balance) {
			this.accno = accno;
			this.name = name;
			this.balance = balance;
			System.out.println("Account class constructor");
		}
		
		public void withdraw(double amount) {
			if(amount <= balance) {
				balance -= amount;
			}else {
				System.out.println("Sorry! insufficient balance");
			}
		}
		public void deposite(double amount) {
			balance += amount;
		}
		public double accBalance() {
			return this.balance;
		}
		
		
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
	
		public String showInfo() {
			return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
		}
		
}
