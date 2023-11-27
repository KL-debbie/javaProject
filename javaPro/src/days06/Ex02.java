package days06;

import java.io.IOException;

/**
 * @author KL
 * @date 2023. 7. 20. - 오전 11:17:06
 * @subject 복습 3번
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		int code;
		
		// Syntax error on token "continue", invalid Variable Declarator Id  continue 토큰 문법에러, 변수 선언자 ID가 잘못되었다.
		// 예약어 -> 변수명 사용 불가
		char con = 'y';
		
		do {
			
			System.out.print("한 문자를 입력? ");
			code= System.in.read();
			System.out.printf("code=%c\n",(char)code);
			
			System.in.skip( System.in.available());
			
			System.out.println("\n\n 계속할거냐? ");
			// br, scanner, System.in.read()로 불러오기 가능
			code= System.in.read(); // 'y' or 'n' 
			con =(char)code;
			
			System.in.skip( System.in.available());
			
		} while ( con== 'y' || con =='Y' );  //'y', 'Y'일때만 실행
		
		System.out.println(" end ");
		
		/*
		System.out.print("한 문자를 입력? ");
		code= System.in.read();
		System.out.printf("code=%c\n",(char)code);
		// System.in   입력스트림 ['a']['\r']['\n']
		// a 엔터('\r', '\n')
		// 0~255 int read() next 1byte
		System.in.skip( System.in.available());   // 남아있는 만큼 다 스킵하겠음
		
		System.out.print("한 문자를 입력? ");
		code= System.in.read();
		System.out.printf("code=%c\n",(char)code);
		*/
		
	} //main

} //class
