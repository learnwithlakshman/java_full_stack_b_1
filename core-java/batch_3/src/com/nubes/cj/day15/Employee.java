package com.nubes.cj.day15;

public class Employee extends Object{
		
		private Integer empno;
		private String ename;
		private Double salary;
		
		public Integer getEmpno() {
			return empno;
		}

		public void setEmpno(Integer empno) {
			this.empno = empno;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}
		@Override
		public String toString(){
			return String.format("[Empno : %d , Ename : %s and Salary : %f]",empno,ename,salary);
		}
				
}
