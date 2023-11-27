package days22;

import java.util.HashSet;

public class Ex14 {
	
	public static void main(String[] args) {
		// Collection인터페이스 자식
		// 		ㄴ Set 인터페이스 구현한 컬렉션 클래스
		// - 특징  순서 유지 X, 중복 허용 X
		// - HashSet 컬렉션 클래스
		// (참고)  Set이면서 + 순서 유지O ==> LinkedHashSet 컬렉션 클래스 사용
		// 
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		
		// [1, 9, 10, 15] 저장 순서 유지X
		System.out.println(hs);
		
		hs.add(1);
		// [1, 9, 10, 15] 중복 허용X
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		
	} // main

}
