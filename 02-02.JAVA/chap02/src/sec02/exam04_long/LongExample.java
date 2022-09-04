package sec02.exam04_long;

public class LongExample {

	public static void main(String[] args) {
		
		// 형변환 개념 설명할 것.(다음주 수업에서 9/2)
		long var1 = 10;
		long var2 = 20L; // 숫자 값의 뒤에 영문 대문자 L, 소문자 l을 접미사로 붙인다.
		
		// 값의 범위가 오버
		// long var3 = 1000000000000000;
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}
}
