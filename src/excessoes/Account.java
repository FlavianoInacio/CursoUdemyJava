package excessoes;

public class Account {
	
	private Integer number;
	private String houlder; 
	private Double balance;
	private Double WithDrawLimit;
	
	public Account(Integer number, String houlder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.houlder = houlder;
		this.balance = balance;
		WithDrawLimit = withDrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHoulder() {
		return houlder;
	}
	public void setHoulder(String houlder) {
		this.houlder = houlder;
	}
	public Double getWithDrawLimit() {
		return WithDrawLimit;
	}
	public void setWithDrawLimit(Double withDrawLimit) {
		WithDrawLimit = withDrawLimit;
	}
	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	public void withDraw(Double amount) throws DomainException {
		if(amount>balance) {
			throw new DomainException("Not Enough Balance");
		}
		if(amount>WithDrawLimit) {
			throw new DomainException("The ammount Exceeds WithDraw Limit");
		}
		this.balance -= amount;
	}
	
	
}
