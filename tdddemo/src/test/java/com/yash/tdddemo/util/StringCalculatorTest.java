package com.yash.tdddemo.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_Calculate_GivenEmptyString_ShouldReturnZeroAsNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.calculate("");
		assertEquals(0, result);
	}
	public void test_Calculate_Given1AsInput_ShouldReturn1AsNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.calculate("1");
		assertEquals(1, result);
	}

}
