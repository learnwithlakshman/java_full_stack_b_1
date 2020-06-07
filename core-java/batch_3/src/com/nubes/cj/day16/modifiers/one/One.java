package com.nubes.cj.day16.modifiers.one;

public class One {

	private int pri_a = 100;
	public int pub_a = 200;
	protected int pro_a = 300;
	int def_a = 400;

	public void show() {
		System.out.println("Public:" + pub_a);
		System.out.println("Protected:" + pro_a);
		System.out.println("Default:" + def_a);
		System.out.println("Private:" + pri_a);
	}

}
