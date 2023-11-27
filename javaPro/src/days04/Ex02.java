package days04;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 18. - 오전 10:05:28
 * @subject String.trim() - 매개변수 X, String 반환 메서드, 앞&뒤 공백 제거
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// String.trim()  
		/*
		String sKor = " 90   ";     // trim 사용 시 앞 뒤 공백 제거
		int kor = Integer.parseInt(sKor.trim());
		System.out.printf("kor=%d\n", kor);
		 */
		
		Scanner scanner = new Scanner(System.in);
		double x ;
		
		System.out.print("실수 입력 ?");
		x = scanner.nextDouble();
		
		// 연산자 우선순위  cast연산자  > / 산술
		x = (int)(x * 100 + 0.5)/100d;
		
		System.out.printf("> 결과 : %f",x);
		
		
		
		
	}

}
