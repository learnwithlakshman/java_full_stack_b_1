package com.nubes.cj.day17;

public class SavingsAccount extends Account {
	
		private double min_balance;
		
		public SavingsAccount(int accno,String name,double balance,double min_balance) {
			super(accno,name,balance);
			this.min_balance = min_balance;
			System.out.println("Savings class constructor");
		}
		@Override
		public void withdraw(double amount) {
			if(amount <= balance - min_balance) {
				balance -= amount;
			}else {
				System.out.println("Sorry! insufficient balance");
			}
		}
		@Override
		public String showInfo() {
			return  super.showInfo()+" \\nSavingsAccount [Min_balance:"+min_balance+"]";
		}
	
}
