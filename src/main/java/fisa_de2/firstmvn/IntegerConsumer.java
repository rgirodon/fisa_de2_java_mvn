package fisa_de2.firstmvn;

public class IntegerConsumer {
	
	private IntegerProvider integerProvider;
	
	public IntegerConsumer(IntegerProvider integerProvider) {
		
		this.integerProvider = integerProvider;
	}

	public Integer consumeInteger() {
		
		Integer integer1ToConsume = this.integerProvider.provideInteger();
		
		Integer integer2ToConsume = this.integerProvider.provideInteger();
		
		return 2 * (integer1ToConsume + integer2ToConsume); 
	}
}
