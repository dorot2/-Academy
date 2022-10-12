package sec03.stream_pipelines;

public class Member {

	// 상수선언. 값에다가 이름을 정의를 한 의미.
	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	// Getter 메소드
	public int getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	
	
}
