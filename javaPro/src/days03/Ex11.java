package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 4:40:58
 * @subject  (시험)*******인덱스 연산자 설명**
 * @content                    [     ]
 *                             String[] args   
 *                             String args     - 문자열의 매개변수가 필요함
 */
public class Ex11 {

	public static void main(String[] args) {
		
		//[ ]  -  인덱스 연산자
		
		// 1. 국어점수를 저장할 변수 선언.
		// int kor;
		
		// 2. 국어점수를 5만명 저장할 변수 선언.
		/*
		int kor00001;
		int kor00002;
		int kor00003;
		:
		int kor50000;
		*/
		
		/*
		int 감나무kor;
		int 꽃나무kor;
		*/
		
		// 인덱스 [] 연산자를 사용하여 배열 선언
		/*
		 * 참조형 : 배열, 클래스, 인터페이스 -new 연산자에 의해
		 * 
		 *  1. 배열 정의 : 동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것.
		 *  2. 배열 선언 형식
		 *     자료형 [] 배열명 = new 자료형 [배열크기]; 
		 *     자료형  배열명 [] = new 자료형 [배열크기]; 
		 */
		
		// ex)
		int [] kors = new int[5];
		// int  kors [] = new int[5];
		
		
		System.out.println( kors.length );  // 배열크기
		System.out.println( kors.length-1 );  // 배열크기-1 = 윗첨자값
		
		kors[0] =90;
		kors[1] =100;
		kors[2] =80;
		kors[3] =70;
		
		System.out.println( kors [0]);
		System.out.println( kors [1]);
		System.out.println( kors [2]);
		
		
		
	} // main

} // class
