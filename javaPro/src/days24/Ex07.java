package days24;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex07 {
	
	public static void main(String[] args) {
		//제네릭스, 어노테이션, 열거형
		// 자바 IO
		// 스레드 + 네트워크 X
		// 람다식과 스트림 X
		
		/*
		 *  제네릭(Generics) - <E>
		 * 	1. jdk 1.5- 제네릭
		 * 	   jdk 1.8 -람다식
		 * 	2. 제네릭이란?
		 * 		[다양한 타입]의 객체를 다루는 메서드, 컬렉션 클래스에서 [컴파일 시] 타입을 체크해 주는 기능.
		 * 3. 왜 컴파일 될때 체크 ? 객체의 타입을 컴파일 시에 체크하기 때문에 1) 객체의 타입 안정성을 높이고, 2) 형 변환의 번거로움이 줄어듦.
		 * 		==> 코드가 간결해짐.
		 * 		(제네릭의 장점)
		 * 	
		 */
		
		/*
		ArrayList list = new ArrayList();
		list.add("홍길동");
		// get의 리턴타입 Object이므로 String으로 다운캐스팅
		String name =	(String) list.get(0);
		System.out.println(list);
		
		list.add(20); // 잘못된 데이터 넣으면 안정성이 떨어짐
		// get의 리턴타입 Object이므로 (-> Integer ->) int으로 다운캐스팅
		int age = (int) list.get(1);
		System.out.println(list);
		
		list.add(true);
		list.add('A');
		*/
		
		// 제네릭 클래스
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김정주");
		list.add("이지현");
		list.add("김호영");
		/*
		String name = list.get(0);   // 다운캐스팅 필요 X
		System.out.println(name);
		*/
		
		Iterator<String> ir = list.iterator();
		while (ir.hasNext()) {
			String name =ir.next();
			System.out.println(name);
		}
		/*
		// 제네릭 부분 없을 시
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();  // 다운캐스팅 과정 필요
			System.out.println(name);
		}*/
		
	} // main

}//class
