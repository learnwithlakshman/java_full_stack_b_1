package com.nubes.cj.test.day7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nubes.cj.day7.NumberOperations;

public class NumberOperationsSpec {

	@Test
	public void primeWithValidPrime() {
		NumberOperations obj = new NumberOperations();
		boolean res = obj.isPrime(37);
		assertTrue(res);
	}

	@Test
	public void primeWithNotaPrime() {
		NumberOperations obj = new NumberOperations();
		boolean res = obj.isPrime(36);
		assertFalse(res);
	}

	@Test
	public void primeWithZero() {
		NumberOperations obj = new NumberOperations();
		boolean res = obj.isPrime(0);
		assertFalse(res);
	}

	@Test
	public void primeWithNNumber() {
		NumberOperations obj = new NumberOperations();
		boolean res = obj.isPrime(-10);
		assertFalse(res);
	}
	@Test
	public void reverseOfNumber() {
		NumberOperations obj = new NumberOperations();
		int num = obj.reverseOfNumber(123);
		assertEquals(321, num);
	}
	@Test
	public void reverseOfNumberWithSingleDigit() {
		NumberOperations obj = new NumberOperations();
		int num = obj.reverseOfNumber(9);
		assertEquals(9, num);
	}
	@Test
	public void reverseOfNumberWithNvalue() {
		NumberOperations obj = new NumberOperations();
		int num = obj.reverseOfNumber(-1000);
		assertEquals(0, num);
	}
}
