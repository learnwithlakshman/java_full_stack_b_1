package com.nubes.cj.day16;

public class Manager {

		public static void main(String[] args) {
			Product p1= new Product(1001, "Lenovo ThinkPad", 56756);
			Product p2= new Product(1001, "Lenovo ThinkPad", 56756);
			Product p3= new Product(1003, "HP", 71566);
			Product p4= new Product(1004, "Dell Latitude", 75660);
			
			System.out.println(p1 == p2);
			System.out.println(p1.equals(p2));
		}
}
