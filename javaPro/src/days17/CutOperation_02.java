package days17;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import days16.ScoreOutOfBoundException;

public class CutOperation_02 {

	public static void main(String[] args) {

	    /* 
	      입력 
	      첫줄에 막대기의 수 N을, 다음 줄에 각각의 막대기의 길이를 공백으로 구분해서 입력한다.

	      출력 
	      매 줄마다 [Cut Operation]이 수행 되 때 마다 남은 막대기의 수를 출력 

	      제한 
	      1 <= N <= 1000
	      1 <= 막대기의 길이 <= 1000

	      입력 예제 #1
	      6
	      5 4 4 2 2 8

	      출력 예제 #1
	      6
	      4
	      2
	      1

	      입력 예제 #2
	      8
	      1 2 3 4 3 3 2 1

	      출력 예제 #2
	      8
	      6
	      4
	      1 
	        */       

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  [] sticks = new int [n]; //막대기 갯수
		int sticksLength = sticks.length;
		for (int i = 0; i < sticksLength; i++) {
			sticks[i] = sc.nextInt();
		} // for
		Arrays.sort(sticks);  // 오름차순 정렬
		System.out.println(Arrays.toString(sticks));
		//  5 4 4 2 2 8
		
		int index =0;
		int sticksCount = sticksLength- index;  //stickCount ????
		System.out.println( sticksCount );
		
		for (int i = 0; i < sticksLength; i++) {
			if ( sticks[index] != sticks[i] ) {
				index = i;
				sticksCount= sticksLength- index;
				System.out.println(sticksCount);
			} //if
			
		} // for
		
	}//main

}//class
