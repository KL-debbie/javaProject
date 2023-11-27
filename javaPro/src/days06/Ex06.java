package days06;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 20. - 오후 12:37:04
 * @subject
 * @content
 */
public class Ex06 {
	
	public static void main(String[] args) {
		
		// 구구단 출력
		// 2단
		
		
		// 중첩for문
		for (int dan = 2; dan <=9; dan++) {
			
			System.out.printf("[%d단]\n", dan);
			for (int i = 1; i <=9; i++) {
				System.out.printf("%d*%d=%d\n", dan, i, dan*i);
				
			} // for
		} // for dan
	} // main

}// class
