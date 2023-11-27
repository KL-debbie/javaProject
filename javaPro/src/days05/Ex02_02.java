package days05;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 19. - 오전 10:30:46
 * @subject  복습 6번 풀이
 * @content
 */
public class Ex02_02 {
	public static void main(String[] args) {
		
		// "a" -> 'a'     "a".charAt(0)   첫번째 문자 가져오기
		
		// char -> String변환
		// 'a' + ""
		// String.valueOf('a');
		// Character.toString('a');
		
		// String -> char 변환
		String name = "kenik";
		// 내가 원하는 위치의 한 문자를 얻어오고 싶음.
		// ㄴ 기능 함수 :           char(문자열.charAt(index)   -- 
		
		/*
		System.out.println( name.charAt(0) );
		System.out.println( name.charAt(1) );
		System.out.println( name.charAt(2) );
		System.out.println( name.charAt(3) );
		System.out.println( name.charAt(4) );
		*/
		
		// 문자열 가져오는 코딩
		// ㄴ System.out.println( 문자열.length());
		
		System.out.println( name.length() );
		int len = name.length(); 
		for (int i = 0; i < name.length(); i++) {
			System.out.println( name.charAt(i) );	
		} // for
		
		// 문자열 다루는 메서드(함수)
		// 1. split()
		// 2. length()
		// 3. chatAt()
		// 4. valueOf()
		// 5. toString()
		// 6. toCharArray()   문자열 String을 char[]로 반환하는 함수
		
		
	} // main

}
