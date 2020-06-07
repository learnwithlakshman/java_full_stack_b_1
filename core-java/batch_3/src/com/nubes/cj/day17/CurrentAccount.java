package com.nubes.cj.day17;

public class CurrentAccount extends Account {

	private double over_draft;;

	public CurrentAccount(int accno, String name, double balance,double over_draft) {
		super(accno, name, balance);
		this.over_draft = over_draft;
		System.out.println("Current account constructor");
	}
	@Override
	public void withdraw(double amount) {
		if (amount <= balance + over_draft) {
			balance -= amount;
		} else {
			System.out.println("Sorry! insufficient balance");
		}
	}

	@Override
	public String toString() {
		return "CurrentAccount [accno=" + accno + ", name=" + name + ", balance=" + balance + ", over_draft="
				+ over_draft + "]";
	}

}
