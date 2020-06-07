package com.nubes.cj.test.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nubes.cj.day10.ArrayOperations;

public class ArrayOperationSpec {
		
		@Test
		public void biggestElement() {
			ArrayOperations obj = new ArrayOperations();
			int[] arr = {2,3,4,5,6,1,0,9};
			int res = obj.biggestElement(arr);
			assertEquals(9, res);
			
		}
		@Test
		public void biggestElementWithSameValues() {
			ArrayOperations obj = new ArrayOperations();
			int[] arr = {9,9,9,9,9,9,9};
			int res = obj.biggestElement(arr);
			assertEquals(9, res);
			
		}
		@Test
		public void biggestElementWithNnumbers() {
			ArrayOperations obj = new ArrayOperations();
			int[] arr = {-10,-1,-2,-9,-5};
			int res = obj.biggestElement(arr);
			assertEquals(-1, res);
			
		}
}
