package sec06.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		//생성자 참조문법
		
		//new 생성자호출은 추상메소드의 매개변수의 값에 따라 상대적으로 반응한다. 
		// Function<String, Member> function1 =  (str) -> { Member member = new Member(str); return member; };
		Function<String, Member> function1 =  Member :: new;
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member :: new; // Member member = new Member(String name, String id);
		Member member2 = function2.apply("홍길동", "angel1");

	}

}
