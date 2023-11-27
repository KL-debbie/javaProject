package days22;

public class Ex08 {
	
	public static void main(String[] args) {
		// LinkedList 컬렉션클래스
		// 1. 배열				
		//		(1) 장점 - 읽기 성능이 가장 빠르다.
		//		(2) 단점 - 배열크기가 자동 증가 X, 삽입, 삭제 속도가 느림.
		//		메모리상에 동일한 자료형으로 연속적으로 놓이게 한 것.
		// 2. 링크드리스트(LinkedList)	
		//		(특징) - 비연속적
		//		(1) ArrayList, Vector 데이터 값 - Element(요소)
		//		(2) 데이터 값- Node(노드)
		//			각 노드들은 연결되어 있음
		//			[Node]						[[주소=0x400]Node]				[[0x200]Node]- 노드 자신과 노드간의 연결되는 주소 존재
		//			0x100							0x200								0x300
		//					   [0x100Node삽입] 
		//				     	0x400
		// 			노드 삭제 시 앞에 데이터 값 참조함
		//			단방향 환형 링크드리스트 - 노드 주소 하나만 가지고 있음
		//			양방향(더블) 환형 링크드리스트 - 양쪽의 노드 주소를 가지고 있음
		//			환형 링크드리스트 - 젤 마지마 노드가 처음 노드 주소값을 가지는 것.
		
		Node node1 = new Node();
		node1.value = 10;
		
		Node node2 = new Node();
		node2.value = 20;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.value = 30;
		node2.next = node3;
		
		Node node4 = new Node();
		node4.value = 40;
		node3.next = node4;
		
		// 노드2와 노드3 사이에 노드5를 삽입
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		node5.next = node3;
		
		// node3 삭제
		node5.next = node4;
		
		// node4 삭제
		node5.next = null;
		
		
		
	} // main

}//c

class Node{
	int value;  //값
	Node next= null; // 다음 노드의 주소를 참조 필드
	// Node prev = null; // 이전 노드의 주소를 참조 필드
	
	
	
}
