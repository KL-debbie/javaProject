package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 12:32:28
 * @subject P 38-40
 * @content
 */
public class P10 {
	public static void main(String[] args) {
		int age= 32;
		int year = 345523;
		
		System.out.println(age + year ); // =, -, *, / 사칙연산으로 적용
		// Syntax error on token ""/n"", delete this token
		System.out.println(); // 개행
		System.out.println("두 숫자의 합 : " + age + year ); // 1. 두 숫자의 합 : + 32
		                                                                    // 2. 두 숫자의 합 : + 32 + 325523
		                                                                    // 3. 두 숫자의 합 : ~~
		
		
		System.out.println("+ 연산결과: " + (age + year));  // 연산자들 먼저 계산하려면 () 넣어서 -최우선연산자
		System.out.println("- 연산결과: " + (age - year));
		System.out.println("* 연산결과: " + (age * year));
		System.out.println("/ 연산결과: " + (age / year));
		System.out.println("% 연산결과: " + (age % year));
	
	}

}
