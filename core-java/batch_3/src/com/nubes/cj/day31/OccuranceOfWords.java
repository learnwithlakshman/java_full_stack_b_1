package com.nubes.cj.day31;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWords {
	public static void main(String[] args) {
		String data = "A,B,A,C,D,E,F,G,C,D,E,F,G,C,D,E,F,G,C,D,E,F,G,L,M,N,O,C,D,E,F,G,L,M,N,O,X,Y,Z";

		String arr[] = data.split(",");
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String ele : arr) {
			if (map.get(ele) == null) {
				map.put(ele, 1);
			} else {
				map.put(ele, map.get(ele) + 1);
			}
		}
		System.out.println(map);
	}
}
