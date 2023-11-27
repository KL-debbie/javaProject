package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 3:18:32
 * @subject  대문자 -> 소문자 변환
 * @content  소문자 -> 대문자 변환
 */

public class Ex07 {

	public static void main(String[] args) {

		// char lowerCase(소문자) , upperCase(대문자)

		char lowerCase , upperCase;

		lowerCase = 'x';

		//  upperCase 변수에는 lowerCase의 대문자를 저장해서 출력.
		// 'A' 65 -> 'a' 97
		// 소문자 - 32 = 대문자

		// upperCase= lowerCase -32;
		// Type mismatch: cannot convert from int to char
		
		// 소문자 -> 대문자
		upperCase= (char) (lowerCase -32);
		System.out.printf("%c\n", upperCase);

		// 대문자 -> 소문자
		lowerCase = (char) (upperCase +32);
		System.out.printf("%c\n", upperCase);
		
		// '0'  48    ASCII 코드값
		// '2'  50
		// '4'  52
		//                         52 - 50
		System.out.println( '4' - '2' );    //2
		
	} // main

} // class
