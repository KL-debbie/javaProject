package days09;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 25. - 오전 10:02:15
 * @subject 복습 5번
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int money = 125760;
		int unit  = 50000;   // 5만원 /5 => 1만원 /2 => ......1십원 /2 ->5원
		boolean sw = false;  //switch변수
		int count =0;     // 갯수,,
		
		while( unit >=1 ) {
			count= money / unit;
			System.out.printf("%d원 : %d개\n", unit, count);
			money  %= unit;
			// if(sw==false) unit = unit / 5;
			// else              unit = unit / 2;
			unit /= !sw? 5 :2;
			sw = !sw;
		}//while

	}//main

}//class
