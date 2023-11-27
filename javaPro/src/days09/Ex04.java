package days09;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 25. - 오후 2:47:30
 * @subject ****************************달력 만들기
 *                1일이 무슨 요일인지 먼저파악
 *                월의 마지막 날짜 파악
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {

		
		int year, month;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print(">년도 월 입력? ");
			year = sc.nextInt();
			month =sc.nextInt();

			printCalender(year, month);

		} catch (Exception e) {
			e.printStackTrace();
		}//catch

		/*
		for (int y = 2020; y <=2023; y++) {;
			for (int i = 1; i <=12; i++) {
				printCalender(y,i);
			} // for
		} // for
		*/
		
	} // main

	private static void printCalender(int year, int month) {

		// 1일이 무슨 요일인지 먼저파악 요일 저장 변수
		// 총 날짜수 더한 후 7로 나눈 나머지값
		// ㄴ 일요일(0), 월(1), 화(2), 수(3), 목(4), 금(5), 토(6)
		int dayOfWeek= getDayOfWeek(year,month,1);

		//월의 마지막 날짜 파악
		int lastDay = getLastDay(year,month);

		
		System.out.printf("\t\t[%d년 %d월]\n",year,month);
		System.out.println( "-".repeat(60) );
		String week = "일월화수목금토";
		for (int i = 0; i <week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		} // for
		System.out.println();
		System.out.println( "-".repeat(60) );
		// 날짜출력
		// 1일 날짜 앞에 공백 찍는 for문
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		} // for
		for (int i = 1; i <=lastDay; i++) {
			System.out.printf("\t%d",i);
			if( (i + dayOfWeek) % 7==0)   // 앞에 공백까지 포함해서 계산하기............
				System.out.println();
		} // for
		System.out.println();
		System.out.println( "-".repeat(60) );
		
		
		
	} //printCalender
	
	
	private static int getDayOfWeek(int year, int month, int day) {
		//1.1.1~year.month.day 총 날짜수 %7 ?
		int totalDays = getTotalDays(year,month,day);
		int dayOfWeek = totalDays%7;
		System.out.println("일월화수목금토".charAt(dayOfWeek));
		return dayOfWeek;
	}//DayOfWeek


	// 총 날짜수
	private static int getTotalDays(int year, int month, int day) {
		// int year =2023, int month =7, int day=1
		int totalDays =0;
		/*
		for (int i = 1; i <year; i++) {
			totalDays += days08.Ex05.isLeapYear(i)? 366 : 365;
		} // for
		 */
		totalDays +=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;  // 4의배수가 몇번 나오는지 확인

		// 2023 1+2+3+4+5+6+7(1)
		for (int i = 1; i <month; i++) {
			totalDays += getLastDay(year, i);

		} // for

		totalDays++;
		return totalDays;
	}//TotalDays

	//2) 마지막 일자 파악
	private static int getLastDay(int year, int month) {
		int lastDay=0;
		//                      0                                               11(12월)
		int [] months = {31, 28,31,30,31,30,31,31,30,31,30,31};
		lastDay =months[month-1];
		if(month ==2 && days08.Ex05.isLeapYear(year) ) lastDay ++;
		return lastDay;
		
	}//LastDay
	
	
	/*1)
	private static int getLastDay(int year, int month) {
		// 31일           1,3,5,7,8,10,12월
		// 30일           4,6,9,11월
		// 28(29일)     2월
		int lastDay=0;
		switch (month) {
		case 2:
			lastDay = (days08.Ex05.isLeapYear(year))?29:28;
			break;
		case 4: case 6: case 9: case 11:
			lastDay =30;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31;
			break;
		}//switch
		return lastDay;
	 */


}//class
