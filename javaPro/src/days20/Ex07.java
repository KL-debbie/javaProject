package days20;

import java.text.DecimalFormat;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//형식화 클래스
		// 1) SimpleDateFormat - 가장 많이 사용
		// 2) Decimal     Format
		//- 숫자를 형식화하는 클래스- 원하는 형식으로
		// int money = 3257600;
		double money = 3257600.8;
		
		// 출력형식 \3,257,600
		// [1] 
		/*
		String strMoney = String.format("\\%,d", money);  //\3,257,600
		System.out.println(strMoney);
		*/
		
		// [2] DecimalFormat
		// 패턴에 사용할 수 있는 기호
		// 0 -> 10진수     	값이 없을 경우 0 출력
		// # -> 10진수  	뒤에 올 값이 없을 경우 공백
		//#.##  ->       9.1_
		//0.00   ->        9.10
		// - 음수 부호
		// , 단위 구분자
		// E 지수기호
		//; 패턴구분자
		// % 퍼센트
		// ' escape문자
		// \u00A4 통화기호
		
		String pattern = "\u00A4 #,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);
		
		// 3) Choice	   Format
		
		// 4) Message	   Format
		
	} // main

}
