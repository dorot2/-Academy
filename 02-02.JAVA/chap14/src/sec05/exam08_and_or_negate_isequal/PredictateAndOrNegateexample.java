package sec05.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredictateAndOrNegateexample {

	public static void main(String[] args) {
		// 함수적 인터페이스를 재사용.  
		// 사용법 : 연결해서 사용
		// 매개변수가 있고, 리턴값도 있다.
		// 매개변수를 사용하여, true, false의 boolean 리턴값을 생성.
		//2의 배수 판단. 짝수또는 홀수 판단
		IntPredicate predicateA = a -> a%2 == 0;
		
		//3의 배수 판단
//		IntPredicate predicateB = (int a) -> { return a%3 == 0; };
		IntPredicate predicateB = a ->  a%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and().논리형 진리값  2의 배수이면서 3의배수인 것. 두조건이 true이면 결과는 true이다.
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9); //false
		System.out.println("9는 2와3의 배수?" + result);
		
		//or(). 두조건중 하나라도 true이면 결과는 true이다.
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9); //
		System.out.println("9는 2 또는 3의 배수?" + result);
		
		//negate() !.   true -> false, false -> true
		predicateAB = predicateA.negate();
		result = predicateAB.test(9); //
		System.out.println("9는 홀수?" + result);

	}

}
