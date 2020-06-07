package com.nubes.cj.day14;

public class Employee extends Object {

	private int empno;
	private String name;
	private double salary;
	private boolean status;

	public Employee(int empno, String name) {
		this(empno,name,25000,true);
	}
	public Employee(int empno, String name, double salary) {
		this(empno,name,salary,true);
	}
	
	public Employee(int empno, String name, double salary,boolean status) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.status = status;
	}

	// Setter and Getter

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void getPaySlip() {
		//Logic 
	}
	
}
