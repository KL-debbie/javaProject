package days22;

import java.util.Stack;

public class Ex09 {
	
	public static void main(String[] args) {
		
		// ArrayList 특징
		// Vector 특징
		// LinkedList 특징
		
		// 스택( Stack ) 과 큐( Queue)
		
		/*	스택( Stack )
		 * 	─────────┐
		 * C B A         │
		 * 	─────────┘
		 * 마지막에 들어간 것이 가장 먼저 나옴(LIFO 구조)
		 * 데이터를 집어넣을 때 -> push()
		 * 가지고 나올 때 <- pop() - 마지막 요소를 꺼내와 가져가는 것(제거)		peek() - 마지막 요소가 무엇인지 확인만, 꺼내오지는 않음(제거 X)
		 * 스택이 비어있니 empty()
		 * index search () 위치값은 1부터 시작, 요소가 있는지 물어보고 위치값 돌려줌, 찾는 값 없으면 -1 반환
		 * 만드는 이유 ? (후입선출) 가장 마지막 요소를 가장 먼저 꺼내가는 것 
		 * 
		 * 활용 ? 웹브라우저 뒤로/앞으로 가기 버튼
		 * 
		 */
		   
		
		// Vector의 부모 List인터페이스 의 부모 Collection 부모클래스 동기화처리 O
		Stack s = new Stack();
		s.push("유희진");
		s.push("임경재");
		s.push("김호영");
		s.push("이지현");
		
		System.out.println(s);
		/*
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		System.out.println( s.pop() );

		System.out.println( s.pop() );  //EmptyStackException
		*/
		
		/*
		while ( ! s.empty()  ) {    // 비어있지 않다면 꺼내오기
			System.out.println( s.pop() );
			}
			*/
		
		/*
		System.out.println(s.peek());  // 최신것만 읽어옴, 제거를 하지 않기때문에 마지막값만 계속 읽어옴
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		*/
		
		System.out.println(s.search("임경재"));  // 끝에서부터 찾음 1부터 시작   3
		
		
		
		
	} // main

}
