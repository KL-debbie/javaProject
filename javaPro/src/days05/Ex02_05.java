package days05;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 19. - 오전 10:30:46
 * @subject  복습 6번 풀이 2)
 * @content
 */
public class Ex02_05 {
	public static void main(String[] args) {
		
	
		char one;
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("한 문자 입력?");
			String inputData = sc.next();
			
			String regex ="[#@$!]";     //[] 안 하나만 일치해도 됨  알파벳모음[aeiouAEIOU], [^aeiouAEIOU] -모음 제외한 문자(알파벳자음), 
			if(inputData.matches(regex)) {
				System.out.println("특수문자");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		
		
		
	} // main

}
