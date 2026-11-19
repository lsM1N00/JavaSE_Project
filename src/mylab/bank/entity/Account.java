package mylab.bank.entity;

import mylab.bank.exception.InsufficientBalanceException;

public class Account {
	private String accountNumber;
	private String ownerName;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(String accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double balance) {
		this.balance += balance;
		System.out.println(balance + "원이 입금되었습니다. 현재 잔액: " + this.balance);
	}
	
	public void withdraw(double balance) throws InsufficientBalanceException {
		this.balance -= balance;
		System.out.println(balance + "원이 출금되었습니다. 현재 잔액: " + this.balance);
	}
	
	@Override
	public String toString() {
		return "계좌번호: " + this.getAccountNumber() + ", 소유자: " + this.getOwnerName()
				+ ", 잔액: " + this.getBalance() + "원" ;
	}
	
}
