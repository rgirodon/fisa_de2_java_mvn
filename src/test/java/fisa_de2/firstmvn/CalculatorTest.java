package fisa_de2.firstmvn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator;
	
	@BeforeEach
	public void init() {
		this.calculator = new Calculator();
	}
	
	@Test
	void testAdd() {
		assertEquals(5, calculator.add(3, 2));
	}

	@Test
	void testMinus() {
		assertEquals(5, calculator.minus(13, 8));
	}
	
	@Test
	void testMultiply() {
		assertEquals(15, calculator.multiply(3, 5));
	}
	
	@Test
	void testDivide() {
		assertEquals(6, calculator.divide(42, 7));
	}
	
	@Test
	void testDivideByZero() {
		assertThrows(IllegalArgumentException.class, () -> calculator.divide(42, 0));
	}
}
