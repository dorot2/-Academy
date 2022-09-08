package sec05.exam02_field_default_value;

public class FieldIntValue {

	// 구성요소 : 기억장소를 생서하는 목적이기때문에, 데이터타입은 모두 사용가능.
	
	// 필드
	// 정수형타입
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	// 논리형타입
	boolean booleanField;
	// 문자타입. 1개 문자 표현
	char charField; // 기본값. '\u0000' : 유니코드로 하나의 문자로 해석 / 'ab' : 2개 문자(틀린표현)
	
	// 실수형타입
	float floatField;
	double doubleField;
	
	// 배열
	int[] arrField;
	// 참조타입
	String referenceField;
}
