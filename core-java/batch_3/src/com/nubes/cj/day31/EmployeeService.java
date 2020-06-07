package com.nubes.cj.day31;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	
		private List<Employee> empList = FileReaderUtil.getEmployeesFromFile();
		

		public Employee getEmployee(int empno) {
			/*
			 * for(Employee emp:empList) { if(emp.getEmpno() == empno) { return emp; } }
			 * return null;
			 */
			
			return empList.stream().filter(e->e.getEmpno() == empno).findFirst().orElse(null);
		}
		public List<Employee> getAllEmployees(){
			return empList;
		}
		public List<Employee> getEmployeesByDept(Dept dept){
//			List<Employee> deptEmpList = new ArrayList<Employee>();
//			for(Employee emp:empList) {
//				if(emp.getDept() == dept) {
//					deptEmpList.add(emp);
//				}
//			}
//			return deptEmpList;
			
			return empList.stream().filter(e->e.getDept()==dept).collect(Collectors.toList());
			
			
		}
}
