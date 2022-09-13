package sec10.exam02_static_block;

public class Television {

	// 정적멤버 : 공용데이타
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	// static 생성자 메서드는 존재하지 않는다.
	// 인스턴스 멤바를 초기화 목적으로 사용하기 때문
	static {
		info = company + "-" + model;
	}
}
