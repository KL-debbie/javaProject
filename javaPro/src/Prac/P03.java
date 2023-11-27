package Prac;

/**
 * @author KL
 * @date 2023. 7. 15. - 오후 10:12:07
 * @subject p 21 세미콜론(;), 종료블록 } 미기입시 발생하는 오류
 * @content
 */
public class P03 {
	
	public static void main(String[] args) {
	
		System.out.print("Hello");
		
		// System.out.print("Hello")
		// 오류 Syntax error, insert ";" to complete BlockStatements
		// 세미콜론(;) 이 빠졌다.
		// 세미콜론(;) - 명령 종료 의미
		
		
		System.out.println("World");
	
	}
} //Syntax error, insert "}" to complete ClassBody
   //클래스에 대한 종료 블록이 없음