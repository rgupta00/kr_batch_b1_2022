package com.a.basics_oo.b.sol;

//encapsulation = data hiding + business contstrants 
public class Account {
	private int id;
	private String name;
	private double balance;

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public String toString() {
		// String foo="a"+"b"+"c"; String vs StringBuilder vs StringBuffer

		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=").append(id).append(", name=").append(name).append(", balance=").append(balance)
				.append("]");
		return builder.toString();
	}

}
