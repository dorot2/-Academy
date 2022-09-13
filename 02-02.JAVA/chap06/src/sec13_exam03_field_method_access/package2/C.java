package sec13_exam03_field_method_access.package2;

import sec13_exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;   
		//a.field2 = 1;   default이므로 다른 패키지에 private로 작동
		//a.field3 = 1;   private이므로 접근 불가
		
		a.method1();   
		//a.method2();    default이므로 다른 패키지에 private로 작동
		//a.method3();    private이므로 접근 불가
		
	}
}
