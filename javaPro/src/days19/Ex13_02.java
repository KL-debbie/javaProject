package days19;

import java.util.Date;

public class Ex13_02 {
	
	public static void main(String[] args) {
		
		// 달력 그리기 Date클래스 사용해서
		
		int year=2023;
		int month= 8;
		
		int dayOfWeek = getDayOfWeek(year,month, 1 );
		int lastDay = getLastDay(year,month);
		
		 System.out.println(dayOfWeek + "/" + lastDay);
		// 전달 마지막 날짜도 출력되도록
		/*
		Date d = new Date(year -1900, month-1, 1);  // 2023.8.1
		int date = d.getDate() - dayOfWeek ;
		d.setDate(date); //8월 달력 시작날짜
		
		for (int i = 1; i <=42; i++) { 
			 // true/ false d.after(d2); 
			// true/ false d.before(d2); 
			// true/ false d.equals(d2); 
			// d.compareTo(d2);  0 ==> 오늘 날짜
			
			
			// 년,월,일이 같아야함
			int m = d.getMonth() + 1;
		
			System.out.printf(m== month?"%d\t":"(%d)\t", d.getDate());
			
			if(i%7==0) System.out.println();  // 7개 출력 후 개행
			
			date = d.getDate()+1;//현재날짜
			d.setDate(date);
			//System.out.println(d.toLocaleString()); 
		} // for
		//System.out.println(d.toLocaleString());
		
		*/
	} // main

	private static int getLastDay(int year, int month) {
		Date d = new Date(year -1900, month, 1);  // 다음달 1일 객체
		int date = d.getDate() - 1 ;
		d.setDate(date);
		
		return d.getDate();  // 마지막날짜
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year -1900, month-1, date);
		
		return d.getDay();   // 0~6 (일~토)
	}

}//class
