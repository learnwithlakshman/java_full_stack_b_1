package com.nubes.cj.day19;

public class Person {
	
	private String name;
	private int age;
	private static int count;
	public static final String C_NAME="India";
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
