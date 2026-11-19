package mylab.bank.entity;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount() {
	
	}
	
	public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
		super(accountNumber, ownerName, balance);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void applyInterest() {
		double interest = this.getBalance() * this.interestRate;
		this.deposit(interest);
		System.out.println("이자 " + interest + "원이 적용되었습니다. 현재 잔액: " + this.getBalance() + "원");
	}
	
	@Override
	public String toString() {
		return "계좌번호: " + this.getAccountNumber() + ", 소유자: " + this.getOwnerName()
		+ ", 잔액: " + this.getBalance() + "원" + ", 이자율: " + this.interestRate * 100 + "%";
	}

}
