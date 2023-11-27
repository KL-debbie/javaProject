package days15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.lang.*; // import 자동
import static java.lang.Math.random;

// import


public class Ex06 {
	
	public static void main(String[] args) {
		
		
		/*
		 * 1. 패키지(package)
		 * 		1) 서로 관련된 클래스들, 인터페이스들의 묶음
		 * 		2) 클래스를 효율적으로 관리
		 * 		예) java.io 패키지 - 서로 관련된 클래스
		 * 			input/output 입출력
		 * 		3) 클래스의 이름이 충돌하는 것을 막아줌
		 * 			다른 개발자가 구현한 클래스 라이브러리의 클래스와 이름이 충돌되는 것을 피할 수 있음.
		 * 		4) 자신만이 사용할 패키지 체계가 있어야 함.
		 * 			ex) 도메인명
		 * 		5) 클래스는 물리적으로(컴파일 하고) 나면 ???.class(클래스파일)	
		 * 			패키지 -> 물리적 -> 디렉토리 생성
		 * 			예) java.lang.System 클래스
		 * 
		 * 				java폴더
		 * 					ㄴ lang 폴더	
		 * 							ㄴ System.class 파일
		 * 		6) 선언형식
		 * 			소스파일의 첫 번째 라인(문자) 단 한번 선언.
		 * 			package 패키지명.패키지명;
		 * 		7) 패키지명은 소문자로 작명
		 * 
		 * 2. import문
		 * 		1) 소스파일에서 다른 패키지의 클래스를 사용하려면 패키지명이 포함 된 클래스 이름을 사용해야 한다
		 * 		2) 패키지이름 + 클래스이름 = 클래스의 풀네임
		 * 			java.io.클래스명
		 * 		3) 풀네임
		 * 			ㄴjava.lang.System.out.println -- 원칙
		 * 		4) import 문을 사용해서 미리 풀 네임 명시
		 * 		import java.lang.System;
		 * 		클래스명으로 바로 사용 가능 
		 * 
		 * 		5) import 문 X, ctrl + shift + o ==>import구문 선언
		 * 			 
		 * 		6)import java.io.*  ---> 자바 내의 모든 클래스 임포트  
		 * 		import java.io.BufferedReader;
		 *		import java.io.InputStreamReader;
		 *
		 *		7) static import문
		 * 		
		 */
		
		// static random(), PI
		// System.out.println( Math.random() );
		System.out.println( random() );
		// System.out.println( Math.PI );
		
		
	} // main

}//class
