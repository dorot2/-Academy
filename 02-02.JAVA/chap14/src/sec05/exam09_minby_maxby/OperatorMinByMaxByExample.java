package sec05.exam09_minby_maxby;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		
		//매개변수 있고, 리턴값 있다.
		// 매개변수를 연산식에 사용하여, 리턴값을 생성한다.
		
		// BinaryOperator<Fruit> : 두개의 매개변수를 제공하여, 연산 한 결과를 Fruit으로 리턴한다.
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		// 객체를 기준에 의하여 비교할 경우.
		binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));  // new Fruit("딸기", 6000)
		System.out.println(fruit.name);
		
		binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000)); // new Fruit("수박", 10000)
		System.out.println(fruit.name);

	}

}
