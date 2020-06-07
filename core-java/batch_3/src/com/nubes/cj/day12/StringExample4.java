package com.nubes.cj.day12;

public class StringExample4 {
	public static void main(String[] args) {

				String data = "I am  learning java";
				
				System.out.println(data.substring(4).substring(0,11).trim().toUpperCase().substring(0, 5));
				System.out.println(data);
				
				String name1 = "Krishna";
				String name2 = "Krish".concat("na");
	
				System.out.println(name1 == name2);
				System.out.println(name1.equals(name2));
	}
}
