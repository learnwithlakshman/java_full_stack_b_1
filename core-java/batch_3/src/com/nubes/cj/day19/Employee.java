package com.nubes.cj.day19;
public class Employee{
	private int empno;
	private String ename;
	private int age;
	private float height;

	public Employee(int empno, String ename, int age, float height) {
		this.empno = empno;
		this.ename = ename;
		this.age = age;
		this.height = height;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", age=" + age + ", height=" + height + "]";
	}
	
}