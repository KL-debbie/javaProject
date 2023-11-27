package days09;

import java.util.Arrays;

/**
 * @author KL
 * @date 2023. 7. 25. - 오후 4:29:32
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * [배열] + 제어문
		 *  1. 자료형
		 *    기본형(8가지)
		 *      ㄴ 숫자형
		 *           ㄴ 정수형
		 *                ㄴ  문자
		 *      ㄴ 논리형
		 *    참조형 = [배열], 클래스,인터페이스
		 *  2. 정의 - 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것.(array)
		 *  3. 배열 선언   
		 *         자료형 [] 변수, 참조변수, 배열명;
		 *         예) int [] m;
		 *          동적영역(heap)                         스택(stack)영역
		 *           lowerbound     upperbound
		 *           첨자값 == index값
		 *           0요소    1요소    2요소
		 *          [4byte][4byte][4byte]           [    0x100주소값   ]
		 *          0X100                                         m
		 *      배열 생성
		 *       m = new int[3]
		 *  4. 배열의 크기 = 배열명.length
		 *      upperbound =  배열명.length -1
		 *      (윗첨자값)  
		 *      lowerbound = 0
		 *      (아랫첨자값)
		 *  5. 예)     
		 */
		
		int [] kors = new int[3];
		
		// 100점을 기본값으로 설정 100으로 초기화
		/*
		for (int i = 0; i < kors.length; i++) {// 아랫첨자값부터 윗첨자값까지
			kors[i]=100;
		} // for
		*/
		
		// Arrays 클래스 - 배열을 사용하기 쉽도록 기능(함수)이 구현된 클래스
		// 1) Arrays.toString(kors)
		// 2) Arrays.fill(kors, 100); // kors 속 모든 배열안에 100으로 초기화  :: fill 함수
		kors = null; //더이상 참조되지 않고 떠다니며 메모리만 차지 (가비지)- 가비지컬렉터
		//오류  NullPointerException
		
		dispKors(kors);
				
		
		
	} // main

	private static void dispKors(int[] kors) {
		for (int i = 0; i < kors.length; i++) {// 아랫첨자값부터 윗첨자값까지
			System.out.printf("kors[%d]=%d\n",i,kors[i]);
		} // for
		
	}

}//class
