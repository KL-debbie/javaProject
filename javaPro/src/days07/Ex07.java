package days07;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 21. - 오후 12:31:25
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 1. 1/2+2/3+3/4+ .... +8/9+9/10= ??? 
		
		//[1]
		double sum =0;
		
		for (int i = 1; i < 10  ; i++) {
			sum +=(double)i/(i+1);
		System.out.printf("%d/%d+", i , i+1);
		} // for
		System.out.printf("\b=%f\n",sum);  //?????????
		
		
		// 2. 1+2+4+7+11+16+ ...+191= ???  규칙적인 수열 (1,2,3 --증가) 항의 갯수가 20개까지 합 구하기
		
		//[2]
		int sum1 =0;
	
	for (int i = 0; i < args.length; i++) {
		
		
	} // for
	
	
		/*
		boolean sw =false;
		int sum1=0;
		
		for (int i = 1; i <; i++) {
			
		} // for
		*/
		
	}//main

}//class
