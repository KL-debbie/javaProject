package days05;

import java.util.Scanner;

public class KlEx04 {
	public static void main(String[] args) {
		
		/*
		각각 한개씩 출력
		for (int i = 0; i < 256; i++) {
			System.out.printf("%d-%c\n",i, (char)i);
		} // for
		*/
		
		/*
		10개씩 출력
		for (int i = 0; i < 256; i++) {
			System.out.printf("%d-[%c]", i, (char)i );
			if (i%10==9) System.out.println(); 
		} // for
		*/
		
		/* 10개씩 출력 후 라인 앞 번호 부여
		 * 
		 */
		for (int i = 0, lineNumber=1; i < 256; i++) {
			if(i%10==0) System.out.printf("%d",lineNumber++); 
			System.out.printf("%cS", (char)i);
			if(1%10==9) { System.out.println();}
		} // for
		} //main
	
	} // class


