package com.nubes.cj.day11;

public class StringExample2 {
	public static void main(String[] args) {
		String data = "Lakshman,Krish , Suresh , Mahesh, Jayes, Ramesh, balu, kiRan Kumar";
		String[] names = data.split(",");
		for(String name:names) {
			name = name.trim().toUpperCase();
			System.out.println(name.substring(0,3));
			System.out.println(name.substring(name.length()-3));
		}
	}
}
