package fisa_de2.firstmvn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoneyTest {

	private Money money;
	
	@BeforeEach
	public void init() {
		this.money = new Money(10, "EUR");
	}
	
	@Test
	void testAddWithNullParam() {
		
		Money result = this.money.add(null);
		
		assertEquals(this.money, result);
	}

	@Test
	void testAddWithNullCurrency() {
		
		Money result = this.money.add(new Money(20, null));
		
		assertEquals(this.money, result);
	}
	
	@Test
	void testAddWithIncorrectCurrency() {
		
		Money result = this.money.add(new Money(20, "USD"));
		
		assertEquals(this.money, result);
	}
	
	@Test
	void testAddWithCorrectCurrency() {
		
		Money result = this.money.add(new Money(20, "EUR"));
		
		assertEquals(new Money(30, "EUR"), result);
	}
}
