package days07;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 21. - 오후 12:31:25
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {

		// 2. 1+2+4+7+11+16+ ...+191= ???  규칙적인 수열 (1,2,3 --증가) 항의 갯수가 20개까지 합 구하기
		//       1  2   3  4     ...-? 계차수열,,
		// 1+(n-1)n
		//[2] 
		int term =1; //일반항         1+2+4+7+11+16+ ...+191=
		int defference= 0; //계차     1  2   3  4     ...-? 계차수열,, 계차+초항 => 20번 반복
		int sum =0;  //총합
		
		/*
		for (int i = 1; i <=20; i++) {
			term +=defference;
			System.out.printf("%d+",term);  //1+
			sum +=term;
			defference++;  //1
		} // for
		System.out.printf("\b=%d\n",sum);
		*/
		
		
		/*
		int term1;
		for (int i = 1; i <=20; i++) {
			// (n^2-n)/2+1
			term1=(int)(Math.pow(i,2)-i/2+1);
			System.out.printf("%d+",(Math.pow(i, 2)-i)/2+1);
		} // for
		*/
		
		
	}//main

}//class
