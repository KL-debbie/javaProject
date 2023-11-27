package days22;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// 큐( Queue ) 
		// * 	─────────┐
		// *  ->  C B A   ->           
		// * 	─────────┘
		// [ Deque ]  - Double Queue 양방향으로 삽입,제거 가능
		// * 	─────────┐
		// *  ->  C B A   ->
		// * <-			  <-
		// * 	─────────┘

		/* push , pop (Stack 구조)
		 * offer() - 추가 				poll() - 제거 ,peek() 
		 * 선입선출(FIFO) 구조
		 * 먼저 들어간 주소값이 먼저 나옴
		 * 컬렉션 인터페이스를 상속 받은 인터페이스 
		 */
		//Queue q = new LinkedList(); 
		Deque q = new LinkedList(); 
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		
		q.offerFirst("홍길동");
		// q.offerLast(q);
		
		// q.pollFirst();
		// q.pollLast();  뒤에서부터 가져오기(양방향)
		
		
		// FIFO 
		while ( ! q.isEmpty() ) {
			System.out.println(q.poll());   // 집어 넣은 순서대로 나옴
			// String name =(String) q.remove();  
			// System.out.println(name);
		}
		
		
		
	} // main

}//c
