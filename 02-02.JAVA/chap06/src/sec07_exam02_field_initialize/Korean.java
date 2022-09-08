package sec07_exam02_field_initialize;

public class Korean {
	// 필드
	String nation = "대한민국"; // 고정적인 값은 미리 주고.
	String name;   // 기본값 null
	String ssn;    // 기본값 null
	
	// 생성자 수동정의. : 힙영역에 생성된 기억장소의 값을 초기화.
	//	public Korean(String n, String s) {
	//		name = n;
	//		ssn  = s;
	//	}
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn  = ssn;
	}
	
}
