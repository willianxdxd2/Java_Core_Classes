package entities;

import exceptions.ZeroBalance;
import exceptions.NoBalance;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Account() {

	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	public void withdraw(Double amount) throws NoBalance, ZeroBalance {
		if (amount > withdrawLimit) {
			
			throw new NoBalance("passou do limite /limit pass");
			
		}
		if(balance < amount) {
			throw new ZeroBalance("passou do limite /limit pass");
		}
			
			
		balance -= amount;
		
			
	}	
	
}
