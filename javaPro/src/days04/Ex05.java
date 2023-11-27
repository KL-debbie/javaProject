package days04;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 18. - 오후 12:28:13
 * @subject     for 반복문(암기)- 작업 반복시 사용
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		for ( 1) 초기식 ; 2) 조건식 ; 3) 증감식) {
			// i = 반복횟수 의미
			 		4) System.out.println("홍길동");
			 순서 1) -> 2) -> 4) -> 3)
			} // for
		*/
		// 1~10까지 합 출력
		// i=1  sum=1
		// i=2  sum=3
		// :
		// i=10  sum=55
		int sum =0;
		for (int i = 1; i <= 10 ; i++) {
			System.out.printf("%d+", i);
			sum = sum + i;
		} // for
		System.out.printf("=%d\n", sum);		
		
	
		
		
		
		
		
	} //main

} //class
