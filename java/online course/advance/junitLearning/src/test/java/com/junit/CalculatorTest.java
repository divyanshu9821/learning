package com.junit;

import static org.junit.jupiter.api.Assertions.assertAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	static Calculator cal;

	@BeforeAll
	static void beforAllInit() {
		cal = new Calculator();
	}

	@Test
	void testAddition() {
		assertEquals(30, cal.add(10, 20)); // (expected value, actual value);
	}

	@Test
	void testSubtract() {
		assertEquals(30, cal.sub(50, 20));
	}

	@Test

	void testMultiplication() {
		assertAll(() -> assertEquals(12, cal.mul(3, 4)), () -> assertEquals(100, cal.mul(10, 10)),
				() -> assertEquals(120, cal.mul(2, 6)));
	}

	@Test
	void testDivision() {
		assertEquals(0, cal.div(10, 0));
	}
}
