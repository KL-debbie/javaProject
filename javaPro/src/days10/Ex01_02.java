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
public class Ex01_02 {
	public static void main(String[] args) {
		// 16진수
		// 0123456789ABCDEF

		int n =125;   //0x7D
		int share, reminder;

		char [] c = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String s ="";

		while (n != 0) {
			share= n / 16;
			reminder= n % 16;
			s = c[reminder]+s;
			n = share;
		}//while
		System.out.printf("0x%s",s);	
	}


}
