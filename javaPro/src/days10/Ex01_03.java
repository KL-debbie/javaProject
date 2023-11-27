package days10;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 26. - 오전 9:51:45
 * @subject 복습 2번   8과 16으로 바꾸기
 * @content
 */
public class Ex01_03 {
	public static void main(String[] args) {
		// 16진수
		// 0123456789ABCDEF

		int n =125;   //0x7D
		int share, reminder;

		String hex = "0123456789abcdef";
		StringBuilder sb = new StringBuilder();
		// 문자열 다루는 클래스 

		while (n != 0) {
			share= n / 16;
			reminder= n % 16;
			sb.append( hex.charAt(reminder) ) ;  //append 끝에 붙여나가기..누적누적..
			n = share;
		}//while
		System.out.printf("0x%s",sb.reverse());	  //reverse 문자열 앞뒤 뒤집어서
	}


}
