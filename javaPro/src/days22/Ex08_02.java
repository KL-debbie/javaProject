package days22;

import java.util.LinkedList;

public class Ex08_02 {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//list.addFirst(list);  //가장 처음 노드 주소값을 참조하겠다.
		//list.addLast(list);  // 제일 마지막 노드가 새로 추가된 노드 주소값을 참조
		list.add("김호영");
		list.add("이지현");
		list.add("김정주");
		System.out.println(list);
		
		list.addFirst("유희진");
		System.out.println(list);  // [유희진, 김호영, 이지현, 김정주] 맨앞에 추가
		
		list.add(1, "임경재");
		System.out.println(list);  // [유희진, 임경재, 김호영, 이지현, 김정주]
		
		System.out.println(list.size());  // 5
		
		System.out.println(list.contains("김동현"));
		System.out.println(list.indexOf("김동현"));  // -1
		System.out.println(list.lastIndexOf("김동현"));// -1
		
		// 김정주 -> 고경림 수정
		int index = -1;
		if ( (index = list.indexOf("김정주") )!= -1) {
			list.set(index, "고경림");
		} //if
		System.out.println(list);
		
		/*		비교			  읽기																삽입/추가/삭제			비고 
		 * 1. ArrayList		: 빠름																	느림				순차적인 삽입/삭제(맨 뒤에) 빠름			==> 읽기 용도
		 * 2. LinkedList	: 느림(앞에서부터 주소를 따라 읽어야됨, 직접적으로 읽지못함) 		빠름				데이터 많으면 많을 수록 접근성은 떨어짐.  ==> 잦은 수정,삭제 시
		 * 
		 * 
		 */
		
		
	} // main

}//c
