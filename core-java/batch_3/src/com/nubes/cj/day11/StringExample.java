package com.nubes.cj.day11;

public class StringExample {
	public static void main(String[] args) {
		String name = "CoreJava";
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat( " made eassy!"));
		System.out.println(name);
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		System.out.println(name.substring(0, 3)); //Upper bound -1
		
	}
}
