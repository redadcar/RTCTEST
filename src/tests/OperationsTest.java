package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import calculators.Operations;

public class OperationsTest {

	@Test
	public void testSum() {
		int number1 = 2;
		int number2 = 2;
		int expectedResult = 4;
		int result = Operations.sum(number1, number2);
		
		assertEquals("Should be 4.",expectedResult, result);
	}
	
	@Test
	public void testSubtraction() {
		int number1 = 8;
		int number2 = 4;
		int expectedResult = 4;
		int result = Operations.subtract(number1, number2);
		
		assertEquals("Should be 4.",expectedResult, result);
	}

}
