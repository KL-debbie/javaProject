package days01;

//
/* ~ */

//Alt + Shift + J
/**
 * @author KL
 * @date 2023. 7. 13. - 오후 3:36:45
 * @subject 자바의 변수와 상수
 * @content 1. 개념
 *                2. 변수 선언 형식
 *                3. 예제
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1. 변수(variable)
		//    1) 변하는 수(수학적 의미)
		//    2) 메모리상의 값을 저장 공간(프로그램 언어)
		
		// 2. 상수(const)
		//    1) 변하지 않는 수(== 고정된 수)
		//    2) 메모리상의 값을 저장 공간(프로그램 언어)
		
		//[선언 형식] 1. class 선언, 2. 함수(메서드)
		// 3. 변수를 선언하는 형식
		//    자료형 변수명 [=초기값];
		//    자료형 == 데이터 타입(data type)
		
		
		// 4. 실습
		// ; 세미콜론 - 명령라인 종결 연산자
		// 고경림 cannot be resolved to a variable - 에러메시지 확인 후 검색
		// 자바에서 문자열(==문자의 나열)   "문자열"
		// 자바에서 한 문자                     '이'
		// '', ' 없이 문자                       변수로 인식
		//System.out.println(고경림);
		
		// 이름을 저장하는 문자열 변수 선언
		
		// 변수 이름을 명명하는 규칙 p26 
		String name = "고경림"; // = 대입(할당) 연산자
		System.out.println( name );
		
		
		// Duplicate local variable name
		// name 로컬(지역)변수 중복 선언
		// String name = "고경림";
		
		name = "고민지";
		System.out.println( name );
		
		
	} // main

} // class
