package com.nubes.cj.day32;

import java.lang.reflect.Method;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Employee{
	private int empno;
	private String name;
	
	private void show() {
		
	}
}
public class RefelctionAPI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class name:");
		String clsName = sc.nextLine();
				
		try {
			Class cls = Class.forName(clsName);
			Method methods[]=cls.getDeclaredMethods();
			for(Method m:methods) {
				System.out.println(m);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
