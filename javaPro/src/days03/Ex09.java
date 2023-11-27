package days03;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 3:44:22
 * @subject   (시험) 두 문자열 비교
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// The value of the local variable name1 is not used
		// 변수를 선언했는데 사용되지 않고 있음
		String name1 = "홍길동", name2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 비교할 이름을 입력하세요?");
		
		// String name2;
		name2 = scanner.next();
		
		// 디버깅
		System.out.printf("[%s]\n", name2);     // ctrl + shift + B : 중단점   --> 디버깅 예정
		
		//Debug Current Instruction Pointer
		//System.out.println(  name1 == name2  );    // 왜 false값....?
		
			
		//(암기) 두 문자열을 비교할 때는 equals() 사용
		System.out.println(  name1.equals( name2 )  );    // 왜 false값....?
		// 대소문자 구분하지 않고 문자열 비교
		System.out.println(  name1.equalsIgnoreCase( name2 )  );    // 왜 false값....?
		
		scanner.close();
	} // main

} // class
