package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		// 2) 명시적형변환(Casting)
		// : 큰데이타타입의 값을 작은 데이터타입의 변수로 저장시 형변환 작업을 명시적으로 해야 한다.
		// **우측이 큰 데이타타입일 경우에는 자동형변환이 발생되지 않는다.
		// = 기준 우측 값이 좌측의 타입과 일치하고 대입된다. (타입일치)
		int intValue = 44035;
		// 정수값을 문자로 표현할 경우에는 char 데이타 타입을 변환시켜야 한다.
		// 정수값범위 : 0~65535 사용해야 한다. / 나머진 사용 못하면 쓰레기값 되는거임.
		char charValue =(char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.64;
		intValue = (int) doubleValue; // int형으로 변환되면서, 반올림없이 소수부분은 제거된다.
		System.out.println(intValue);	
	}

}
