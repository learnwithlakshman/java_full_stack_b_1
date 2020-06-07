package com.nubes.cj.day19;

public class TypeCasting {
		
		static String data = "1001-Krish-37-5.4,1002-Sai-37-5.9,1003-Manoj-38-5.8";
	
		public static void main(String[] args) {
				
				String[] dataArr = data.split(",");
				Employee[] arr = new Employee[dataArr.length];
				int i=0;
				for(String s:dataArr) {
					String[] empArr = s.split("-");
					int empno = Integer.parseInt(empArr[0]);
					String ename = empArr[1];
					int age = Integer.parseInt(empArr[2]);
					float height = Float.parseFloat(empArr[3]);
					Employee emp = new Employee(empno, ename, age, height);
					arr[i++]=emp;
					
				}
				for(Employee e :arr) {
					System.out.println(e);
				}
		
				System.out.println(args.length);
				//name age height isworking 
				String name = args[0];
				int age = Integer.parseInt(args[1]);
				float height = Float.parseFloat(args[2]);
				boolean working = Boolean.parseBoolean(args[3]);
				
				System.out.println(String.format("%s %s %s %s", name,age,height,working));
				int a = 100;
				float b = a;
				
				// byte < short < int < float
				
				System.out.println(a);
				System.out.println(b);
				
				float c = 100.5f;
				int d = (int)c;
				System.out.println(c);
				System.out.println(d);
				
				//	String name = "123.5f";
			
				try {
					float num = Float.parseFloat(name);
					System.out.println(num);
				}catch (Exception e) {
					System.out.println("Invlid input, please check....");
				}
				
				Integer int_val1 = 100;
				int int_val2 = int_val1;
				
				
		}
}
