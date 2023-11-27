package days22;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex12 {
	
	public static void main(String[] args) {
		// 특징 암기
		// ArrayList - List			요소
		// Vector - List(동기화처리, 멀티스레드에 안전)	요소
		// LinkedList - List		노드
		// Stack - LIFO ,부모가 Vector - List계열
		//			push(), pop(), peek()
		// Queue(I) - 인터페이스, FIFO, LinkedList
		// Deque(I)
		// 				offer() poll() peek()
		// PriorityQueue  
		
		// interator - 반복자, Enumeration - 열거자
		// ListIterator - 반복자 ? 
		// 		ㄴ iterator에 양방향으로 조회기능이 추가된 반복자.
		//		ㄴ 왜 List ? List인터페이스를 구현한 클래스에만 사용 가능
		//		
		
		//  다음			이전
		// hasNext()  hasPrevious()
		// next()			previous()
		
		Vector v = new Vector();
		v.add("유희진");
		v.add("임경재");
		v.add("김호영");
		v.add("이지현");
		
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name );
		}//while
		
		System.out.println(">역방향 진행");
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name );
		}//while
		
		
	} // main

}//c
