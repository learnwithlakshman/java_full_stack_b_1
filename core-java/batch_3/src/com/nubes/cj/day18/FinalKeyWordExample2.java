package com.nubes.cj.day18;

import java.util.Arrays;

class Employee {
	private int empno;
	private String ename;
	double salary;
	private final int W_HOURS;

	public Employee(int empno,String ename,int hours) {
		this(empno,ename,0,hours);
	}

	public Employee(int empno,String ename,double salary,int hours) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		W_HOURS = hours;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", W_HOURS=" + W_HOURS + "]";
	}
	
}

public class FinalKeyWordExample2 {
	public static void main(final String[] args) {
		
		int a = 10;
		increment(a);
		
		Employee emp = new Employee(1001, "Rajesh", 65434, 8);
		System.out.println(emp);
		show(emp);
		System.out.println(emp);
	}
	
	private static int getMax(final int[] arr) {
		//arr = new int[] {};
		arr[2] = 100;
		System.out.println(Arrays.toString(arr));
		return 0;
	}
	
	private static void show(final Employee employee) {
	
		System.out.println(employee);
	}
	private static void increment(int num) {
		System.out.println(num);
		num++;
		System.out.println(num);
	}
}
