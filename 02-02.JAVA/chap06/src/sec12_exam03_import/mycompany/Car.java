package sec12_exam03_import.mycompany;

// 사용하지 않은 패키지 정리 => ctrl + shift + O
import sec12_exam03_import.hankook.SnowTire;
import sec12_exam03_import.hyundai.Engine; // Engine 클래스는 패키지 명을 생략하여 사용 가능
import sec12_exam03_import.kumho.BigWidthTire;

public class Car {
	
	// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// Tire 클래스는 2개의 패키지에 존재하여 중복되어 있으므로 혼란을 방지하기 위하여 패키지명.클래스명 형식으로 사용함
	sec12_exam03_import.hankook.Tire tire3 = new sec12_exam03_import.hankook.Tire();
	sec12_exam03_import.kumho.Tire tire4 = new sec12_exam03_import.kumho.Tire();
}
