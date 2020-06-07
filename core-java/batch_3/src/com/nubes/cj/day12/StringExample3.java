package com.nubes.cj.day12;

public class StringExample3 {
	public static void main(String[] args) {
//		String data = "Venkat -venkat.v@wipro.com, Lakshman-lakshman.a@gmail.com, Haritha-haritha.h@gmail.com";
//		String[] nameAndEmails = data.split(",");
//		
//		for(String nameAndEmail:nameAndEmails) {
//			String arr[] = nameAndEmail.split("-");
//			String name = arr[0].trim();
//			String email = arr[1].trim();
//	    	System.out.println("Sending email to :"+email);
//			System.out.println("Hi "+name+",\n Thanks for attending Java Full Stack Session\n");
//			
//		}
		

		
		String email = "lakshman.a@gmail.com";
		int atIndex = email.indexOf("@");
		int dotIndex = email.lastIndexOf(".");
		
		if(atIndex != -1) {
			if(dotIndex !=-1 && dotIndex > atIndex) {
				System.out.println("Valid");
			}else {
				System.out.println("Not valid email");
			}
		}else {
			System.out.println("Not valid email");
		}
		
	}
}
