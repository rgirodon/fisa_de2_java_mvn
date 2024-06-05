package fisa_de2.firstmvn;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;


public class MockitoTest {

	@Test
	void testWithMockito() {
		
		List<String> mockedList = mock(List.class);
		
		when(mockedList.get(0)).thenReturn("first");
		
		assertEquals("first", mockedList.get(0));
	}
}
