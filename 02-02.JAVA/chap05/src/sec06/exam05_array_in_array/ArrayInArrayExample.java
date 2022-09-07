package sec06.exam05_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 다차원배열 : 2차원배열. 행렬구조로 생각하라. 각 행마다 열의 크기가 고정
		// int [][] mathScores = new int[행의크기][열의크기];
		
		int [][] mathScores = new int[2][3]; // 2*3 행렬구조.
		for (int i =0; i<mathScores.length;i++) {//행의크기 2번돈다. 
			for(int k=0; k<mathScores[i].length; k++) { // 1행 3열 관점, 2행 3열 관점 3번씩 돈다.
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		// 가변배열(Jagged Array). 각 행마다 열의 크기가 다른 배열. 5개
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2]; // 1행은 열을 2
		englishScores[1] = new int[3]; // 2행은 열을 3
		for (int i =0; i<englishScores.length;i++) {//행의크기 2번돈다. 
			for(int k=0; k<englishScores[i].length; k++) { // 1행 2열, 2행 3열
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
		System.out.println();
		
		// 1행 열의크기 2, 2행 열의크기 3
		int[][] javaScroes = { {95, 80}, {92, 96, 80} };
		
		for (int i =0; i<javaScroes.length;i++) {//행의크기 2번돈다. 
			for(int k=0; k<javaScroes[i].length; k++) { // 1행 2열, 2행 3열
				System.out.println("javaScroes[" + i + "][" + k + "]=" + javaScroes[i][k]);
			}
		}
		System.out.println();
	}

}
