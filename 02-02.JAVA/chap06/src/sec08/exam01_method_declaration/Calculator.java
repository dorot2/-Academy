package sec08.exam01_method_declaration;

public class Calculator {

	// 메소드
	
	// 1) 리턴타입이 없는 경우 : void
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 2) 리턴타입이 있는 경우 : 값타입과 참조타입
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
