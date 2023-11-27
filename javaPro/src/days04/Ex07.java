package days04;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 18. - 오후 2:28:08
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// for( 초기식; 조건식; 증감식)
		// 초기식은 밖에 선언해도 무관
		// 증감식도 동일
		/*
		int sum =0, i = 1;// main에서 사용하는 지역변수
		for (    ;    ;    ) { // 무한루프
			if(i>10) break;  //무한루프 빠져나가기
			System.out.printf("%d+",i);
			sum +=i;
			i++;
		} // for
		 */

		/*
		int sum =0 ;// main에서 사용하는 지역변수
		for ( int i = 1, j =1, k=10 ; i <= 10 && k<=10 || j>-100  ; i++, j--, k+=2 ) { //초기식, 증감식 여러개 선언 가능. 조건식도 여러개여도 무관.. 참/거짓으로 판별되면 가능
			System.out.printf("%d+",i);
			sum +=i;
		}  // for
		 */
		
		// [문제] 1~10 합을 출력하세요.
		/*
		int sum =0 ;// main에서 사용하는 지역변수
		for ( int i = 10 ; i >= 1; i-- ) { //초기식, 증감식 여러개 선언 가능. 조건식도 여러개여도 무관.. 참/거짓으로 판별되면 가능
			System.out.printf("%d+",i);
			sum +=i;
		}  // for
		*/
		
		
		int sum =0 ;// main에서 사용하는 지역변수
		for ( int i = 10 ; i >= 1; i-- ); { //초기식, 증감식 여러개 선언 가능. 조건식도 여러개여도 무관.. 참/거짓으로 판별되면 가능
			//System.out.printf("%d+",i);
			//sum +=i;
		}  // for
		System.out.println("test");
		// Unreachable code
		System.out.printf("\b=%d\n",sum);
		// 결과값 오류나지 않음 이유?? 결과값 : test =0
	
		
		// 자동약어 구분 window-preference-검색 : java , temple
	
	} // main

} //class
