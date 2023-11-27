package days01;

public class Ex05 {

	public static void main(String[] args) {
		
		// 1) + 덧셈 연산자
		System.out.println( 3+5 ); // 8
		
		// 2) + 문자열 연결 연산자
		System.out.println( "이름: " + "고경림"); // " 이름: 고경림"
		
		String name = "고경림";
		System.out.println( "이름: " + name ); // " 이름: 고경림"
		
		
		// 3) + 문자열 연결 연산자
		// "문자열" + 정수
		// 정수 + "문자열"
		System.out.println( "이름: " + 20 ); // "이름: 20"
		
		
		/* Multiple markers at this line
		- The value of the local variable age is not used
		- Line breakpoint:Ex05 [line: 22] - main (String[])
		 */
		 // The value of the local variable age is not used
		int age = 29;
		System.out.println( "나이: " + age); // "나이: 29"
		
		
	} // main

}  // class
