package com.lwl.cc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lwl.cc.service.CodingQuestionsService;

@SpringBootTest
class CodingchallengeApplicationTests {
	
	@Autowired
	private CodingQuestionsService codingService;

	
	@Test
	public void searchTestWithKey() {
		boolean res = codingService.search(new int[] {0,2,3,5,7,9,10,6},6);
		assertEquals(true, res);
	}
	
	@Test
	public void searchTestWithoutKey() {
		boolean res = codingService.search(new int[] {0,2,3,5,7,9,10,6},16);
		assertEquals(false, res);
	}

	@Test
	public void primeCountTest() {
		int res = codingService.countPrimes(new int[] {0,2,3,5,7,9,10,6});
		assertEquals(4, res);
	}
	
	@Test
	public void biggestOfThreeNumbersTrueFlase() {
		int res = codingService.biggest(12,9,13);
		assertEquals(13, res);
	}
	
	@Test
	public void biggestOfThreeNumberFaseTrue() {
		int res = codingService.biggest(12,13,9);
		assertEquals(13, res);
	}
	@Test
	public void biggestOfThreeNumbersFirstEleBothTrue() {
		int res = codingService.biggest(12,4,9);
		assertEquals(12, res);
	}
	
	@Test
	public void biggestOfThreeNumbersMiddleEle() {
		int res = codingService.biggest(2,14,9);
		assertEquals(14, res);
	}
	
	@Test
	public void biggestOfThreeNumbersThridEle() {
		int res = codingService.biggest(2,4,9);
		assertEquals(9, res);
	}
	
	
	
	
	

	
	@Test
	public void biggestOfNnumbers() {
		int res = codingService.biggest(2,3,5,7,9,10,6);
		assertEquals(10, res);
	}
	
}
