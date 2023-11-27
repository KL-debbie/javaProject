package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex07_02 {
	
	public static void main(String[] args) {
		
		String strMoney = "1,234,567";
		int money ;
	    //System.out.println(money);
		// 문자열 을 int로 변환.
		
		/* [ 1 ]
		strMoney = strMoney.replace(",", "");
		System.out.println(strMoney);   //"1234567"
		money =Integer.parseInt(strMoney);
		System.out.println(strMoney);   //1234567
		*/
		
		//[ 2 ]
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		//strMoney = df.format(money);
		try {
			Number num = df.parse(strMoney);  // 부모가 Number
			money = num.intValue();
			System.out.println(money);
		} catch (ParseException e) {  //pattern타입과 다른 경우 예외
			
			e.printStackTrace();
		}
	} // main

}//cla
