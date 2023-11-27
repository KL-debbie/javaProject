package days23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import days22.Ex15;

public class Ex {
	
	public static void main(String[] args) {
		/* 현재 시간 LocalDateTime 출력 형식
		String patter = "yy/MM/dd E요일 hh:mm:ss.SSSS";
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(patter);
		String op = dtf.format(now);
		System.out.println(op);
		*/
		
		/*
		String s = "2023.08.13 일요일";
		String pattern = "yyyy.MM.dd E요일";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate ld = LocalDate.parse(s,dtf);
		System.out.println(ld);
		*/
		
		/*
		LocalDateTime sst = LocalDateTime.of(2023, 8, 10, 9, 0, 0);
		LocalDateTime est = LocalDateTime.of(2023, 8, 15, 18, 0, 0);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.isAfter(est));
		if (now.isBefore(sst)||now.isAfter(est)) {
			System.out.println("No");
		} else System.out.println("Yes");
		*/
		
		/*요소 추가, 크기 출력 반복자, 사용해 요소 출력
		ArrayList list = new ArrayList();
		list.add("가자");
		list.add("가지");
		list.add("가수");
		list.add("자전거");
		
		System.out.println(list.size());
		
		Iterator ir =list.iterator();
		while (ir.hasNext()) {
			String  name = (String ) ir.next();
			System.out.println(name);
		} //while
		
		//두번째 요소 확인 후 "가고싶다"로 바꾸기
		String name = (String) list.get(1);
		System.out.println(name);
		list.set(1, "가고싶다");
		System.out.println(list);
		
		// "가고싶다" 존재 확인 후 삭제
		boolean s = list.contains("가고싶다");
		int index = list.indexOf("가고싶다");
		list.remove(index);
		System.out.println(list);
		
		//"가"로 시작하는 요소 모두 삭제
		list.removeIf(n->((String) n).charAt(0)=='가');
		System.out.println(list);
		*/
		
		Vector v = new Vector();
		/*Vector 컬렉션 클래스
		 * List 인터페이스 구현한 클래스
		 * 순서유지, 중복허용
		 * 멀티스레드에 안전, 동기화처리
		 * 데이터 값 - 요소(Element)
		 * 
		 * 배열 - 읽기 성능은 빠름, 배열크기가 자동증가X, 삭제, 삽입 속도 느림
		 * 		- 메모리상에 동일한 자료형으로 연속적으로 놓이게 한 것
		 * 
		 * LinkedList - 비연속적, 데이터 값 : 노드(각 노드는 연결되어 있음)
		 * 단방향 환형 링크드리스트 : 노드 주소값이 하나
		 * 양방향 환형 링크드리스트 : 양쪽 노드 주소값을 갖고있음
		 * 환형 링크드리스트 : 제일 마지막 노드가 처음 노드 주소값을 갖는 것
		 * ****ArrayList와 비교		읽기								삽입/추가/삭제		비고
		 * 1. ArrayList 		: 빠름										느림		  순차적 삽입/삭제는 빠름(맨 뒤에 이어 붙이므로)  ==> 읽기용도
		 * 2. LinkedList		: 느림(앞에서부터 주소 따라 읽어야 함)		빠름		  데이터가 많을수록 접근성이 떨어짐			==> 잦은 수정, 삭제 시 사용
		 * 
		 * 
		 * 스택 : LIFO 구조
		 * 데이터 추가 : push(), 데이터 삭제(가장 마지막 요소부터) : pop()
		 * 마지막 요소를 읽어오기만 하고 삭제는 X : peek()
		 * index : 위치값 1부터 시작, 요소가 있는지 물어보고 위치값 돌려줌, 찾는값 없을 시 -1 반환
		 * 
		 * Queue : FIFO 구조
		 * 먼저 들어간 데이터가 가장 먼저 나옴
		 * 데이터 추가 : offer(), 데이터 삭제 : poll()
		 * 마지막 요소를 읽어오기만 하고 삭제는 X : peek()
		 * 컬렉션 인터페이스를 상속 받은 인터페이스
		 * Deque - 양방향으로 삽입, 제거 가능
		 * 
		 * PriorityQueue : FIFO 구조
		 * 우선순위가 높은 것부터 꺼내오는 큐
		 * 작은 숫자가 우선순위가 높다...
		 * 
		 * ListIterator
		 * - iterator 에 양뱡향 조회 기능이 추가된 반복자
		 * - List인터페이스를 구현한 클래스에만 사용 가능
		 * hasNext(), hasPrevious()
		 * 
		 * Comparable 인터페이스 : 기본 정렬 기준을 구현
		 * Comparator 인터페이스 : 기본 정렬 기준 + 외 다른 기준으로 정렬하고자 할때..
		 * 
		 * Collection 인터페이스- Set 인터페이스 구현한 클래스
		 * -특징 : 순서유지 및 중복허용 X
		 * HashSet 컬렉션 클래스
		 * (참고) Set+ 순서유지 = LinkedHashSet 컬렉션 클래스 사용
		 */
		
		int gameNumber =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		gameNumber = sc.nextInt();
		
		ArrayList lottos = new ArrayList();
		
		LinkedHashSet lotto;
		for (int i = 0; i < gameNumber; i++) {
			dispLotto(lottos);
			lotto = new  LinkedHashSet();
			Ex15.fillLotto(lotto);
			System.out.println(lotto);
			
		} // for
		
		/*String [] -> ArrayList
		String [] names = {"내일","월욜","끔찍"};
		List list = Arrays.asList(names);
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list);
		System.out.println(list2);
		*/
		
		ArrayList list = new ArrayList();
		list.add("내일");
		list.add("월욜");
		list.add("끔찍");
		
		String [] names = (String[]) list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(names));
		
	} // main

	private static void dispLotto(ArrayList lottos) {
		Iterator ir=lottos.iterator();
		while (ir.hasNext()) {
			LinkedHashSet lotto = (LinkedHashSet) ir.next();
			Ex15.dispLotto(lotto);
		} //while
	}

}
