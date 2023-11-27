package days20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Ex12 {
	
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();         		//2023-08-09
		// LocalDate d = LocalDate.of(2023,8,9);		//2023-08-09
		//LocalDate d = LocalDate.ofYearDay(2023, 365);  // 1년중 며칠째?
		System.out.println(d);  
		
		//년
		int year = d.getYear();
		System.out.println(year);  //2023
		year = d.get(ChronoField.YEAR);
		System.out.println(year);  //2023
		// Temporal 필드 -> 
		
		//월
		//Type mismatch: cannot convert from Month to int
		// int month = d.getMonth();
		Month eMonth = d.getMonth(); //AUGUST
		System.out.println(eMonth);
		
		int month =d.getMonthValue(); //8
		System.out.println(month);
		
		month = d.get(ChronoField.MONTH_OF_YEAR);  //8
		System.out.println(month);
		
		//일
		int day = d.getDayOfMonth();  //9
		System.out.println(day);
		
		d.get(ChronoField.DAY_OF_MONTH);  //9
		System.out.println(day);
		
		
		LocalTime t = LocalTime.now();
		//시간
		int h =t.getHour();
		System.out.println(h);
		t.get(ChronoField.HOUR_OF_DAY);  // (밤12==0) ~23
		//분
		int m =t.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(m);
		//초
		int s = t.getSecond();
		t.get(ChronoField.SECOND_OF_MINUTE);
		//밀리세컨드
		int n = t.getNano();
		
		
		//요일     열거형
		DayOfWeek dof = d.getDayOfWeek();
		System.out.println(dof);
		// Date 0(일) ~~ 6(토)
		// Calendar 1(일) ~~7(토)
		// LocalDate 1(월) ~6(토)7(일)
		System.out.println(dof.getValue());
		
	} // main

}
