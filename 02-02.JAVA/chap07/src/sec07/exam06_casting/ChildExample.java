package sec07.exam06_casting;

public class ChildExample {
	
	public static void main(String[] args) {
			
		// 자식 객체가 생성
		Parent parent = new Child(); // 자동형변환 Parent parent = (Parent) new Child(); 
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// Child클래스 (자식객체의 멤버는 접근을 지원안함.) 힙영역에 메모리 생성은 되어있으나, 접근하지 못하게 되어있음.
//		parent.field2 = "data2";
//		parent.method3();
		
		// 자식객체로 형변환 된 경우에는 부모 멤버, 자신 멤버 모두가 접근이 가능함.
		Child child = (Child) parent; // 우측이 부모객체일 경우에는 명시적 형변환해야 함
		child.field2 = "yyy";
		child.method3();
		
		
		
	}
}
