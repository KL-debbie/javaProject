package days20;

import java.util.Date;

/**
 * @author KL
 * @date 2023. 8. 9. - 오전 10:48:45
 * @subject 복습3
 * @content
 */
public class Ex03 {


	public static void main(String[] args) {
		// 3.개강일(2023.7.13 9:00:00)로 부터 오늘까지 지난 일수 계산을 하세요..
		Date sday= new Date(2023-1900,7-1,13, 9,0,0);
		//System.out.println(sday.toLocaleString());
		
		Date today = new Date();
		//System.out.println(today.toLocaleString());
		
		/*
		// 두 날짜의 차이
		  System.out.println(sday.getTime());
		  System.out.println(today.getTime());
		
		  long diff = today.getTime() -sday.getTime();
		  */
		dispDiffDays(sday,today);
		  /*
		  System.out.println(diff + "ms");  // ms 차이
		  System.out.println(diff/1000 + "s");  // s 차이
		  System.out.println(diff/1000/60 + "m");  // m 차이
		  System.out.println(diff/(1000*60*60) + "h");  // h 차이
		  System.out.println(diff/(1000*60*60*24) + "d");  // day 차이
		*/
		  
		  // ??일 ??시간 ??분 ??초 ??밀리세컨드 days08_Ex11_02
		 		  
		  
	}

	public static void dispDiffDays(Date sday, Date eday) {
		 long diff = eday.getTime() -sday.getTime();  // 끝나는 날 - 시작날
		 long 몫 = diff/(1000*60*60*24); //일
		 System.out.printf("%dd-",몫);
		 diff %=(1000*60*60*24);  //나머지
		 
		 몫 = diff/(1000*60*60);  // 시간
		 System.out.printf("%dh-",몫);
		 diff %=(1000*60*60);  //나머지
		 
		 몫 = diff/(1000*60);  // 분
		 System.out.printf("%dm-",몫);
		 diff %=(1000*60);  //나머지
		 
		 몫 = diff/(1000);  // 초
		 System.out.printf("%ds-",몫);
		 diff %=(1000);  //나머지
		 
		 몫 = diff/1; //ms
		 System.out.printf("%dms\n",몫);
		 
		 try {
			Thread.sleep(10);  //10ms만 쉬겠따//
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}  
		// dispDiffDays(sday,new Date());  //new Date()계속 흘러갈시간, 자기자신 함수 호출
	} // main
	
}//class
