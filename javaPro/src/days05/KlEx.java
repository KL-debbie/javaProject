package days05;

import java.util.Scanner;

public class KlEx {
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
		System.out.printf("%02d-헬로우월드\n", i);	
		} // for
		
		//한 문자 입력받아 숫자,알파벳,한글,특수문자
		char one;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("한 문자 입력");
			
			//String -> char
			String inputData = sc.next();
			one= inputData.charAt(0);
			String regex = "[!@#$]"; 
			
			if (Character.isDigit(one)) {  // '0' <=one && one <='9'
				System.out.println("숫자");
			} else if (Character.isAlphabetic(one)){
				System.out.println("알파벳");
			} else if ('가' <=one && one <='힣') {
				System.out.println("한글");
			} else if (inputData.matches(regex)) { // one == ! || one ==@ || ----로 작성 가능
				System.out.println("특수문자");
			}else {
				System.out.println("X");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} //catch
	} // main

}
