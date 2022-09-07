package sec06.exam02_array_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {

		// 배열 : 기본데이타타입으로 배열생성.(값타입배열).
		// ex> int[], double[], char[],...8개
		
		int[] arr1 = new int[3]; // 배열생성. 초기값이 0으로 세팅
		for (int i=0; i<3; i++) { // 0, 1, 2 - 3개
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 10; // 0 -> 10
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {// 0, 1, 2 - 3개
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		// 초기값 0.0
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {// 0, 1, 2 - 3개
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}	
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {// 0, 1, 2 - 3개
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}	
		
		
		// --------------------------------------------------------------
		
		// 클래스로 생성한 배열 : 객체배열, 메모리 참조하는 구조가 조금 다르다.
		
		String[] arr3 = new String[3];
		
		// 객체배열(클래스배열)은 기본값이 null이다. 참조하고 있지 않다.
		for(int i=0; i<3; i++) {// 0, 1, 2 - 3개
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}	
		
		// 힙영역
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {// 0, 1, 2 - 3개
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
