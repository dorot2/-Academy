package sec05.exam08_and_or_negate_isequal;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		// 매개변수를 이용하여 true, false의 리턴값을 생성.
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null " + predicate.test(null)); // null비교를 허용해서 true
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8 " + predicate.test(null)); // false
		
		predicate = Predicate.isEqual(null);
		System.out.println("Java8, null " + predicate.test("Java8")); //false
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8 " + predicate.test("Java8")); // true
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java7, Java8 " + predicate.test("Java7")); // false
	}

}
