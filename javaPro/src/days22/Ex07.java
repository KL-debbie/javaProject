package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
		//StringBuilder : 멀티스레드 X, 동기화처리 X
		// StringBuffer : 멜티스레드 O, 동기화처리 O
public class Ex07 {
	
	public static void main(String[] args) {
		// Vector 컬렉션 클래스
		//  ㄴ List 인터페이스 구현한 클래스
		//	ㄴ 순서유지, 중복허용  O
		// 	(직렬화, 랜덤하게 접근)
		// 	ㄴ ArrayList와 동일  - 멀티스레드에 안전 X, 동기화 처리 X
		// 차이점  ㄴ 멀티스레드에 안전(동기화 처리 O)
		
		Vector v = new Vector();
		// 용량 10개짜리
		
		v.addElement("김호영"); // add() 동일
		v.add("김성준");
		v.add("이지현");
//		v.add(null);
//		v.add(null);

		System.out.println( v.size() );	// 요소의 갯수 3
		System.out.println( v.capacity() ); //용량 10
		
		v.trimToSize();
		System.out.println( v.capacity() ); //3
		
		v.setSize(5);  //크기 설정--요소갯수
		// 왜 사용?
		// 팀원은 5명, 정해진 팀원 3명, 미정 2명
		// null을 가지는 5명 집합
		
		System.out.println( v.size() );	// 5
		System.out.println( v );			// [김호영, 김성준, 이지현, null, null]
		
		v.get(0);  // "김호영"
		v.elementAt(0); // 0번째 요소 가져오겠다
		
		// ( 반복자(Iterator) 가 아니라 )열거자를 돌려줌.
		
		// 	반복자 	/ 열거자	차이점
		
		// Iterator 반복자
		Iterator ir = v.iterator();
		// The returned iterator is [fail-fast]
		// [fail-fast] - 읽는 도중 데이터 수정되면 바로 예외처리
		
		// Enumeration 열거자
		// 읽는 도중 데이터 수정 되도 알지 못함
		Enumeration en=v.elements();
		
		// hasMoreElements() 요소 더 있니? [true]/false 
		while (en.hasMoreElements()) {
			//			다음 요소 얻어오는 메서드 nextElement
			String name = (String) en.nextElement();
			System.out.println(name);
		}//while
		
		/*
		String 제거한이름 = (String) v.remove(0);
		v.removeElementAt(0);
		*/
		
		// v(벡터) null요소 제거한 나머지 요소를 출력.
		v.removeIf( n -> n==null );
		System.out.println(v);
		
		// 					메서드 참조 - 하나하나 접근해 메서드 출력
		v.forEach(n -> System.out.println( n ));
		// v.forEach( System.out::println );
		
		
		v.clear(); //모든요소제거
		v.firstElement(); // == v.get(0); 첫번째요소 가져오기
		v.lastElement(); // 마지막요소 가져오기  == v.get( v.size()-1) ;
		v.insertElementAt("임경재", 1);   // 1번째 위치에 삽입   == v.add(1,"임경재");
		
		//	v.listIterator();
		
		List subList =v.subList(0, 2); // ArrayList X 새로운 리스트를 생성하겠다
		System.out.println(subList);
		
		
		
		
		
	} // main

}//c
