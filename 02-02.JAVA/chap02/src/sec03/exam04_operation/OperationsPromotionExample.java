package sec03.exam04_operation;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// -128 ~ 127 범위
		// byte 변수끼리의 합의 결과를 int로 해석하도록 되어 있다.
		// byte byteValue3 = (byte) (byteValue1 + byteValue2);
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// 0~65535 범위
		char charValue1 = 'A'; // 내부적으로 숫자로 저장된다. 아스키코드표 65 소문자 a 92
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드값: " + intValue2);
		System.out.println("출력문자= " + (char)intValue2);
		
		/*
		 변수로 사용시 (int형 아래 데이타타입끼리 연산시에는 결과가 int형으로 해석됨)
		 byte 변수 + byte 변수 -> int
		 char 변수 + char 변수 -> int
		 byte 변수 + short 변수 -> int
		 
		 int + long -> long + long = long
		 int + float -> float + float = float
		 float + double -> double + double = double
		 
		 byte + int + long -> long + long + long
		 
		 */
		
		
		// int(정수)이하 데이타타입끼리의 연산결과는 int
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		// 다른 데이타타입기리 연산시 가장 큰 데이타타입으로 형변환이 발생된다.
		// 연산시에도 타입이 일치되는 작업이 이루어져야 한다.
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0;
		double doubleValue = 10 / 4.0;
		System.out.println(doubleValue);
		
		/*
		 10/ 4.0 -> 10.0 / 4.0;
		 10.0. / 4.0
		 */
		
	}

}
