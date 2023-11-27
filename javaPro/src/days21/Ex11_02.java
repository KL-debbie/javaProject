package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex11_02 {
	
	public static void main(String[] args) {
		
		// DateTimeFormatter.format()  -
		// DateTimeFormatter.parse()  -
		
		//String source = "2023-08-10";
		String source = "2023년 08월 10일 (목)";
		
		String pattern = "yyyy년 MM월 dd일 (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(source);
		
		LocalDate d = LocalDate.parse(source, dtf);  //
		System.out.println(d);
		
		LocalTime t = LocalTime.parse("12:34:23");
		System.out.println(t);
		//똑같이 파싱
	} // main

}
