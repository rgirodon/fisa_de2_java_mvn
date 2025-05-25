package fisa_de2.firstmvn;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class IntegerConsumerTest {

	@Test
	void testConsumeIntegerWithMockito() {
		
		IntegerProvider mockedIntegerProvider = mock(IntegerProvider.class);
	
		when(mockedIntegerProvider.provideInteger()).thenReturn(24);
		
		IntegerConsumer integerConsumer = new IntegerConsumer(mockedIntegerProvider);
		
		assertEquals(48, integerConsumer.consumeInteger());
	}
}
