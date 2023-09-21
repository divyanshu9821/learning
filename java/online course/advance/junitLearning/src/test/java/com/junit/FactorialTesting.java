package com.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FactorialTesting {
	@Test
	public void factorialMethodUnitTestPositive() {
		assertAll(()->assertEquals(2, new Factorial().factorialMethod(2)),()->assertEquals(24, new Factorial().factorialMethod(4)),()->assertEquals(3628800, new Factorial().factorialMethod(10)));
	}
	
	@Test
	@Disabled
	public void factorialMethodUnitTestNegative() {
		assertAll(()->assertEquals(2, new Factorial().factorialMethod(6)),()->assertEquals(24, new Factorial().factorialMethod(8)));
	}
	
	
}
