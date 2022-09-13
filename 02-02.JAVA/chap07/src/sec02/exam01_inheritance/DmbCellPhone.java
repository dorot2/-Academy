package sec02.exam01_inheritance;

// 자식클래스(하위클래스) extends 부모클래스(상위클래스)
public class DmbCellPhone extends CellPhone {
	
	// 필드 : 부모 클래스의 2개 필드 사용가능
	int channel;
	
	// 생성자. 수동으로 생성자를 생성시에는 자동으로 기본생성자가 만들어지지 않는다.
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// 메소드 : 부모 클래스의 6개 메서드 사용가능.
	// 부모가 없는 것은 자기가 만들어 쓰면 된다.
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}	
}
