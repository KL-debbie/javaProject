package days20;

import java.util.Date;

/**
 * @author KL
 * @date 2023. 8. 9. - 오전 10:26:53
 * @subject 복습 2
 * @content
 * */
public class Ex02_02 {
	
	public static void main(String[] args) {
		
		Date d = new Date(2023-1900, 8-1, 9);
		System.out.println(d.toLocaleString());
		
		Date today = new Date();
		today.setHours(0);
		today.setMinutes(0);
		today.setSeconds(0);
		
		System.out.println(today.toLocaleString());
		System.out.println(today.getTime());
		
		
		long tgt = today.getTime();
		// 뒤 ms 강제 제거
		System.out.println(tgt/1000*1000);  //ms 뒤자리 세자리가 잘린 후 1000곱하면 뒤 세자리 000으로 초기화됨
		
		today = new Date(tgt/1000*1000);
		System.out.println(today.getTime());
		System.out.println(today.toLocaleString());
		
		
		System.out.println(d.equals(today));
		System.out.println(d.before(today));
		System.out.println(d.after(today));
		// 2023. 8. 9. 오전 12:00:00
		// 2023. 8. 9. 오전 10:28:04
		// 9. 앞 날짜만 비교, 뒤에는 잘라내기
		// . 위치 찾기
		
		/*
		int index = d.toLocaleString().lastIndexOf(".");
		System.out.println(index);
		String s1 = d.toLocaleString().substring(0, index);
		String s2 = today.toLocaleString().substring(0, index);
		
		System.out.println(s1.equals(s2));
		*/
		
		
	} // main

}
