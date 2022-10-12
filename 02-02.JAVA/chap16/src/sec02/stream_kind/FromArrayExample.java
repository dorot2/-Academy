package sec02.stream_kind;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample {

	public static void main(String[] args) {
		// 배열로부터 스트림 참조
		String[] strArray = {"홍길동", "신용권", "김미나"};
		
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(str -> System.out.print(str + ", "));
		
	}
	
	// 메소드는 매개변수 유무, 리턴값 유무에 따라 4가지 형태가 존재.
	// 이 메소드는 위의 Consumer 함수적인터페이스를 람다식으로 참조하기 위한 구문.
	// 아래 구문을 위 한줄로 정리한 것임(str -> System.out.print(str + ", ")
	public void methodA(String str) {
		System.out.println(str);
	}
	
	public void methodB() {
		System.out.println();
	}
	
	public int methodA(int a, int b) {
		return a + b;
	}
	
	public int methodA() {
		return 0;
	}
	
}
