package sec02_exam01_if;

public class IfElseIfElseExample {

	public static void main(String[] args) {


		int score = 75;
		
		// 첫번째 조건식에서부터 상위조건을 적용해야 한다.
		if(score >= 90) {
			System.out.println("등급A");
		}else if (score >= 80) {
			System.out.println("등급B");
		}else if (score >= 70) {
			System.out.println("등급C");
		}else {
			System.out.println("등급D");
		}

	}

}
