package days18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex01_02 {

	public static void main(String[] args) {

		String [] names = {
				"김호영", "박정호", "주강민", "김정주", "고경림"
		};
		
		System.out.println(Arrays.toString(names));
		// String 배열을 줄 수 있는 부분이 없음 근데 넣어도 나옴 왜?
		// String -> Object 배열 담을 수 있음- 매개변수 다형성
		
		// 이름을 오름차순 정렬하여 출력 ㄱ~ㅎ
		Arrays.sort(names);   // 매개변수 다형성 오버로딩
		System.out.println(Arrays.toString(names));
		
		
		// 이름을 내림차순 정렬하여 출력 ㅎ~ㄱ
		// Arays.내림차순 정렬 메서드 존재 확인
		// [1]
		/*
		String [] temp = new String[names.length];
		
		 * 4->0
		 * 3->1
		 * 2->2
		 * 1->0
		 * 0->4
		
		for (int i = names.length-1 ; i >=0 ; i--) {
			temp[4-i]=names[i];
		} // for
		
		System.out.println(Arrays.toString(m));
		*/
		
		/*
		//[2] 배열 -> 기능구현 클래스 : Arrays 클래스
		//   컬렉션 -> 기능구현 클래스 : Collections 클래스
		Arrays.sort(names, Collections.reverseOrder());
		// <T> the class of the objects to be sorted  --- Type T는 반드시 클래스
		// reverseOrder() - 클래스타입 comparable인터페이스가 구현된 클래스
		System.out.println(Arrays.toString(names));
		*/
		
		/*
		//Arrays.sort(names, 정렬비교잣대);
		// 익명 클래스X
		  Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				 
			// return o1.equals(o2);
				return o2.compareTo(o1); // 양수, 음수, 0중 하나 
			}
		});
		  */
		  System.out.println(Arrays.toString(names));
			

		  //[3] 람다식
		  Arrays.sort(names, ( o1, o2) ->o2.compareTo(o1)); // 양수, 음수, 0중 하나 
		  System.out.println(Arrays.toString(names));
			
		
	} // main

}