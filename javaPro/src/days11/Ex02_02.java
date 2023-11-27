package days11;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author KL
 * @date 2023. 7. 27. - 오전 10:45:48
 * @subject
 * @content
 *      // 검색(Search)
		// 1. 순차검색( sequential Search )
		// 2. 이진검색( binary Search )        +  정렬(필수)
 */
public class Ex02_02 {
	public static void main(String[] args) {
		
		// int [] m = {3,5,2,4,1};
		// 위 코딩처럼 배열m사용 ==> 단점
		// 1) 요소추가 ( 배열 크기 자동 증가/감소X)
		// 2) 요소삽입 (      "     +  앞뒤로 추가)
		// 3) 요소삭제 
		// 4) 요소수정  X
		
		// -> 컬렉션(collection) 클래스
		// ArrayList<E>
		ArrayList list = new ArrayList();
		list.add(3);            // int [] m = {3,5,2,4,1};  같은 코딩
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(1);          // 배열 크기 자동 증가
		
		int index = list.indexOf(4);    // 요소 위치(index)
		System.out.println(index);   
		System.out.println(list);
		list.add(index, 100);          // 요소 삽입
		System.out.println(list);
		
	} // main

}//class
