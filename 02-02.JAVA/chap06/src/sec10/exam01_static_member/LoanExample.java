package sec10.exam01_static_member;

public class LoanExample {

	public static void main(String[] args) {
		
		// 클래스명.맴버
		Loan.iYul = 7;
		
		// 객체생성 작업 이전에 static영역에 iYul 메모리가 먼저 생성됨
		Loan loan1 = new Loan(); 
		loan1.name = "홍길동1";
		loan1.loanPrice = 5000;
		
		loan1.iYul = 10;
		
		Loan loan2 = new Loan();
		loan2.name = "홍길동2";
		loan2.loanPrice = 5000;
		
		Loan loan3 = new Loan();
		loan3.name = "홍길동3";
		loan3.loanPrice = 5000;
	}

}
