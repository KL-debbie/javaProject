package days06;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 20. - 오후 12:06:47
 * @subject 제어문 활용
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int n;
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 정수 (n) 입력 ? ");
			String inputData = scanner.nextLine(); 
			
			// 비밀번호 8~15, 숫1, 알대 1, 알소 1, 특수문자 1
			
					
			// 정규 표현식(regular expression)
			// 0~9 숫자로만 이루어진 문자열 체크하는 정규표현식 찾기
			// String regex= "[0-9]+";  //반복횟수가 1개 이상
			// String regex= "^[0-9]+$";  // 처음부터 끝까지 숫자 1개 이상으로 이루어짐
			
			String regex= "^\\d+$"; //== "^[0-9]+$";
			// Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
			// \ 쓸때는 \ 하나더 붙이기
			boolean flag = inputData.matches(regex);
			
					
			if( flag ) {   
				n = Integer.parseInt(inputData);
				System.out.println( n );

			}else{
				System.out.println("잘못입력");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}//main

}//class
