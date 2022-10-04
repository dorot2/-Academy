package sec05.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

	public static void main(String[] args) {
		//매개변수 있고, 리턴값없다.
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};
		
//		consumerA.accept(new Member("홍길동", "hong", null));
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};
		
//		consumerB.accept(new Member("홍길동", "hong", null));
		
		// 2개의 함수적인터페이스를 연결할 때 사용.
		// 첫번째 처리결과를 두번째 매개변수 값으로 제공해서 최종 결과값을 얻음.
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));

	}

}
