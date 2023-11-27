package days02;

/**
 * @author KL
 * @date 2023. 7. 14. - 오전 10:02:47
 * @subject  식별자와 키워드 구분
 * @content 변수, 상수, 리터럴 용어 구분
 *                상수 문법 - 모두 대문자, final, _사용, 초기값 지정시 변경 불가
 */
public class Ex02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
		 * 키워드(keyword) : 의미가 부여된 예약어
		 * 식별자(identifier) : 개발자가 부여한 이름들 ( ex- 변수명, 클래스명, 함수명 등)
		 */
		// String name ; ===> String : 예약어, name : 식별자
		String name; //
		name = "kk";
				
		

		//변수와 상수
		// - 값을 저장하는 메모리상의 저장공간
		// - 변하는 수, 고정된 수
		
		// 원주율 PI 
		// 변수 ( 숫자: 정수, 실수)
		// 자료형 상수 [=초기값];
		// 고정된 값을 가진 기억공간
		// 상수는 대문자로 작성!
		
		// String firstName 변수
		// String FIRST_NAME 상수, MAX_VALUE, MIN_VALUE
		
		// The value of the local variable PI is not used
		final double PI = 3.141592;
		
		//The final local variable PI cannot be assigned. It must be blank and not using a compound assignment(의미확인)
		//PI = 3.199;
		
		
		// 리터럴 - 1, true, 'A' , 3.14 처럼--고정된 값(상수)
		
	} // main

} // class
