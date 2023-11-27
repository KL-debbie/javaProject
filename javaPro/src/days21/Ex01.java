package days21;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 8. 10. - 오전 10:07:02
 * @subject 복습2
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws ParseException {
	// String -> sdf.parse() -> Date -> Calendar -> Date -> sdf.format()-> 원하는 형식(String)
		String source = "2023/08/10 (목) 12:23:01";
		String pattern ="yyyy/MM/dd (E) hh:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
			Date d = sdf.parse(source);
			// System.out.println(d.toLocaleString());
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			
			d= c.getTime(); // Calendar 변환
		
			pattern = "yyyy년 M월 d일 (E)";
			sdf= new SimpleDateFormat(pattern);
			String strD = sdf.format(d);
		System.out.println(strD);
	} // main
}
