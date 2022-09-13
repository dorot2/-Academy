package sec10.exam03_static_careful;

import sec10.exam03_static_careful.Car;

public class Car {
	
	// 인스턴스 멤버
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	// main() 메서드는 Car클래스 안에 작성은 되어있지만,
	// Car 클래스에 영향을 받지 않는다.
	public static void main(String[] args) {
		Car myCar = new Car(); 
		myCar.speed = 60;
		myCar.run();
	}
}
