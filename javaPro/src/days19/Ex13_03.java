package days19;

import java.util.Date;

public class Ex13_03 {
	
	public static void main(String[] args) {
		
	Date today = new Date();
	today.setHours(0);
	today.setMinutes(0);
	today.setSeconds(0);
	//today 년월일,,?ㄹㅇ루룽 

	System.out.println(today.toLocaleString());

	System.out.println(today.getTime());
	
	
	Date d = new Date(2023-1900, 8-1, 8);
	System.out.println(d.toLocaleString());
	
	System.out.println(today.equals(d)); // false
	System.out.println(d.getTime());
	// 왜 다르다고 나오나아아아  getTime method에 의해 밀리세컨드 값이 다르기 때문에 false
	
	
	} // main


}//class
