package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		//익명구현객체 : ChildInterface1인터페이스를 구현하는 클래스를 만들지 않고, 일회성으로 코드를 구성해서 사용하고 싶을 때
		ChildInterface1 ci1 = new ChildInterface1() {
			
			//아래 구현메소드는 다른 클래스에서 호출이 불가능
			@Override
			public void method1() {/*실행문*/}
			
			@Override
			public void method3() {/*실행문*/}
		};
		
		ci1.method1();
		ci1.method2(); // 부모 ParentInterface의 method2()호출
		ci1.method3();
		
		/*--------------------------------------*/
		
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() { /*실행문*/}
			
			@Override
			public void method3() {/*실행문*/}
		};
		
		ci2.method1();
		ci2.method2(); // ChildInterface2의 method2()호출
		ci2.method3();
	
	/*---------------------------------*/
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {/*실행문*/}
			
			@Override
			public void method3() {/*실행문*/}
			
			@Override
			public void method2() {/*실행문*/}
		};
		
		ci3.method1();
		ci3.method2(); // ChildInterface3구현객체의 method2() 호출
		ci3.method3();
	
	}
	
	

}
