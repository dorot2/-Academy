package sec07.exam01_why_default_method;

public interface MyInterface {

	// 상수, 추상메소드, 디폴트메소드, 정적(static)메소드 로 구성
	
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2() 실행");
	}
}
