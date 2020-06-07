package com.nubes.cj.day19;

public class Manager {
	
	public static class Inner{
		
	}
	public static void main(String[] args) {
		Person raj = new Person("Rajesh", 34);
		Person joy = new Person("Joy", 24);
		Person pha = new Person("Phani", 38);
		
		System.out.println(Person.getCount());
	}
}
