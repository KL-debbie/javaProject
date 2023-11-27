package days09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author KL
 * @date 2023. 7. 25. - 오전 11:05:41
 * @subject  주민등록번호(住民登錄番號, 영어: Resident Registration Number, RRN)
 * @content  나이 가져오기
 *                               2019.12.31       20.01.01      20.12.31        21.01.01
 *                // 세는나이 :        1살               2살               2살                3살
		          // 만  나이 :         0살               0살               1살                1살
 */
public class Ex03_02 {

	public static void main(String[] args) {

		// 나이?		
		String rrn ="890123-1700001";

		int age =0;
		// 세는나이 countingAge
		age =getCountingAge(rrn);
		System.out.println("세는 나이 : " + age);

		// 만나이 AmericanAge
		age =getAmericanAge(rrn);
		System.out.println("만 나이 : " + age);

	} // main


	// 만나이
	private static int getAmericanAge(String rrn) {
		// 생일이 오늘 날짜 기준으로 지났는지의 여부 확인..
		// 생일 지나지 않음 -1
		// 만나이 = (올해 년도 - 생일년도 +1) -1]         - 1 (o-생일 안지난 경우,x-생일 지난경우) 뺼수도 안뺄수도
		//         = 세는 나이 -1          생일(-1)?
		// 생일 0123 
		// 오늘 0725 
		// 오늘(725) - 생일(123) >=0  생일이 지남   0
		// 오늘(725) - 생일(123) >=0  생일이 지나지 않음   -1
		
		//                     .1.23         "123"    
		// Integer.parseInt(getBirth(rrn).substring(4).replace(".", ""));
		
		/*1)
		Calendar c = Calendar.getInstance();
		// 연도 - c.get(Calendar.YEAR);
		int thisMonth = c.get(Calendar.MONTH);  // 7
		int thisDay = c.get(Calendar.DATE);        // 25
		int thisMMdd = thisMonth*100 + thisDay;
		*/
		
		//2) Date클래스 사용 20230[725]
		/*
		Date d =new Date();
		int thisMonth= d.getMonth()+1; 
		int thisDay= d.getDay();
		
		int thisMMdd = thisMonth*100 + thisDay;
		*/
		
		//3)  날짜로부터 형식화(간단하게)
		
		Date d = new Date();
		String pattern = "MMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		int thisMMdd = Integer.parseInt( sdf.format(d) );
		
		int birthMMdd = 0;
		
		boolean flag =thisMMdd - birthMMdd >=0;
		int AmericanAge =getCountingAge(rrn) -1 + (flag? 0:-1);
		return AmericanAge;
	}

	// 세는나이
	private static int getCountingAge(String rrn) {
		// 올해 년도 - 2023
		//Calendar c = Calendar.getInstance();
		// int thisYear = c.get(Calendar.YEAR);

		//2) util 확인
		Date d= new Date();
		int thisYear= d.getYear() + 1900;		//d.getYear() - 쓰고 없어질 것

		// 생일 년도 - 1989
		int birthYear = Integer.parseInt( getBirth(rrn).substring(0,4) );


		// 세는 나이 = 올해 년도 - 생일 년도 + 1
		int CountingAge = thisYear - birthYear+1;

		return CountingAge;
	}

	// 성별
	public static int getGender(String rrn) {
		// return Integer.parseInt(rrn.substring(7, 8));
		return rrn.charAt(7)-'0';  // '0' - 48 (ASCII코드) 
	}

	// yyyy-MM-dd
	public static String getBirth(String rrn) {

		int year = Integer.parseInt(rrn.substring(0, 2));

		int month =Integer.parseInt( rrn.substring(2, 4)); 

		int day =Integer.parseInt( rrn.substring(4, 6)); 

		int ㅅ=getGender(rrn);		

		int century = 1800;
		switch (ㅅ ) {
		case 1: case 2: case 5: case 6:
			century = 1900;
			break;
		case 3: case 4: case 7: case 8:
			century = 2000;
			break;
		case 9: case 0:
			century =1800;
			break;
		}
		year = century + year;
		String birthday = String.format("%d.%d.%d\n",year,month,day);
		// String birthday = String.format("%s.%s.%s\n",year,month,day);

		return birthday;
	}

}//class
