package days09;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 25. - 오후 12:45:36
 * @subject 주민번호
 *               - 생년월일
 *               - 성별 세기 내국인/외국인
 *               - 세는나이/만나이
 *              !!! - 주민번호 검증
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		//ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		// 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
		String rrn = "950525-2471226";
		boolean checkSum = checkRRN(rrn);
		if (checkSum) {
			System.out.println("올바른 주민번호");
		} //if
		else System.out.println("잘못된 주민번호");
	} // main

	private static boolean checkRRN(String rrn) {
		// 2가지 방법
		// 1)   char charAt(0)          -> int
		// 2)   String substring(0,1) -> int
		int total =0;
		
		int ㄱ= rrn.charAt(1) -'0';       //'8'의미함 -> 8 정수로 바꿔줌
	//	int ㄴ= Integer.parseInt(rrn.substring(1, 2) );
	
		total += ㄱ*2;

	//	int ㄴ = rrn.charAt(0);
		
		int check =11-total % 11;
		if(check==10)check= 0;
		   else if( check==11) check=1;
	      
	      int ㅍ = rrn.charAt(13) - '0';
	      
	      return ㅍ == check;
	   }

}//class

/*
int [] number = new int[8];
char [] word = new char[11];

for (char i = 'ㄱ'; i <='ㅌ'; i++) {
	for (int j = 2; j <=9; j++) {
		if( number[j] == char[i]) return i*j;
	} // for
} // for
 */

