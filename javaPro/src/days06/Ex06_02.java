package days06;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 20. - 오후 12:37:04
 * @subject
 * @content
 */
public class Ex06_02 {
	
	public static void main(String[] args) {
		
		// 구구단 출력 while 문 사용
		int dan =2;
		int i = 1;
		while (dan<=9) { // dan 2~9반복
			System.out.printf("[%d단]\n",  dan);
			i=1; // while 문 실행되기 전 초기화시키기 
			while (i<=9) {  // i를 다시 1로 초기화 시키기
				System.out.printf("%d*%d=%d\n", dan, i,  dan*i);
				i++;
			}//while
			dan++;
			//i=1;
		} //while
		
				
		
	} // main

}// class
