package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		// 1) 소스(데이터)
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)				
		);
		
		double sumAge = 0;
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getSex() == Member.MALE) {
				count++;
				sumAge += list.get(i).getAge();
			}
		}
		System.out.println("평균 남자 나이 : " + (sumAge / (double) count ));
		
		// 성별이 남자인 데이타에 한하여 나이평균?
		// 2) 스트림생성 -> 중간처리 -> 최종처리(결과)
		double average = list.stream() // 4개 Member 객체를 참조
		.filter(m -> m.getSex() == Member.MALE) // 남자인 2개의 Member 객체를 참조.
		.mapToInt(m -> m.getAge()) // 나이를 매핑한 중간처리
		.average()
		.getAsDouble();
		
		System.out.println("남자 평균의 나이 : " + average); // 2
		
	}
}
