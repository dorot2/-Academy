package sec07.user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			// TODO Auto-generated catch block
			String message = e.getMessage(); //잔고액 부족 메시지 출력
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}

	}

}
