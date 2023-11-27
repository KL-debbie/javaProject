package days09;

/**
 * @author KL
 * @date 2023. 7. 25. - 오전 11:05:41
 * @subject  주민등록번호(住民登錄番號, 영어: Resident Registration Number, RRN)
 * @content 생일 연도 추출
 */
public class Ex03 {
	
	public static void main(String[] args) {
		
		// [ 주민등록번호 ]
		// 생년월일
		// 나이
		// 성별 -> 세기, 내국인/외국인
		// 검증번호
				
		String rrn ="890123-1700001";
		
		String birthday = getBirth(rrn);
		
		System.out.println(birthday);
	} // main
	
	// 성별
	public static int getGender(String rrn) {
		// return Integer.parseInt(rrn.substring(7, 8));
		return rrn.charAt(7)-'0';  // '0' - 48 (ASCII코드) 
	}
	
	
	public static String getBirth(String rrn) {
		//String year = rrn.substring(0, 2);  // 연도 추출
		//String month = rrn.substring(2, 4);  // 두번째부터 네번째 앞까지, 월 추출
		// String day = rrn.substring(4, 6);  // 4번째부터 6번째 앞까지, 일 추출
		// System.out.printf("%s.%s.%s\n",year,month,day);
		int year = Integer.parseInt(rrn.substring(0, 2));
		int month =Integer.parseInt( rrn.substring(2, 4)); 
		int day =Integer.parseInt( rrn.substring(4, 6)); 
		// 1989.01.23 형태
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
