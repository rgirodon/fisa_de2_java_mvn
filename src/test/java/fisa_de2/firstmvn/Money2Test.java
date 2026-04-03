package fisa_de2.firstmvn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Money2Test {

	private Money2 money2;
	
	@Test
	public void testCorrectInstanciation() {
		
		this.money2 = new Money2(10, "EUR");
		
		assertEquals(10, this.money2.getAmount());
		
		assertEquals("EUR", this.money2.getCurrency());
	}
	
	@Test
	public void testWrongInstanciation() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			
			this.money2 = new Money2(10, null);
		});

	}
	
	@Test
	public void testCorrectAdd() {
		
		this.money2 = new Money2(10, "EUR");
		
		Money2 money3 = new Money2(20, "EUR");
		
		Money2 result = this.money2.add(money3);
		
		assertEquals(30, result.getAmount());
		
		assertEquals("EUR", result.getCurrency());
	}
	
	@Test
	public void testWrongAdd() {
		
		this.money2 = new Money2(10, "EUR");
		
		Money2 money3 = new Money2(20, "DOLLAR");
				
		assertThrows(IllegalArgumentException.class, () -> {
			
			Money2 result = this.money2.add(money3);
		});
	}
}
