package com.nubes.cj.day31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1001, "Krish");
		map.put(1004, "Jayesh");
		map.put(1005, "Ramesh");
		map.put(1001, "Charan");
		map.put(1010, null);
		
		
		System.out.println(map.get(1001));
		//1010 => JD
		if(map.get(1010)!=null) {
			map.put(1010,map.get(1010).toUpperCase());
		}else {
			map.put(1010,"JD");
		}
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
	
		for(Integer key:keys) {
			System.out.println(key+" = "+map.get(key));
		}
		
		Collection<String> values = map.values();
		for(String value:values) {
			System.out.println(value);
		}
		
		Set<Entry<Integer, String>> keyValueSet = map.entrySet();
		for(Entry<Integer,String> keyValue:keyValueSet) {
			System.out.println(keyValue.getKey()+" "+keyValue.getValue());
		}
		
		
	}
}
