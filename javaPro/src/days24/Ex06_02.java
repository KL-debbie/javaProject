package days24;

import java.util.Arrays;
import java.util.Comparator;


public class Ex06_02 {
	
	public static void main(String[] args) {
		// Comparable 인터페이스 	: 기본 정렬 기준을 구현
		// Comparator 인터페이스		: 			"		외에 다른 기준으로 정렬하고자 할 때 사용.
		
		
		String [] names = {"이지현","김호영","임경재","유희진"};  
		System.out.println(Arrays.toString(names));
		
		/*
		부모타입 객체명 = new 부모타입(매개변수...){
					// 필드
					// 메서드
					@Override 재정의 함수 구현
		};
		*/
		
		// 익명객체 부모한테 업캐스팅만 가능
		/*
		Comparator c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
		};
		Arrays.sort(names, c );
		*/
		
		/*
		//		sort() 메서드 호출부분
		//				매개변수로 익명클래스 사용한 예
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
		} );
		*/
		
		
		// Comparator객체 ->익명클래스가 올수밖에 없음 인터페이스에 정렬 compare 오버라이딩 -> 매개변수만 줘도 됨(자료형 필요없음)
		// 람다식 -> return 문 (생략 가능) 리턴값
		Arrays.sort(names, ( o1,  o2)-> o2.compareTo(o1) );
		
		System.out.println(Arrays.toString(names));
			
	} // main

}//c

/*1, Comparator 인터페이스를 구현한 클래스 선언
class StringDescendingComparator implements Comparator<String>{// 제네릭

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}

}
*/