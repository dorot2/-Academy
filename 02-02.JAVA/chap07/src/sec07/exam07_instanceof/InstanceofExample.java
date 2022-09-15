package sec07.exam07_instanceof;

public class InstanceofExample {

	
	// 형변환 체크해서 유무에 따라 작업
	public static void method1 (Parent parent) {
		if(parent instanceof Child) {// 형변환 작업이 가능한지 체크한다.
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환성공");
		}else {
			System.out.println("method1 - Child로 변환실패");
		}
	}
	
	// 형변환 체크없이 그대로 형변환
	public static void method2(Parent parent) {
		Child child = (Child) parent; // parent 객체의 성격에 따라서 에러발생 될 수도 있다.
		System.out.println("method2 - Child로 변환 성공");
	}
	
	
	public static void main(String[] args) {
		Parent parentA = new Child(); // 자동형변환
		method1(parentA);
		method2(parentA);
		
		// 단독(자식객체가 상관없는 경우)
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
		
	}
}
