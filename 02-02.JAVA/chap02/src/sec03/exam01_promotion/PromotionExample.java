package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// 형변환(Casting)
		// 1) 자동형변환(Promotion) : 작은데이타타입의 값을 큰 데이타타입의 변수로 저장시 형변환X, 자동처리 
		// 2) 명시적형변환(Casting) : 큰데이타타입의 값을 작은 데이터타입의 변수로 저장시 형변환 작업을 명시적으로 해야 한다.
		
		// 정수형 데이터타입 크기(서열). 정수형 데이타타입보다는 실수형 데이타타입이 더 큰 개념으로 정의되어 있다.
		// byte < short(char) < int < long < float < double
		// 작은 데이타 타입의 값을 큰 데이타 타입의 기억장소에 자동으로 형변환과정이 일어나 저장됨
		
		// 변수 = 값; 값이 좌측의 변수의 타입에 맞게 형변환이 일치해야 한다. (타입일치)
		byte byteValue = 10;
		// int > byte
		// 자동형변환 : byteValue 변수의 값을 읽어와서 int형으로 변환하고 대입된다.
		int intValue /*큰 데이타타입*/ = byteValue/*작은데이타타입*/;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드= " + intValue);
		
		intValue = 500;
		// intValue 변수의 값을 읽어와서, 좌측의 변수 데이타타입 long형으로 변환되어, 값이 대입된다.
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // (double)200D
		System.out.println(doubleValue);
		
		
		

	}

}
