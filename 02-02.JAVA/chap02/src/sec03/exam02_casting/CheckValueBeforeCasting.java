package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		// 기본데이타타입(원시타입) 8개.
		// 기본데이타타입의 값의 범위
		
		System.out.println("byte:" + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("int:" + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);		

		int i = 128;
		//byte b = (byte) i; b가 쓰레기값이 되므로 나중에 프로그래밍에 문제가 됨. 문법에러 x 논리적인 에러.
		
		// i변수의 값이 -128보다 작거나 127보다 큰 경우
		if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte타입으로 변환 불가능");
		}else {
			byte b = (byte) i;
			System.out.println(b);
			
		}
	}

}
