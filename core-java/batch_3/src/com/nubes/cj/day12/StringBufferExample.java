package com.nubes.cj.day12;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("buffering");
		sb.replace(2, 7, "BUFFER");
		sb.delete(2, 7);
		System.out.println(sb.substring(1,5));
		
	}
	
}
