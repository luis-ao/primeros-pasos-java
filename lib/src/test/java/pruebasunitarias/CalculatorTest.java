package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calculator = new Calculator();

	@Test
	void addition () {
		assertEquals(8, calculator.addNumbers(5, 3));
	}
	
	@Test
	void subtraction () {
		assertEquals(5, calculator.subtractNumbers(8, 3));
	}
	
	@Test
	void divideNumbers () {
		assertEquals(0, calculator.subtractNumbers(4, 4));
	}
	
	@Test
	void multiplication () {
		assertEquals(16, calculator.multiplyNumbers(4, 4));
	}
	
}
