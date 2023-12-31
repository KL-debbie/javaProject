package days02;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 2:43:42
 * @subject   문자형       char(2)
 * @content
 */

public class Ex12 {

	public static void main(String[] args) {
		 // 문자형         char(2)
		// [진법 변환]
		// 
		// 10 진수  : 0 1 2 3 4 5 6 7 8 9
		// 2 진수    : 0, 1 ->컴퓨터
		//
		byte b = 10; // [00001010]
		// int i = 10; // [00000000 00000000 00000000 00001010]
		
		char x ='A'; // 2진수로 변환하여 저장, 정수 65 -> 2진수로 나타내기 ASCII 7비트( 128가지 )
		// 자바 유니코드 2바이트 [00000000] [01000001]
		// 확장 ASCII 8비트 ( 256가지 문자 )
		//인코딩( encoding )  'A' => 65 변환   ~을 코드화 한다.
		//디코딩                   65 => 'A' 변환   
		
		// '\u0000' ~ '\uffff' 00 하나가 한바이트
		// 16진수 61 -> 10진수 ?
		char d ='\u0061';
		System.out.printf("d : %c\n", d); // 'a' - 97, 'A' - 65
		
		// 대문자 - 소문자 = 65 - 97 = - 32(차이남)
		
		
	} //main

} // class
