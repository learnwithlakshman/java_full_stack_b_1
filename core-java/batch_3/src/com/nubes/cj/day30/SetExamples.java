package com.nubes.cj.day30;

import java.util.HashSet;
import java.util.Set;

class Employee{
	int empno;
	String name;
	float salary;
	public Employee(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empno != other.empno)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class SetExamples {

		public static void main(String[] args) {
			Employee e1 = new Employee("Krish");
			Employee e2 = new Employee("Krish");
			Employee e3 = new Employee("Manoj");
			Employee e4 = new Employee("Manoj");
			Set<Employee> set = new HashSet<>();
			set.add(e1);
			set.add(e2);
			set.add(e3);
			set.add(e4);
			System.out.println(set.size());
			
		}
}
