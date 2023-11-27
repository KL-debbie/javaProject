package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 8:51:15
 * @subject P 46 or 연산
 * @content
 */
public class P14_01 {

	public static void main(String[] args) {

		char gender = 'M';
		int score = 88;
		
		System.out.println(gender == 'M' | score >= 80);   // 양쪽 조건 중 하나만 참이어도 전체 결과를 참(true)으로 처리
		System.out.println(gender == 'M' | score <= 80);

		// System.out.println(gender == 'M' | (score %0) == 0); // 왼쪽 조건이 참이면 오른쪽은 평가 x, 하지만 '|' 사용하여 양쪽조건 평하하기 때문에 에러 발생
		//Exception in thread "main" java.lang.ArithmeticException: / by zero at Prac.P14_01.main(P14_01.java:19)
		
		
		System.out.println(gender == 'M' || (score %0) == 0);
	}

}
