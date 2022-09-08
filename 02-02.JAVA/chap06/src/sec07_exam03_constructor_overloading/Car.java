package sec07_exam03_constructor_overloading;

// 생성자 오버로딩 : 생성자메서드를 여러개 정의가 가능하다.
public class Car {

	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
