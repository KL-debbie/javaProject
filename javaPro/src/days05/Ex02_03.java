package days05;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 19. - 오전 10:30:46
 * @subject  복습 6번 풀이
 * @content
 */
public class Ex02_03 {
	public static void main(String[] args) {

		/* 1) 직접 배열 선언 후 for문 사용해서 처리

		String name = "kenik";
		// String -> char [] 변환 -> char 배열[0]

		char [] nameArr = new char[name.length()];
		// [k] [e] [n] [i] [k]
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = name.charAt(i);
			// 각각 단어 할당
		} // for
		 */

		// 2)
         String name = "kenik";
         char [] nameArr = name.toCharArray();
         // for (int i = 0; i < nameArr.length; i++) {
     	//	nameArr[i] = name.charAt(i);
         // 이 기능을 하는 수식
         System.out.println(nameArr[0]);

	} // main

}
