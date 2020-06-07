package com.nubes.cj.day18;

class A {
	public void myOwnMethodIsHere() {
		System.out.println("AM1");
	}
	public final void m2() {
		System.out.println("AM2");
	}
}

class B extends A {
	
	@Override
	public void myOwnMethodIsHere() {
		System.out.println("BM1");
		
	}
}

public class FinalKeywordExample {
	public static void main(String[] args) {
			A obj = new B();
			obj.myOwnMethodIsHere();
	}
}
