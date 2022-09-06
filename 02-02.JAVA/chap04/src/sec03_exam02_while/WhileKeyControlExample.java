package sec03_exam02_while;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {


		boolean run = true;
		int speed = 0; // 속도
		int keyCode = 0; // 기계작동 코드값
		
		while(run) {
			if(keyCode!= 13 && keyCode != 10) {
				System.out.println("---------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("---------------------");
				System.out.println("선택 : ");
			}
			
			// System.in.read(); 콘솔환경에서 키보드 입력을 받아 진행하는 명령어
			keyCode = System.in.read();
			
			if(keyCode == 49) { // 키보드에서 1을 입력시 아스키코드값
				speed++;
				System.out.println("현재속도= " + speed);
			}else if (keyCode == 50) { // 키보드에서 2을 입력시 아스키코드값
				speed--;
				System.out.println("현재속도= " + speed);
			}else if (keyCode == 51) { // 키보드에서 3을 입력시 아스키코드값
				run = false;
			}

	}

	}
}
