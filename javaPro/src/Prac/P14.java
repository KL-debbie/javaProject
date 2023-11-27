package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 8:51:15
 * @subject P 45 And 연산
 * @content
 */
public class P14 {

	public static void main(String[] args) {

		char gender= 'M';
		int score = 87;

		System.out.println(gender == 'M' & score >=80 ); //gender와 score 결과 모두가 참이면 전체결과를 참으로 처리
                                                                       		// 연산 결과가 하나라도 거짓이면 전체 결과가 거짓

		System.out.println(gender =='F' & score <=80); // 왼쪽 조건이 이미 'false' 그래서 전체값 거짓
		
		//System.out.println(gender == 'F' & (score % 0) == 0);
		// Exception in thread "main" java.lang.ArithmeticException: / by zero at Prac.P14.main(P14.java:21)
		// 정수를 0으로 나누면 발생하는 예외
		
		System.out.println(gender == 'F' && (score % 0) == 0);
	}

}
