package days14;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 8. 1. - 오전 10:41:23
 * @subject
 * @content
 */
public class Ex03 {
	
	public static void main(String[] args) {
		//클래스   객체
		Random rnd= new Random(  10000L  ); // long seed-> 필드 초기화
		
		//          객체
		Scanner scanner = new Scanner(System.in) ;
		
		// 현재 시스템의 날짜 + 시간 정보
		// 2023. 8. 1. 오전 10:48:23
		int year= 2023;
		int month= 10;
		int day=25;
		Date d = new Date(year-1900,month-1,day);
		//								해당지역
		System.out.println(d.toLocaleString());
		System.out.println(d.toString());
		System.out.println(d.getDay());   // 3 수요일
		 
	} // main

}
