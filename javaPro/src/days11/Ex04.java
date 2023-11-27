package days11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author KL
 * @date 2023. 7. 27. - 오후 12:06:32
 * @subject days10.Ex09
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		
		// 문제) int [] m  = new int[30];        0~9  임의의 정수
		// 0 - 3개
		// 1 - 0개
		// :
		// 9 - 4개
		
		int [] m= {1, 8, 8, 9, 1, 0, 9, 5, 1, 8, 5, 3, 9, 7, 7, 1, 6, 0, 6, 4, 7, 8, 4, 0, 1, 7, 7, 6, 9, 6};
		System.out.println( Arrays.toString(m));
		
		for (int i = 0; i <9; i++) {
			int count = 0;
			for (int j = 0; j < m.length; j++) {
				if(m[j]== i ) count++;
				
			} // for
			System.out.printf("%d - %d개\n",i,count);
			
		} // for
		
		/*
		int count0 = 0;
		for (int i = 0; i < m.length; i++) {
			if(m[i]== 0) count0++;
			
		} // for
		System.out.printf("0-%d\n",count0);
		*/
		
	} // main

}//class
