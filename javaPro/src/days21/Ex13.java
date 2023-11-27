package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex13 {

	public static void main(String[] args) {
		
		// 1. 컬렉션 클래스 - ArrayList
		//			ㄴ 가장 많이 사용되는 컬렉션 클래스
		//			ㄴ List 인터페이스를 구현한 클래스
		//			ㄴ (순서 유지, 중복 허용 O)
		//			ㄴ 배열처럼 사용 됨(배열 요소 _Element)
		//			ㄴ 배열    		   ArrayList
		//			ㄴ 배열의 단점    ㄴ배열의 단점 보완 days.EX03.java;
		
		String [] names = new String[3];
		names[0]= "주강민";
		names[1]= "정하영";
		names[2]= "임경재";
		System.out.println(names.length);
		// java.lang.ArrayIndexOutOfBoundsException
		// names[3] = "이지현";
		// 검색 후 출력
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("정하영")) {
				System.out.println(names[i]);
			}
		} // for
		
		Arrays.fill(names, null);//null값으로 초기화
		
		//ArrayList list = new ArrayList(10); //초기용량 10개(default)
		ArrayList list = new ArrayList(3);
		list.add("주강민"); //0
		list.add("정하영"); //1
		list.add("임경재"); //2
		System.out.println(list.size());
		list.add("이지현");  //3
		
		System.out.println(list.contains("정하영"));  // t/f
		//몇번쨰?
		int index = list.indexOf("정하영");
		if (index != -1) {
			System.out.println(list.get(index)); // 위치값
			list.remove(index);  // 삭제
			list.add(index, "홍길동");  // 삭제 후 홍길동 삽입
		} else {
			System.out.println("정하영씨 없음");   // -1이면 찾는 값 없음
		}
		
		//System.out.println(list.get(1)); //index값
		
		System.out.println(list);
		
		// index= list.lastIndexOf("정하영"); //뒤에서부터 찾기
		
		//모든 요소 삭제
		// list.clear();
		System.out.println(list.isEmpty());  // t/f값 비워져있는지 물어보기
		System.out.println(list);
		
		// *********iterator*********
		// - 요소를 순차적으로 접근하여 처리 할 수 있는 반복자 (Iterator)를 반환하는 메서드
		Iterator ir = list.iterator();  
	
		// hasNext() - 있는지 없는지 물어보는 함수, 다음 요소가 있으면 true  / 없으면 false
		while (ir.hasNext()) {
			//									 next() : 다음 요소를 얻어오는 메서드
			String name = (String) ir.next();
			System.out.println(name);  		// 리스트 순서대로 출력됨
		}//while
		// 리스트 순서대로 출력됨
		
	} // main
	
}
