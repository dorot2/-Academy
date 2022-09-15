package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Bike bike = new Bike();
		
		// 결과는 같지만 구성, 유지보수를 위해 잘 만들어야 됨
		// bus.run();
		// taxi.run(); 
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(bike);
	}

}
