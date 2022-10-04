package sec05.exam07_andthen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		
		// 매개변수 있고, 리턴값도 있다.
		// 매개변수를 매핑하여, 리턴값으로 사용.
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB; // functionA + functionAB
		String city;
		
		//함수적인터페이스 변수에 람다식구문 대입
		functionA = (m) -> m.getAddress();   // return생략가능.
		functionB = (a) -> a.getCity();
		
		// 2개의 함수적인터페이스를 연결할 때 사용.
		// 첫번째 처리결과를 두번째 매개변수 값으로 제공해서 최종 결과값을 얻음.
		functionAB = functionA.andThen(functionB);
		
		city = functionAB.apply(
			new Member("홍길동", "hong", new Address("한국", "서울"))	
		);
		
		System.out.println("거주도시: " + city);
		
		//함수적인터페이스 순서가 바뀜.
		//첫번째 functionA 동작되고, 그 결과가 두번째 functionB에 제공.
		functionAB = functionB.compose(functionA);
		
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울"))	
			);
		System.out.println("거주도시: " + city);

	}

}
