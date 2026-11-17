package workshop.account.exception;
/*
 * Account의 잔액(balacne)가 부족할때 사용되는 사용자정의 Exception 클래
 */

public class InsufficientBalanceException extends Exception {
	//현재 잔액
	private int currentBalance;
	
	public InsufficientBalanceException(String message, int currentBalacne) {
		super(message);
		this.currentBalance = currentBalance;
	}

	public int getCurrentBalance() {
		return currentBalance;
	}
	

}
