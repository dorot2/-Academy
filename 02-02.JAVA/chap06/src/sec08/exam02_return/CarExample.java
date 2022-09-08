package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		// myCar.gas = 100;
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // Car의 run() 메소드 호츨
		}	
	
	
	if(myCar.isLeftGas()) {
		System.out.println("gas를 주입할 필요가 없습니다.");
	}else {
		System.out.println("gas를 주입하세요.");
	}
	}
}
