package com.nubes.cj.day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListExample {
	public static void main(String[] args) {
		String data = "Krish,Manoj,Suresh,Rajesh,Jayesh,Charan";
		
		List<String> namesList = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		list.add("Mani");
		list.add("Balu");
		
		for(String name:data.split(",")) {
			namesList.add(name);
		}
		
		System.out.println("Size :"+namesList.size());
		namesList.add("Pawan");
		System.out.println("Size :"+namesList.size());
		
		//Rani
		int index = namesList.indexOf("Rajesh");
		System.out.println(index);
		namesList.add(index+1,"Rani");
		System.out.println(namesList);
		
		namesList.addAll(list);
		System.out.println(namesList);
		
		namesList.remove("Rajesh");
		System.out.println(namesList);
		Collections.sort(namesList);
	    System.out.println(namesList);
	}
}
