package days09;

import java.util.Arrays;

/**
 * @author KL
 * @date 2023. 7. 25. - 오전 10:11:23
 * @subject 복습 6번
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		int n =10;

		//3) 제어문 활용
		/*
		2 10
		2  몫 5  ----나머지 1
		2  몫 2 -----------0
		 */
		int share, reminder; //share=몫, reminder=나머지
		String s ="";
		
		int [] binaryArr = new int[32];
		int index = binaryArr.length -1;  // 배열의 마지막 방
		
		
		while(n!=0) {
			share=n / 2;        
			reminder=n % 2;   //0
			System.out.println(reminder);
			binaryArr[index--] = reminder;
			s+= reminder;
			n= share;
		}//while
		System.out.println(Arrays.toString(binaryArr).replace(",",""));
		
		// StringBuilder, StringBuffer, String 문자열 다루는 클래스
		// StringBuilder br= new StringBuilder();
		// 가장 뒤에서부터 채워넣기
		
		/* 반복
		share=n / 2;
		reminder=n % 2;   //1
		System.out.println(reminder);
		n= share;
		 */  

		
		/* 1)
		String s ="000000000000000000000000";
		String b = Integer.toBinaryString(n);

		s+=b;
		System.out.println( Integer.toBinaryString(n) );  // 1010

		// 오버로딩, 중복함수
		// s.substring(beginIndex);
		// s.substring(beginIndex, endIndex);

		System.out.println(s.substring(b.length()));
		 */

		// 2)
		/*
		String b = Integer.toBinaryString(n);
		System.out.println(b);  //1010

		//"1010"문자열 ->1010 정수 변환
		// System.out.printf("%032d\n",Integer.parseInt(b));
		String s = String.format("%032d\n",Integer.parseInt(b));
		System.out.println(s);
		 */



	} // main

}//class
