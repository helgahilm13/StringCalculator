package is.ru.stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultiplesNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testMoreMultiplesNumbers() {
		assertEquals(15, Calculator.add("1,2,3,4,5"));
	}

	@Test
	public void testNewLine() {
		assertEquals(6, Calculator.add("1\n2\n3"));
	}

	@Test
	public void testBothNewLineAndCommas() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	/*@Test
	(expected = RuntimeException.class)
	public void testNegativeNumberException() {
    	assertEquals(Calculator.add("3,-6,15,18,46,33"));
	}*/

	@Test
	public void testNumbersBiggerThan1000() {
    	assertEquals(1015, Calculator.add("5,1000,1010,10,1500"));
	}

}