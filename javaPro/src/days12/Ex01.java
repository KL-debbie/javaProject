package days12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		// 아래 1차원 배열 m 의 값을 2차원 배열 n에 채워넣는 변환코딩을 하세요.
		  int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };
		  dispM(m);
		  //                  행 열
		  // i=0  i/2 i%2 0 0    2차원의 열 갯수
		  // i=1             0 1
		  // i=2             1 0
		  // i=3             1 1
		  // i=4             2 0
		  
		  
		  int [][] n = new int[6][2];  
		  for (int i = 0; i < n.length; i++) {
			  n[i/2][i%2] =m[i];
			  
		  dispM(n);
		  
		} // for
		  
		}

	private static void dispM(int[][] n) {
		for (int i = 0; i < n.length; i++) {   //행 갯수
			for (int j = 0; j < n[i].length; j++) { // 열 갯수
				System.out.printf("[%d][%d]=%d " ,i ,j , n[i][j]);
			} // for
			System.out.println();
		} // for
		
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]= %d\n", i, m[i]);
			
		} // for
		
	}
	}


