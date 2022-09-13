package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		// new 연산자 : 메모리 생성연산자(힙영역)
		// 1) new 연산자가 DmbCellPhone클래스의 상속관계를 먼저 확인 후
		// 2) 상속되어 있으면, 부모 클래스의 메모리를 먼저 생성한다.
		// 3) 자식(자신)클래스의 메모리를 생성한다.
		// 4) 부모생성자 호출 - 자식(자신)생성자 호출 순서로 진행이 된다.
		

		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		
		//부모 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//자신 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//부모 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();

		//자신 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
