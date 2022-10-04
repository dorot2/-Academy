package sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	// Operator함수적인터페이스
	// 매개변수가 있고, 리턴값이 있다.
	// 매개변수로 연산을 하여, 리턴값으로 결과
	
	
	private static int[] scores = { 92, 95, 87 };
	
	// IntBinaryOperator operator = 람다식
	// 추상메소드의 리턴타입과 매개변수의 개수에 맞게 람다식을 표현하라.
	// 2개의 int형 매개변수로 연산을하여 리턴값을 int로 생성.
	//최대값과 최소값을 구하는 기능
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		//result 변수 : 두수를 비교하여, 큰값만 갖게되는 특징.
		for(int score : scores) { 
			// (92, 92) -> result: 92
			// (92, 95) -> result: 95
			// (95, 87) -> result: 95
			result = operator.applyAsInt(result, score); // 메소드의 특징을 보고 람다식을 제공.
		}
		return result; // 95
	}
	
	public static void main(String[] args) {
		
		//1)최대값을 구하는 람다식표현
		int max = maxOrMin(
				(a, b) -> {
					if(a>=b) return a;
					else return b;
					}
				);
		System.out.println("최대값: " + max);
		
		//2)최소값을 구하는 람다식표현
		int min = maxOrMin(
				(a, b) -> {
					if(a<=b) return a;
					else return b;
					}
				);
		System.out.println("최소값: " + min);
		
		
	}

}
