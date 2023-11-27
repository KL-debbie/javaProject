package days04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// if 조건문
		// for 반복문
		// switch 분기문

		/*
		switch (key) {    // key : 변수, 수식(정수, 문자열, 문자)
		case value:       // value : 리터럴 o, 변수X, 상수, 문자, 문자열 가능
			 break;
		case value:
			break;
		case value:
			break;
			:
		[default:
			break;]  생략가능
		} // switch
		 */

		// 정수를 입력받아 짝,홀수 출력
		int n;

		try (Scanner scanner = new Scanner(System.in);){

			System.out.print("정수입력 ");
			n = scanner.nextInt();

			String result =null;    //String 기본값 = null
			switch ( n%2 ) {
			case 0:
				result = "짝수";
				break;
			case 1:
				result = "홀수";
				break;
				//default 그 외에 값 도출할때 작성

			} // switch
			
			// The local variable result may not have been initialized
			// result 값에 비해 케이스 수가 적을때 나타날 수 있음
			System.out.println(result);

		} catch (Exception e) {
		} // catch

		System.out.println(" end ");


	} // main

} //class
