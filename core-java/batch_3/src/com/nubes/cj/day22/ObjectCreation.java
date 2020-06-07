package com.nubes.cj.day22;

class Employee  implements Cloneable{
	
	String name;
	float salary;
	
	public Employee(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void increment(float amount) {
		salary = salary + amount;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
	
}
public class ObjectCreation {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Rajesh",45000);
		System.out.println(emp1);
		emp1.increment(5000);
		System.out.println(emp1);
		
		try {
			Employee emp2 =  emp1.clone();
			emp2.increment(9999);
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp1 == emp2);
			System.out.println("Welcome to java world");
			
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
}
