package sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	//메소드참조? 람다식에서 단 하나의 메소드만을 호출하는 경우 람다식에서 사용하는 불필요한 매개변수를 제거하고 사용하도록 제공하는 문법.
	public static void main(String[] args) {
		// 매개변수 있고, 리턴값 있다.
		// 2개의 정수 매개변수를 이용하여, 연산된 리턴값을 구하는 기능.
		IntBinaryOperator operator;
		
		//정적메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y); //람다식은 익명구현객체 동작
		System.out.println("결과1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));
		
		operator = obj :: instanceMethod;
		System.out.println("결과3: " + operator.applyAsInt(7, 8));
		
		
		// operator = (x, y) -> obj.instanceMethod(x, y);
		
		

	}
	
//	public static int applyAsInt(int x, int y) {
//		return x + y;
//	}

}
