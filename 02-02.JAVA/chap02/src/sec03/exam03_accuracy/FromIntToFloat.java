package sec03.exam03_accuracy;

public class FromIntToFloat {

	// 정수형, 실수형 데이타타입의 기억장소 표현방식이 다르다.
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		// 타입일치가 이루어지고 값이 할당된다.
		// 정수형 데이타타입보다는 실수형데이타타입이 크다.
		float num3 = num2; // 내부적으로 float num3 = (float) num2; 자동형변환
		System.out.println("num3: " + num3);
		
		num2 = (int) num3; // 명시적형변환 작업을 해야한다. 문법
		System.out.println("num2: " + num2);
		
		int result = num1 - num2; // 예상값 0
		System.out.println(result);
	}
}
