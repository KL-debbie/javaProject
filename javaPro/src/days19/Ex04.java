package days19;

import java.util.StringTokenizer;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// StringTokenizer 클래스
		String str = "고경림,김성준,김정주,김호영";
		//String[]	str.split(regex);
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		//System.out.println(st.countTokens());   // 4 토큰캣수
		
		//하나의 토큰 가져오기
		/*
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		// java.util.NoSuchElementException
		System.out.println(st.nextToken()); // 5번째 토큰 - 예외발생
		*/
		
		/*
		//토큰 갯수만큼 가져오는 거 반복
		int countToken = st.countTokens();
		for (int i = 0; i < countToken; i++) {
			System.out.println(st.nextToken()); // 다음 토큰 가져오고 난 가져온 토큰은 후에 지워버리기 때문에 count가 달라짐 -> 변수로 미리 받아놓기
		} // for
		*/
		while (st.hasMoreTokens()) {  // 가져올 토큰이 더 있나? t/f 반환
			System.out.println(st.nextToken());
		}
		
		
		
	} // main

}//class
