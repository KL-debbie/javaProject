package days20;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex10_02 {
	
	public static void main(String[] args) {
		
		
		//특정패턴을 가진 문자열 속에서 원하는 문자를 찾아오려면 위치값 찾아서 문자 잘라오기
		String source = "이름:이준희, 나이:20살, 성별:true";
		String pattern ="이름:{0}, 나이:{1}, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object [] objs = mf.parse(source);
			for (Object obj : objs) {
				System.out.println(obj);
			}//foreach
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
	} // main

}
