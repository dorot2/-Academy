package sec05.exam04_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

	// List컬렉션
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	);
	
	/*
	List<Student> list2 = new ArrayList<Student>();
	
	void aaa() {
		list2.add(new Student("홍길동", 90, 96));
		list2.add(new Student("홍길동", 90, 96));
	}
	*/
	
	
	// 매개변수 있고, 리턴값 있는 특징. 
	// 타입추론? 매개변수의 타입을 생략.  (Student t) ----> t
	// Function<Student, String> function = (Student t) -> t.getName();
	// Function<매개변수,리턴값 >
	// apply()추상메소드를 람다식으로 구현
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	// ToIntFunction<Student> function = t -> t.getEnglishScore();
	// ToIntFunction<매개변수>
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student));
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		
		// Function<Student, String> function = t -> t.getName(); function.apply(student)
		printString(t -> t.getName()); 
		
		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
		

	}

}
