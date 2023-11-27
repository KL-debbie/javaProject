package days02;

/**
 * @author KL
 * @date 2023. 7. 14. - 오전 11:04:27
 * @subject 표준 입력, 표준 출력 => System 클래스
 * @content 객체==개체==Object==클래스==물건
 *                 System 클래스 안에 [표준 출력 함수]
 *                 1. println()
 *                    void	println​(String x)
 *                 2. printf()
 *                    PrintStream	printf​(String format, Object... args)
 *                 3. print()
 *                    void	print​(char c)
 * @ 시험문제   함수 3가지 파악                
 */


public class Ex05 {

	public static void main(String[] args) {
		// java.lang 패키지 안에 있는 System 클래스
		//java.lang.System.out.함수호출(출력할 값);
		 java.lang.System.out.println("감나무");
		// 함수(메서드) 3가지 파악 => 정확히 사용 가능
		//  1. 함수의 기능(일) 파악
		//  2. 함수가 일 처리를 할 때 필요한 값 파악 (매개변수, 파라미터, 인자, 인수)
		//  3. 함수가 일 처리를 한 후에 반환(리턴)하는 값 파악(리턴값, 리턴자료형)
		// https://docs.oracle.com/en/java/javase/11/
		 
		 

		// 예) main() 함수
		//  1. 기능? 프로그램 시작/종료
		//  2. 매개변수? (문자열 - String) [배열] args) 
		//  3. 리턴값 X, 리턴자료형 void 선언
		// args == arguments == 인자들
		
		// System.out.printf("홍길동").printf("20");
		System.out.println("홍길동");
		System.out.println("감나무");
		System.out.println("홍길자");

		
		// 개행(줄바꿈) 방법
		System.out.print("홍길동" + '\n');
		System.out.print("감나무\n");
		System.out.println(); // 개행
		System.out.println("홍길자");
		// Alt + Shift + A + del 문자 지우기 
		
	} // main
	


} // class
