package days02;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 3:29:59
 * @subject   ㄴ. 실수계열     float(4), [double(8)]
 * @content   에러 메시지 확인 문제 6
 */

public class Ex14 {

	public static void main(String[] args) {
		// ㄴ. 실수계열     float(4), [double(8)]
		// 1. 오차가 있는 자료형
		
		float f ;     // 32비트 [0][00000000 8지수] [0 * 32개]
		double d; //  64비트 [0][00000000000 11지수] [0* 64개]
		
		//      9. 1234567 실수
		// 1001. 소수점 아래는 2곱하여 소수점 안나오게하기
		// 1001.000111111001101011011011...
		// 1.XXX    2^n 정규화 		
		// 1.001.000111111001101011011011....X 2^3
		
		
		//모든 실수자료형 double 기본으로 사용
		
		// Type mismatch: cannot convert from double to float
		// float pi = 3.14F; (F 접미사 붙여주기)
		//float pi= 3.14;
		//float pi = (float) 3.14;
		// double pi = 3.14;
				
				System.out.print("pi = %f, pi)");
		
	}// main

}// class
