package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex06 {
	
	public static void main(String[] args) {
		// 2023. 8 달력
		Calendar c = new GregorianCalendar(2023,8-1,1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);//요일
		c.add(Calendar.DATE, -dayOfWeek+1);  //시작날짜
		
		System.out.println(Ex05.getPatternDate(c,"yyyy-MM-dd"));
		
		
		// add() / set() / roll() 차이점
		
		
		
	} // main

}//cls
