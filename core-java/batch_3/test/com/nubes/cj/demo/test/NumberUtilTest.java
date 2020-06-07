package com.nubes.cj.demo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nubes.cj.demo.NumberUtil;

class NumberUtilTest {

	@Test
	void biggestOfTwoNumbers() {
		NumberUtil obj = new NumberUtil();
		int res = obj.biggest(-10, -3);
		assertEquals(-3, res);
	}
	@Test
	void biggestOfTwoNumbersWithPNumbers() {
		NumberUtil obj = new NumberUtil();
		int res = obj.biggest(10, 3);
		assertEquals(10, res);
	}
	
	@Test
	void biggestOfThreeNumbersWithPNumbersA() {
		NumberUtil obj = new NumberUtil();
		int res = obj.biggest(10, 3,8);
		assertEquals(10, res);
	}
	@Test
	void biggestOfThreeNumbersWithPNumbersB() {
		NumberUtil obj = new NumberUtil();
		int res = obj.biggest(40,50,10);
		assertEquals(50, res);
	}
	@Test
	void biggestOfThreeNumbersWithPNumbersC() {
		NumberUtil obj = new NumberUtil();
		int res = obj.biggest(10, 15,20);
		assertEquals(20, res);
	}
	

}
