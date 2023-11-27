package days12;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 28. - 오전 10:26:55
 * @subject                                                                         days11.Ex09
 * @content
 */
public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int [] lotto = new int[6];
		int [][] lottos;      // 배열 생성하지 않고 선언만!
		
		System.out.println(">로또 게임 횟수");
		int gameNumber =sc.nextInt();   
		
		// 배열 생성
		lottos = new int[gameNumber][6];
		
		 fillLottos(lottos);
		
		dispLottos(lottos);
		
		
		
	} // main

	private static void fillLottos(int[][] lottos) {
		int index;	
		int n; // 랜덤 로또번호
		for (int i = 0; i < lottos.length; i++) {    //게임 횟수 만큼 반복
			// i=0 첫행 채우기
			index =0;   // 각 행의 채워넣고자 하는 위치,,
			Random rnd = new Random();
			while (index<=5) {
				n = rnd.nextInt(45)+1;     // 1~45
				if( ! isDuplicateLotto(lottos, i, n, index)) {  //중복이 안되면
					lottos[i][index++]=n;
				}
			}
			
		} // for
		
	}

	private static boolean isDuplicateLotto(int[][] lottos, int i, int n, int index) {
		for (int j = 0; j < index; j++) {//채워넣고자 하는 위치값까지
			if(lottos[i][j]==n) return true;  //중복되면 true
		} // for
		return false;
	}

	private static void dispLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d번째] : ",i+1);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.printf("[%02d]", lottos[i][j]);
			} // for
			System.out.println();   
		} // for
		
	}

}//class
