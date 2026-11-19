package mylab.bank.entity;

import mylab.bank.exception.InsufficientBalanceException;
import mylab.bank.exception.WithdrawalLimitExceededException;

public class CheckingAccount extends Account {
	
	private double withdrawalLimit;
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accountNumber, String ownerNumber, double balance, double withdrawalLimit) {
		super(accountNumber, ownerNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
		
	}
	
	public double getWithdrawalLimit() {
		return this.withdrawalLimit;
	}
	
	@Override
	public void withdraw(double balance) throws InsufficientBalanceException {
		if(this.getBalance() < balance) {
			throw new InsufficientBalanceException("잔액이 부족합니다. 햔재잔액은 " + this.getBalance());
		}
		if(this.withdrawalLimit < balance) {
			throw new WithdrawalLimitExceededException("출금 한도를 초과했습니다. 한도: " + this.withdrawalLimit);
		}
		super.withdraw(balance);
	}
	
	@Override
	public String toString() {
		return "계좌번호: " + this.getAccountNumber() + ", 소유자: " + this.getOwnerName()
		+ ", 잔액: " + this.getBalance() + "원" + ", 출금 한도: " + this.withdrawalLimit + "원";
	}
	

}
