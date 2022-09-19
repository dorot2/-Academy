package sec07.exam01_why_default_method;

public class MyClassB implements MyInterface {

	//필수 구현
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
		
	}
	
	//선택 재정의
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB-method2() 실행");
	}

}
