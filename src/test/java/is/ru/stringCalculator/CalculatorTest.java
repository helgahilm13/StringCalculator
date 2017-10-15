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
	public void testNewLineWithNumbers() {
		assertEquals(6, Calculator.add("1\n2\n3"));
	}


}