package com.nubes.cj.day16.modifiers.one;

public class Two {
	
		public void show() {
			One obj = new One();
			System.out.println("Public:" + obj.pub_a);
			System.out.println("Protected:" + obj.pro_a);
			System.out.println("Default:" + obj.def_a);
			//System.out.println("Private:" + obj.pri_a);
		}
}
