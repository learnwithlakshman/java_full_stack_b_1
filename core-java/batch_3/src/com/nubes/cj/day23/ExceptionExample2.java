package com.nubes.cj.day23;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

class Employee{
	String name;
	List<String> emails;
	public Employee(String name) {
		super();
		this.name = name;
	}
}

public class ExceptionExample2 {

		public static void main(String[] args) {
			
			Employee emp= new Employee("Lakshman");
			//Send email
			System.out.println("Hi "+emp.name);
			try {
			for(String mailid:emp.emails) {
				System.out.println(mailid);
				System.out.println("Body");
				System.out.println("Singature");
			}
			}catch (Exception e) {
				System.out.println("Email couldn't send "+emp.name+" reason "+emp.emails);
			}
			System.out.println("Main");
				try {
					Scanner sc = new Scanner(Paths.get("randomtext.txt"));
					StringBuffer sb = new StringBuffer();
					while(sc.hasNextLine()) {
						String data = sc.nextLine();
						sb.append(data.toUpperCase()).append("\n");
					}
		
					try(FileWriter fr = new FileWriter(new File("outputfile.text"))){
      					fr.write(sb.toString());
					}catch (IOException e) {
						System.out.println("While writing data into file :"+e);
					}
				//	System.out.println(sb.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			System.out.println("End of the main");
		}
		
}
