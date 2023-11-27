package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 10:48:37
 * @subject P 50 자동 변환
 * @content
 */
public class P16_01 {
	public static void main(String[] args) {
	
		
		
		double doubleAvg= 89.94; 
		
		// Type mismatch: cannot convert from double to int
		// 형 불일치 : int형 변수 타입 불일치
		int intAvg = (int) doubleAvg;
		
		
		System.out.println("int로 변환된 평균값 : " + intAvg);
		
	}

}
