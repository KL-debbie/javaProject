package days05;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 19. - 오전 10:30:46
 * @subject  복습 6번 풀이 2)
 * @content
 */
public class Ex02_04 {
	public static void main(String[] args) {
		
	
		char one;
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("한 문자 입력?");
			
			String inputData = sc.next();
			one = inputData.charAt(0);
			String regex = "[!@#$]";
			
			if (   Character.isDigit(one)) {   // 숫자값 true/false                  [0-9] ==\d    
				System.out.println("숫자");
			} else if (Character.isAlphabetic(one)) {   //알파벳 true/false     [a-zA-Z]
				System.out.println("알파벳");
			} else if ( '가' <= one && one <='힣' ) {
				System.out.println("한글");
				//정규표현식 [#$!@]
			} else if (one == '#' || one == '$' || one == '!'  || one == '@' ){  // #$!%@
			// } else if (inputData.matches(regex) ){
				System.out.println("특수문자");
			} else {
				System.out.println("X");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		
		
		
	} // main

	
	
}
