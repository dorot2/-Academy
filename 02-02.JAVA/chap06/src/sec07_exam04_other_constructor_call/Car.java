package sec07_exam04_other_constructor_call;

public class Car {

	// 생성자 메서드가 
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this(model, null, 0);
	}
	
	Car(String model, String color){
		
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
