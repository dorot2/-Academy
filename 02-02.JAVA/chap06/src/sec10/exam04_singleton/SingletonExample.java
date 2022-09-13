package sec10.exam04_singleton;

import java.util.Calendar;

public class SingletonExample {
	public static void main(String[] args) {
		
		// Singleton 클래스는 싱글톤 패턴으로 생성했기에 생성자 호출 불가능
		// Singleton s1 = new Singleton();  //컴파일 에러
		
		Singleton s1 = Singleton.getInstance(); // 생성된 객체의 주소 대입
		Singleton s2 = Singleton.getInstance(); // 생성된 객체의 주소 대입
		
		// JDK 날짜, 시간 기능을 제공하는 클래스. 싱글톤 클래스 특징.
		// Calendar cal = Calendar.getInstance();
		
		// 참조타입일 경우 == : 주소비교.
		if(s1 == s2) {
			System.out.println("같은 Singleton 객체 입니다."); // 출력됨
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
