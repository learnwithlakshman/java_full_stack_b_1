package com.nubes.cj.day24;

public class Driver {
	public static void main(String[] args) {
		//TODO
		try {
			checkPassword();
		}catch (MaxAttemptsReachedException e) {
			System.out.println(e);
		}
		//TODO
	}
	
	private static void checkPassword() {
		for(int i=0;i<4;i++) {
			//Validation
			System.out.println(i);
			if(i==3) {
				throw new MaxAttemptsReachedException("You have reached max number of attempts");
			}
		}
	}
}
