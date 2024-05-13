package fisa_de2.firstmvn;

public class Calculator {

	public int add(int i1, int i2) {
		
		return i1 + i2;
	}
	
	public int minus(int i1, int i2) {
		
		return i1 - i2;
	}
	
	public int multiply(int i1, int i2) {
		
		return i1 * i2;
	}
	
	public int divide(int i1, int i2) {
		
		if (i2 != 0) {
			return i1 / i2;
		}
		else throw new IllegalArgumentException("Division by 0");
	}
}
