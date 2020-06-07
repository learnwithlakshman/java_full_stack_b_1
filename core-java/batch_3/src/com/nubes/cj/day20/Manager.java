package com.nubes.cj.day20;

interface One{
	public static final int a = 45;
	void m1();
	void m2();
}
interface Two extends One{
	void m3();
}

interface Four{
	void show();
}

abstract class ClsOne implements One{
	public void m1() {
		
	}
}
class ClsTwo extends ClsOne implements One,Two{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Manager {
	public static void main(String[] args) {
		One obj = new ClsTwo();
		obj.m1();
		obj.m2();
	
	}
}
