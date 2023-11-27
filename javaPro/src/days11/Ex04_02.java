package days11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author KL
 * @date 2023. 7. 27. - 오후 12:06:32
 * @subject days10.Ex09
 * @content*************************시험
 */
public class Ex04_02 {
	public static void main(String[] args) {
		
		// 문제) int [] m  = new int[30];        0~9  임의의 정수
		// 0 - 3개
		// 1 - 0개
		// :
		// 9 - 4개
		int n;
		int [] m= new int[30];
		
		//counts[0] = 0갯수
		//counts[1] = 1갯수
		//counts[2] = 2갯수
		//     :
		//counts[9] = 9의갯수
		
		int [] counts = new int[10];
		for (int i = 0; i < m.length; i++) {
		//	m[i] = (int)(Math.random()*10);
			n=getRandomInt(0,9);
			m[i] = n;
			counts[n]++;
		} // for
		
	} // main

	// 3-14 사이 임의의 정수 가져오기
   //	3<=(int)Math.random()*12+3<15
	//	min<=(int)Math.random()*(max-min+1)+min<max+1
	
	public static int getRandomInt(int min,int max) {
		return (int)(Math.random()*(max-min+1))+min;
	}
}//class
