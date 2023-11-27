package days20;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

/**
 * @author KL
 * @date 2023. 8. 9. - 오전 10:05:28
 * @subject 복습 1번
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 ? ");
		int year = sc.nextInt();
		int month = 0 ;
		
	
		int lastDay = getLastDay(year,month);
		
		//System.out.println(dayOfWeek +"/" + lastDay);
		
		Date d = new Date(year-1900, month, 1);
		int date = d.getDate()-1;
		d.setDate(date);
		
		try {
			
			for (int i = 1; i <=12; i++) {
				System.out.printf("%d월 : %d일\n",i, getLastDay(year, i));
				/*
				month +=1 ;
				if(month ==2 )System.out.printf("%d월 : %d일\n", month, d.getDate()-3);
				else if( i%2==1  ){
				System.out.printf("%d월 : %d일\n", month,lastDay );
				} else System.out.printf("%d월 : %d일\n", month,lastDay -1);
				*/
			} // for
				
		} catch (Exception e) {
		e.printStackTrace();
		}
	
			
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, date);
		return d.getDay();
	}

	private static int getLastDay(int year, int month) {
		Date d = new Date(year-1900, month, 1);
		int date = d.getDate()-1;
		d.setDate(date);
		return d.getDate();
		
						
	}

}
	


