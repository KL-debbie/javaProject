package days20;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex08 {
	
	public static void main(String[] args) {
		//형식화 클래스
		//  DecimalFormat()  숫자를 원하는 형식의 문자열 문자로 변환, 	parse()- 문자열을 숫자로 변환
		//	SimpleDateFormat- 날짜를 내가 원하는 문자열 형식으로 변환  parse() 문자열을 날짜로 변환
		
		// 23년도 8월 9일 "수요일" 
		// 날짜로 변환시키는 코딩
		// String strDate = " 23년도 8월 9일 \"수요일\"";
		String strDate = " 23년도 8월 9일 (수요일)";
		
		
		// 요일을 나타내는 패턴기호? E
		String pattern = "yy년도 MM월 dd일 (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		try {
			Date d = sdf.parse(pattern);
			System.out.println(d.toLocaleString());
			Calendar c = Calendar.getInstance();
			c.setTime(d);
		// 	System.out.println(Ex05.getPatternDate(c,pattern));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	
		
	} // main

}//cls
