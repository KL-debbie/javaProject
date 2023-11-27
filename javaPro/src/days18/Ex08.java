package days18;

public class Ex08 {

	public static void main(String[] args) {
	
		//문자열 다루는 클래스
		//String				: 변경 불가능한 클래스 -> 인스턴스가 새로 생성됨 
		//StringBuffer		: 
		//StringBuilder
		//StringTokenizer
		
		
		//클래스
		String name ="홍길동";   // new String("홍길동");-- "홍길동"은 주소값 의미, 객체 1)
		
		name += "님"; 
		//객체는 없어지고 새로운 문자열이 생성되어 할당됨, 같은 주소 참조, 객체2)
		name += "안녕!!";
		// 또 다른 문자열이 생성 객체 3) 생성
		 
		System.out.println(name);

		// 1.
		System.out.println(name.length());  //9
		
		//2. name.length		필드, () 필요 X
		//2. name.length()	메서드 -문자열을 가져옴, () 필요
		for (int i = 0; i < name.length(); i++) {// length일때 밑줄인 이유- 문자열을 가져와야 하므로 () 가 있어야함
			
			System.out.printf("name[%d]='%c'\n", i, name.charAt(i));
		} // for
		//3.
		String rrn= "981002-1576334";
		System.out.println(rrn.substring(rrn.length()-1) ); //위치부터 끝까지 가져오기
		System.out.println(rrn.substring(7));
		//beginindex       <=  endIndex
		System.out.println(rrn.substring(0,2));
		
		
		// 4.
		String regex= "\\d{6]-\\d{7}";
		rrn.matches(regex);
		System.out.println();rrn.matches(regex);
		
		// 5. concat()
		String a = "ㅁㅁㅁ" + "ㅠㅠㅠ" + "xxx"; 
		String b = "ㅁㅁㅁ"
				.concat("ㅠㅠㅠ")			    
				.concat("xxx");

		// 6. 
		// Stream rrn.chars();

		// 7. int  0 동일한 문자열이다.
		//       -32       X 
		//        32       X
		// "A"65    "a"97   -32
		// "a"97    "A"65   32
		System.out.println( "kenik".compareTo("kEnik") );
		System.out.println( "kenik".compareToIgnoreCase("kEnik") );


		//8. true false
		System.out.println("kenik".equals("keniK"));
		System.out.println("kenik".equalsIgnoreCase("kEniK"));


		//9. true false
		boolean result ="안녕하세요 홍길동입니다.".contains("김길동");
		System.out.println(result);

		//10
		String url ="http://www.naver.com/test.jsp" ;
		String suffix = ".html"; // 접미사
		String prefix = "http://"; // 접두사

		System.out.println(url.startsWith(prefix));
		System.out.println(url.endsWith(suffix));

	}

	private static String concat(String string) {
		// TODO Auto-generated method stub
		return null;
	} // main
	
}//class
