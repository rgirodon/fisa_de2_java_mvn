package fisa_de2.firstmvn;

public class Money2 {

	private int amount;
	
	private String currency;

	public Money2(int amount, String currency) throws IllegalArgumentException {
		
		if (currency == null) {
			
			throw new IllegalArgumentException();
		}
		
		this.amount = amount;
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}
	
	public Money2 add(Money2 otherMoney) throws IllegalArgumentException {
		
		if (!this.getCurrency().equals(otherMoney.getCurrency())) {
			
			throw new IllegalArgumentException();
		}
		
		return new Money2(this.amount + otherMoney.getAmount(), this.getCurrency());
	}		
}
