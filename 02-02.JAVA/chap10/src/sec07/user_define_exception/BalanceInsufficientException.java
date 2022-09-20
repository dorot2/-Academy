package sec07.user_define_exception;


// 사용자 정의 예외 클래스
public class BalanceInsufficientException extends Exception {

	//생성자 메소드
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
