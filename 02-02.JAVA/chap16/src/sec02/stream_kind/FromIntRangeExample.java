package sec02.stream_kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {

	public static int sum;
	
	public static void main(String[] args) {
		// 숫자범위
		
		// 1~100 범위의 int 숫자데이터를 참조하는 스트림
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합 : " + sum);
		
	}
}
