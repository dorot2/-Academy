package sec05.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		// Car myCar2 = new Car(); // 계속 생성하면 기억장소 재사용 => 편리
		
		//힙영역의 필드기억장소 접근
		System.out.println("제작회사 : " +  myCar.company);
		System.out.println("모델명 : " +  myCar.model);
		System.out.println("색깔 : " +  myCar.color);
		System.out.println("최고속도 : " +  myCar.maxSpeed);
		System.out.println("현재속도 : " +  myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("변경속도 : " + myCar.speed);

	}

}
