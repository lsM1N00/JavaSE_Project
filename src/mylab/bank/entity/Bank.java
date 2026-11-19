package mylab.bank.entity;

import java.util.ArrayList;
import java.util.List;

import mylab.bank.exception.AccountNotFoundException;
import mylab.bank.exception.InsufficientBalanceException;

public class Bank {
	private List<Account> accounts = new ArrayList<>();
	private int nextAccountNumber = 1000;
	
	public Bank() {
		
	}
	
	public String createSavingsAccount(String name, double balance, double interestRate) {
		SavingsAccount savingAccount = new SavingsAccount("AC"+ nextAccountNumber, name, balance, interestRate);
		accounts.add(savingAccount);
		this.nextAccountNumber += 1;
		System.out.print("Saving(저축) 계좌가 생성되었습니다: ");
		System.out.println(savingAccount.toString());
		
		return savingAccount.getAccountNumber();
	}
	
	public String createCheckingAccount(String name, double balance, double withdrawalLimit) {
		CheckingAccount createCheckingAccount = new CheckingAccount("AC"+ nextAccountNumber, name, balance, withdrawalLimit);
		accounts.add(createCheckingAccount);
		this.nextAccountNumber += 1;
		System.out.print("체킹 계좌가 생성되었습니다: ");
		System.out.println(createCheckingAccount.toString());
		
		return createCheckingAccount.getAccountNumber();
	}
	
	public Account findAccount(String accountNumber) throws AccountNotFoundException {
		for(Account account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		throw new AccountNotFoundException("계좌번호 " + accountNumber + "에 해당하는 계좌를 찾을 수 없습니다.");
		
	}
	
	public void deposit(String accountNumber, double balance) throws AccountNotFoundException {
		Account account = findAccount(accountNumber);
		account.deposit(balance);
	}
	
	public void withdraw(String accountNumber, double balance) throws AccountNotFoundException, InsufficientBalanceException {
		Account account = findAccount(accountNumber);
		account.withdraw(balance);
	
	}
	
	public void transfer(String accountNumber, String accountNumber2, double balance) throws AccountNotFoundException, InsufficientBalanceException {
		Account act1 = findAccount(accountNumber);
		Account act2 = findAccount(accountNumber2);
		act1.withdraw(balance);
		act2.deposit(balance);
		
	}
	
	public void printAllAccounts() {
		for(Account a : accounts) {
			System.out.println(a.toString());
		}
		
	}
	

}
