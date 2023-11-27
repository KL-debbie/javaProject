package days22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex03_02 {

	public static void main(String[] args) {
		// 박민석(팀장), 유희진, 고경림, 임경재, 이지현 , 김정주, 김호영
		//1) 팀원들의 이름을 요소로 추가  
		String [] names = new String[7];
		
		Arrays.fill(names, null);
		ArrayList list = new ArrayList(10);
		list.add("박민석");
		list.add("유희진");
		list.add("고경림");
		list.add("임경재");
		list.add("이지현");
		list.add("김정주");
		list.add("김호영");

		dispList(list);

		System.out.println(list);		// [박민석, 유희진, 고경림, 임경재, 이지현, 김정주, 김호영]
		
		// 3) 팀 인원수 출력
		
		System.out.println(list.size());			// // 요소의 갯수 (7)7
		
		//list.trimToSize();   	//방의 갯수(10) - 요소의 갯수 (7) = 남은 방 갯수(3) 제거 
		
		// 4) 두 번째 팀원이 누구인지 확인 후 "홍길동" 팀원으로 수정
		String name= (String) list.get(1);   // Object - > String 다운캐스팅
		System.out.println(name);
		/*
		list.remove(1);
		list.add(1, "홍길동");
		*/
		
		list.set(1,"홍길동"); 	// 교체

		System.out.println(list);				
		
		// 5) "홍길동" 팀원의 존재 유무를 확인 후 삭제
		boolean s= list.contains("홍길동");
		int index = list.indexOf("홍길동");
		list.remove(index);  //삭제된 요소(홍길동) 반환
				
		// 6) "김"씨 팀원들만 삭제 후 확인.
		
		/*
		String regex = "김.+";   // 
		name.charAt(0)=='김';
		*/
		name.startsWith("김");
		list.remove(name);
		
		
		System.out.println(list);				// [박민석, 고경림, 임경재, 이지현]
			
		// System.out.println(name); 결과
		/*박민석
		고경림
		임경재
		이지현
		 */
		
	} // main

	//2) 반복자 사용해서 모든 요소(팀원들) 출력
	private static void dispList(ArrayList list) {
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
	}
}
