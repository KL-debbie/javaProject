package days24;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// Arrays : 배열을 사용하기 쉽도록 기능이 구현된 클래스
		//				sort(), binarSearch(), fill(), copy(), ...
		
		// Collections 클래스 : Collections 클래스 사용하기 쉽도록 기능이 구현된 클래스
		ArrayList<Integer> list = new ArrayList<>();  // List 인터페이스 상속
		System.out.println(list); // []
		
		// 1,2,3,4,5 채워넣기
		// list.add(1)
		
		//						  <? super Object>
		// 			Collection<? super Object>
		//			, Object...
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);  //[1, 2, 3, 4, 5]
		
		Collections.rotate(list, 2);
		System.out.println(list); // [4, 5, 1, 2, 3]
		
		Collections.swap(list, 0, 2);
		System.out.println(list); // [1, 5, 4, 2, 3]
		
		Collections.shuffle(list);
		Collections.shuffle(list);
		Collections.shuffle(list);

		System.out.println(list); //임의의 위치로 자리바뀸
		
		Collections.sort(list);
		System.out.println(list); //[1, 2, 3, 4, 5] 오름차순 정렬하기
		
		//내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.fill(list, -1);
		System.out.println(list);
		
		// Collections.copy(null, null);
		// Collections.replaceAll(null, null, null)
		//등등등등등......
		
		
		
	} // main

}//cls

