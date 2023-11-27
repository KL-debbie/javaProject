package days12;

/**
 * @author KL
 * @date 2023. 7. 28. - 오전 11:40:25
 * @subject 마방진
 * 			// 1) 첫번째 행의 가운데 열  =  1
			// 2-1) 출력값이 5의 배수라면 행만 증가
			// 2-2)   2-1)이 아니면  행 감소, 열 증가 반복적으로 처리
			// 3)                                 ㄴ  행 0행 -> -1행  => 가장 큰 행 4 으로 값 처리 (행을 벗어남) 
			// 4)       		                             ㄴ 열 4열 -> 5열 => 가장 작은 열 0 로 값 처리(열을 벗어남)
 * @content
 */
public class Ex04_03 {
	
	public static void main(String[] args) {
		
		int [][]m = new int[5][5];

		magicSquare(m);
	} // main
	
	
	// 마방진
		private static void magicSquare(int[][] m) {
			
			int n= 1;
			int row= 0, col= 2;
			
			while (n<=25) {
				m[row][col]= n;
				dispM(m);
				
				try {
					
					Thread.sleep(1000);   //1초
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				
				if (n % 5==0) {
					row ++;
				} else {
					row--; col++;
					if (col ==5 ) col=0;
					else if(row ==-1) row=4;
				}
				n++;
			}//while
		}
		
		
		private static void dispM(int[][] m) {
			System.out.println("\n\n\n\n");
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.printf("[%02d]", m[i][j]);
				} // for
				System.out.println();
			} // for
		}

}//class
