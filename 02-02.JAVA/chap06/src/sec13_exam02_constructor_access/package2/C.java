package sec13_exam02_constructor_access.package2;

import sec13_exam02_constructor_access.package1.A;

public class C {
	
	    // 필드
		A a1 = new A(true);      
		//A a2 = new A(1);       패키지가 다른 경우에는 default 접근자는 private 접근불가 반응을 한다.
		//A a3 = new A("문자열");  private 생성자는 접근불가
	}

