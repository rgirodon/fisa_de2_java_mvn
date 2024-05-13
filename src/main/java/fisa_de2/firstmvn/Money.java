package fisa_de2.firstmvn;

public class Money {

	private int amount;
	
	private String currency;

	public Money(int amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}
	
	public Money add(Money otherMoney) {
		
		if (this.getCurrency() == null
				|| otherMoney == null
				|| otherMoney.getCurrency() == null
				|| !otherMoney.getCurrency().equals(this.getCurrency()))  {
			
			return this;
		}
		else {
			
			return new Money(this.amount + otherMoney.getAmount(), this.getCurrency());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		return true;
	}
	
	
}
