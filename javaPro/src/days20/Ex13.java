package days20;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex13 {
	
	public static void main(String[] args) {
		
		// 객체 변경 불가
		LocalDate d=  LocalDate.now();
		System.out.println(d); //2023-08-09
		
		// withXXX()
		/*
		d= d.withYear(2020); //2020-08-09
		d= d.withMonth(5);  //2020-05-09
		d= d.withDayOfMonth(11);  //2020-05-11
		*/
		
		// d.withYear(2020);  //2023-08-09
		d= d.with(ChronoField.YEAR, 2010);//2010-08-09
		d= d.with(ChronoField.MONTH_OF_YEAR, 5); //2010-05-09
		d= d.with(ChronoField.DAY_OF_MONTH,25); //2010-05-25
		System.out.println(d); 
		
		
		
		
		
		// String = 변경 불가능
		String a = "xyz";
		//a.replace('x','t');   //xyz
		String b = a.replace('x','t');   //tyz
		System.out.println(b);
		
	} // main

}
