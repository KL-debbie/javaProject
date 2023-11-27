package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 3:26:35
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// Type mismatch: cannot convert from double to float
		// float pi = (float) 3.141592;
		// float pi =  3.141592f;

		float pi =  3.141592f;
		// 소수점 4번째 자리에서 반올림 한 실수 값을 얻어와서
		// 출력                결과값  3.142
		
		
		System.out.printf("%.3f\n", pi);    // 실수값 출력 외에는 쓸 용도가 없음
		
		
		// [1]
		//변수에 저장해서 출력
		// pi = Float.parseFloat(String.format("%.3f", pi) );
		// System.out.println( pi );
		
		
		//[2]  복습 문제
		System.out.println( pi * 1000 + 0.5 ) ;                     
		System.out.println((int)(pi * 1000 + 0.5) );             
		System.out.println((int)(pi * 1000 + 0.5) /1000f );   
		System.out.println((int)(pi * 1000) /1000 );  
		
	} // main

	
} // class
