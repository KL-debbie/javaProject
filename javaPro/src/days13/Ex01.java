package days13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author KL
 * @date 2023. 7. 31. - 오전 10:06:45
 * @subject 복습 2, 3번
 * @content
 * 변수 : 값을 저장하는 기억공간 이름 + 변하는 수 
	상수 : 값을 저장하는 기억공간 이름 + final 한번 초기화 시 변경 불가

	리터럴 : 
	참조변수 : 주소값을 저장(참조)하는 변수
	참조타입 (배열, 클래스, 인터페이스)
	int [] m ; // 변수, 참조변수, 배열명
 */
public class Ex01 {
	public static void main(String[] args) throws IOException {
		int [][] m = new int[5][5];
		 
		 fillM(m);
		 dispM(m);
	
	}

	private static void fillM(int[][] m) {
		/*
		[01][02][03][04][10]    == 00~03 합
		[05][06][07][08][26]
		[09][10][11][12][42]
		[13][14][15][16][58]
		[28][32][36][40][136]  

  			00+01+02+03 = 04(10)   
  			10+11+12+13 = 14(26)    //16
  			20+21+22+23 = 24(42)    // 16
  			30+31+32+33 = 34(58)    //16
  			40+41+42+43 = 44(136)  // 
		 */
		
		
			for (int i = 0, n=1 ; i < m.length-1; i++) {   //행 갯수
				for (int j = 0; j < m[i].length-1; j++) {   //열 갯수
					m[i][j]= n++;
					m[i][4] +=m[i][j];   //누적
					m[4][j] +=m[i][j];
					m[4][4] +=m[i][j];
					
				} // for
				System.out.println();
			} // for
		}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {   //행 갯수
			for (int j = 0; j < m[i].length; j++) {   //열 갯수
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
		
	}
}
		