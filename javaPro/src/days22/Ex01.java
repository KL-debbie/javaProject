package days22;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args)  {
		// 복습 2번
		
		LocalDateTime dt = LocalDateTime.now();
		//String s = "2023/08/11 금요일   07:02:32.259";    //  --> 결과물
		// 형식화 클래스  Date,Calendar - SimpleDateFormat(parse(), format());
		
		 String pattern = "yyyy/MM/dd E요일   hh:mm:ss.SSS";
		
		 //LocalDateTime 클래스를 사용
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String output = dtf.format(dt);  //매개변수 다형성
		System.out.println(output);
	
		// 복습 2-2번

		String s = "2023.08.11 (금)";
		String pa ="yyyy.MM.dd (E)" ;

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(pa);
		LocalDate d = LocalDate.parse(s,dtf1);
		System.out.println(d);

	}
}