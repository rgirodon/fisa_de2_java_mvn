package fisa_de2.firstmvn;

public class IntegerConsumer {
	
	private IntegerProvider integerProvider;
	
	public IntegerConsumer(IntegerProvider integerProvider) {
		
		this.integerProvider = integerProvider;
	}

	public Integer consumeInteger() {
		
		Integer integerToConsume = this.integerProvider.provideInteger();
		
		return 2 * integerToConsume; 
	}
}
