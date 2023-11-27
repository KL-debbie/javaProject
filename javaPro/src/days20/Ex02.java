package days20;

import java.util.Date;

/**
 * @author KL
 * @date 2023. 8. 9. - 오전 10:26:53
 * @subject 복습 2
 * @content
 */
public class Ex02 {
	
	public static void main(String[] args) {
		// 달력 그리기
		int year= 2023;
		int month =8;
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month, 1);
		
		//공백 for문
		Date startDay = new Date(year-1900, month-1, 1);
		startDay.setDate(startDay.getDate()-dayOfWeek);
		// startDay가 오늘날짜랑 같은걸 비교
		
		System.out.println(startDay.toLocaleString());
		
		int m;//출력날짜
		for (int i = 1; i <=42; i++) {
			m= startDay.getMonth()+1; //
			if (month ==m ) {
				System.out.printf("%d\t", startDay.getDate());  //일만 출력
			} else {
				System.out.printf("\t");  // 일이 아니면 공백 출력
			}
			if(i%7==0) System.out.println();
			startDay.setDate(startDay.getDate()+1);  // 한번 돌때마다 하루 더하기
		} // for
		
	} // main
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
	
		public static String isEqualsDate(Date d1, Date d2) {
			int index =10; // d.toLocaleString().lastIndexOf(".");
			d1.setHours(0);
			d1.setMinutes(0);
			d1.setSeconds(0);
			
			d2.setHours(0);
			d2.setMinutes(0);
			d2.setSeconds(0);
			// String s1 = d1.toLocaleString().substring(0, index);
			//String s2 = d2.toLocaleString().substring(0, index);
			
			return d1.toLocaleString().substring(index);
		}
						
	
}
