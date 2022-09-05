package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		// 실수값 저장. float(4), double(8) 기본
		// 3.14, 3.14d, 3.14D 동일한 실수형 데이타타입 표현. 8byte크기
		double var1 = 3.14;
		
		// 4byte의 기억장소에 3.14 8byte크기의 데이타를 저장(대입)할 수가 없다.
		// float var 2= 3.14; 에러난다.
		
		// float 4byte 실수값을 표현할려면, 3.14f, 3.14F로 사용.
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		// System.out.println() 괄호안의 값을 콘솔에 출력하는 기능.
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		// e 사용하기 (숫자가 길어질 때 사용하는 10 치환값)
		// 과학이나 공학분야에서 자릿수가 클 때 사용하기 위해 만들어진 것.
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3; // 2의 10의 -3승
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
		

	}

}


