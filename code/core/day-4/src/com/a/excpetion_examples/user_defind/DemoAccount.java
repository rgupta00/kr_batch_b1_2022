package com.a.excpetion_examples.user_defind;

class Account {
	private int id;
	private String name;
	private double balance;

	private static String bankName="SBI";
	
	//staic method dont have this ref
	//u dont have to create the object before calling the method
	
	public static String getBankName() {
		return bankName;
	}
	
	// default ctr
	public Account() {
	}

	public void deposit(double amount) {
		double temp = balance + amount;
		if (temp > 1500000) {
			System.out.println("pls have current account....");
		} else {
			balance = temp;
		}
	}

	public void withdraw(double amount) {
		double temp = balance - amount;
		if (temp < 1000) {
			System.out.println("withdraw is not possible....");
		} else {
			balance = temp;
		}
	}

	public Account(int myId, String myName, double myBalance) {
		id = myId;
		name = myName;
		balance = myBalance;
	}

	public void print() {
		System.out.println("id :" + id);
		System.out.println("name: " + name);
		System.out.println("balance: " + balance);
	}
}

public class DemoAccount {

	public static void main(String[] args) {

		Account account = new Account(1, "RAJ", 67000.00);

		Account.getBankName();
		
		account.print();

		account.deposit(1000);
		System.out.println("-----------------");
		account.print();

	}

}
