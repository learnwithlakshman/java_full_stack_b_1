package com.nubes.cj.day11;
public class StringExample1 {
	public static void main(String[] args) {
			
				String name1 = "Lakshman";
				String name2 = "Lakshman";
				String name3 = new String("Lakshman");
				String name4 = new String("Lakshman");
				
//				System.out.println(name1==name2);
//				System.out.println(name3==name4);
//				System.out.println(name1==name3);
//				
//				System.out.println(name1.equals(name2));
//				System.out.println(name1.equals(name3));
				System.out.println(name1);
				name1 = name1.concat(" A");
				System.out.println(name1.concat(" A"));
				System.out.println(name1);
				
	}
}
