package com.nubes.cj.day20;

abstract class Account {
	int balance = 656789;

	public abstract double calInterest();

	public void showBalance() {
		double intAmout = calInterest();
		System.out.println(intAmout + balance);
	}
}

class Savings extends Account {

	@Override
	public double calInterest() {
		// TODO
		return 9000;
	}
	
}

class Current extends Account {

	@Override
	public double calInterest() {
		// TODO
		return 15000;
	}

}

public class AccountManager {
	public static void main(String[] args) {
			Account acc = new Savings();
			acc.showBalance();
	}
}
