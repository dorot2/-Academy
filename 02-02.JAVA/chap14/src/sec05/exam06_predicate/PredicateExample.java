package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	// Predicate : 매개변수값을 이용하여 true, false로 리턴값을 생성
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 75),
			new Student("김순희", "여자", 90),
			new Student("김자바", "남자", 85),
			new Student("박한나", "여자", 60)
					
	);
	
	//list컬렉션에서 남자, 여자의 평균점수를 구하는 메소드
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student stduent : list) {
			if(predicate.test(stduent)) {
				count++;
				sum += stduent.getScore();
			}
		}
		return (double) sum / count;
	}
	
	//점수가 80이상이 합격자의 수를 구하자.
	public static int pass(Predicate<Student> predicate) {
		
		int count = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균점수: " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균점수 : " + femaleAvg);
		
		// 람다식구문에서 매개변수 타입생략가능, 매개변수 1개일 경우 () 생략. 실행문에서 문장이 1개면 {} 생략. return 생략가능
		int count = pass(t -> t.getScore() >= 80);
		System.out.println("점수가 80이상인 합격자수 : " + count);

	}

}
