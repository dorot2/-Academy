package sec04.exam01_arithmetic;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// 사칙연산. + - * / %
		// byte 나 short는 잘 사용하지 않는다. 보통 정수는 int, 실수는 double로 사용.
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2; // 몫
		System.out.println("result4=" + result4);
	
		int result5 = v1 % v2; // 나머지
		System.out.println("result5=" + result5);
		
		double result6 = (double) v1 / v2; // (double)v1 / (double)v2 소수점 값을 원할 때
		System.out.println("result6=" + result6);
		
	}

}
