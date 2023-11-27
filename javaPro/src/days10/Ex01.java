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
public class Ex01 {
	public static void main(String[] args) {
		// 16진수
		// 0123456789ABCDEF

		int n =125;   //0x7D
		int share, reminder;

		char [] c = {'A','B','C','D','E','F'};
		char one ;
		String s ="";

		while (n != 0) {
			share= n / 16;
			reminder= n % 16;
			if (reminder>=10) 	one = c[reminder-10];   //10일때 0을 가져와야 하므로 -10 해주기
			else one = (char)(reminder+'0');    // 7 ->'7' ASCII 코드확인...
			s = one +s;
			n = share;

		}
		System.out.printf("0x%s",s);	
	}


}
