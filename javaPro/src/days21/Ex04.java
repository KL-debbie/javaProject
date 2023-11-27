package days21;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.regex.Pattern;

/**
 * @author KL
 * @date 2023. 8. 10. - 오전 10:30:19
 * @subject 복습7번
 * @content
 */
public class Ex04 {

	public static void main(String[] args) throws ParseException {
		
		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";
		int no;
		String name;
		String addr;
		
		// MessageFormat 형식화 클래스X
		/*
		int index = source.indexOf("이름");
		System.out.println(index);
		
		int bindex = index+"이름:".length();
		int eindex = source.indexOf(",",index);
		name = source.substring(bindex,eindex);
		System.out.println(name);   //홍길동,주소:서울 양천구 목동
		*/
		
		//MessageFormat 형식화 클래스 사용
		String pattern = "번호:{0},이름:{1},주소:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		Object [] objArr = mf.parse(source);
		
		// ClassCastException  클래스 형변환이 진행되지 않음 
		//( Cast 연산자 )  -> cast 강제형변환
		// 상속관계에 있지 않아 형변환 불가
		// no= (int) objArr[0];  //번호 - 런타임 오류
		
		//"1" -> 1로 변환(String-> int)
		no =Integer.parseInt( objArr[0].toString() );//String
		
		
		name= (String) objArr[1];  //이름
		addr= (String) objArr[2];  //주소

		System.out.println(no);
		System.out.println(name);
		System.out.println(addr);
		
	} // main
	
}
