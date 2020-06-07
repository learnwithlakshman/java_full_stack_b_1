package com.nubes.cj.day28;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
	public static void main(String[] args) {
		List<Integer> list = Stream.of(1,2,3,4,5,6,7,8,9,2,3,4,5,6,7,8,9).collect(Collectors.toList());
    	List<Integer> list_div_3 = list.stream()
    			                        .filter(ele->ele%3==0)
    			                        .collect(Collectors.toList());
		
    	// Get me all the even number and multiply with 3 return the list
    	
    	List<Integer> numlist = list.stream().filter(ele->ele % 2 == 0).map(e->e*3).collect(Collectors.toList());
    	
    	IntSummaryStatistics obj = list.stream().mapToInt(e->e).summaryStatistics();
    	
    	System.out.println(obj);
    	System.out.println(numlist);
    	System.out.println(list_div_3);
		
	}
}
