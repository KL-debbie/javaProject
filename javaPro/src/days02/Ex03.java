package days02;

 
/**
 * @author KL
 * @date 2023. 7. 14. - 오전 10:21:38
 * @subject 지역변수 ( Local Variable )
 * @content 지역 변수는 {} 안에서만 사용 가능, 중복 시 오류 (문제 1)
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// String-%s, 여러문자, int- %d,정수, double- 실수
		// 한 문자를 저장하는 자료형 : char
		// 자바에서 문자를 나타낼 때는 '한문자'\
		
		char grade = 'A';
		// 코드영역(블럭)
		// {} 영역(범위) 연산자
		{
			 // grade가 블럭 안에서만 사용되는 local variable(지역변수)
			System.out.printf("등급 : '%c'",  grade);
		
		} // grade가 블럭 안에서만 사용되는 local variable(지역변수)
		
		// grade cannot be resolved to a variable : grade 변수를 선언 x, 인식 x
		System.out.printf("등급 : '%c'",  grade);
		
		
	} //main
	
} //class

