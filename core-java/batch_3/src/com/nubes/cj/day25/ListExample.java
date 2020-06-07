package com.nubes.cj.day25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {

		
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(1234);
			list.add(2345);
			list.add(4567);
			list.add(4563);
			list.add(4567);
			list.add(4567);
			list.add(null);
			list.add(null);
			
			for(int i=0;i<list.size();i++) {
				 Integer ret = list.get(i);
				 System.out.println(ret);
			}
			//For each
			for(Integer ele: list) {
				System.out.println(ele);
			}
			
			// Java8
			list.stream().forEach(ele->{
				System.out.println(ele);
			});
			
			// Iterator
			Iterator<Integer> iterator = list.iterator();
			
			while(iterator.hasNext()) {
				Integer ele = iterator.next();
				System.out.println(ele);
			}
			
		}
}
