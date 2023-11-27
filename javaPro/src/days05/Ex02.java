package days05;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 19. - 오전 10:30:46
 * @subject  복습 6번 풀이
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		
		// 한 문자 입력...
		char one;
		// BufferedReader br
		// Scanner sc
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("한 문자 입력?");
			/*
			sc.next();         // String
			sc.nextInt();     // int
			sc.nextByte();   // byte
			sc.nextShort();  // short
			sc.nextLong();  //long
			*/
			
			// sc.nextchar  형식이 없음
			// "a" = 'a' + '\0' -> 'a' 변환  문자열을 한 문자로 변환(문자에서 한 단어만 추출)
			
			String inputData = sc.next();
			one = inputData.charAt(0);
			
			if ('0' <= one && one <='9') {
				System.out.println("숫자");
			} else if ('A'<= one && one <='Z' || 'a'<= one && one <='z') {
				System.out.println("알파벳");
			} else if ( '가' <= one && one <='힣' ) {
				System.out.println("한글");
			} else if (one == '#' || one == '$' || one == '!' || one == '%' || one == '@' ){  // #$!%@
				System.out.println("특수문자");
			} else {
				System.out.println("X");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		
		
		
	} // main

}
