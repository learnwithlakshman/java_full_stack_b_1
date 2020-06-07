package com.nubes.cj.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import static java.util.Comparator.*;
@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee {
	
	private String name;
	private int age;
	private float salary;
	

		
}

public class CollectionExample {
	public static void main(String[] args) {

			List<Employee> list = new ArrayList<>();
			Employee emp3= new Employee("Manoj", 37, 95000);
			Employee emp2= new Employee("Krish", 36, 85000);
			Employee emp1= new Employee("Rajesh", 23, 45000);
			Employee emp4= new Employee("Lakshman", 28, 45000);
			list.add(emp2);
			list.add(emp3);
			list.add(emp1);
			list.add(emp4);
//			Collections.sort(list,(e1,e2)->e1.getName().compareTo(e2.getName()));
//			list.stream().forEach(System.out::println);
//			list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(ele->{
//				System.out.println(ele.getName());
//			});
//			
//			list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge).thenComparing(Employee::getAge));
//			list.stream().forEach(System.out::println);
			
			list.stream().filter(e->e.getSalary()>50000).map(e->e.getName()).forEach(e->{
				System.out.println(e);
			});
			
	}
}
