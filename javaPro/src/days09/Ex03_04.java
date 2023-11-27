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
public class Ex03_04 {

	public static void main(String[] args) {

		String rrn = "950525-2471226";
		boolean checkSum = checkRRN(rrn);
		
		if (checkSum) {
			System.out.println("올바른 주민번호");
		} //if
		else System.out.println("잘못된 주민번호");
	} // main

	private static boolean checkRRN(String rrn) {

		int total =0;
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i <=12; i++) {
			total	+=(rrn.charAt(i) - '0')*m[i];
		} // for
		int check =(11-total%11)%10;
		//check %= 10;
		int ㅍ = rrn.charAt(13)-'0';
		return ㅍ == check;
	}

}//class


