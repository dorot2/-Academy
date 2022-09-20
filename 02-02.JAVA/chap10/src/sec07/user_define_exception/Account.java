package sec07.user_define_exception;

//예금액이 부족해서 발생하는 상황을 시나리오로 구성. 예외처리작업.
public class Account {

	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	//예금액이 부족하면, 예외발생 작업을 해두어, 이 메소드 사용시 예외처리를 하도록 작업을 만든다.
	public void withdraw(int money) throws BalanceInsufficientException {
		//잔고액이 사용하는 금액보다 부족한 경우.
		if(balance < money) {
			// 예외발생구문.
			throw new BalanceInsufficientException("잔고부족:" + (money-balance) + " 모자람");
		}
		
		balance -= money;
	}
}
