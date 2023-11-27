package days22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 8. 11. - 오전 10:45:54
 * @subject  람다식 사용해 "김"씨 삭제
 * @content
 */
public class Ex03_03 {

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
		
		// "김"씨만 삭제
		// subtractOddList.removeIf(a -> a%2 == 1);   // 홀수 제거
		// [출처] [Java/자바] - ArrayList.removeIf(predicate<? super E> filter)|작성자 주현
		//  람다식
		list.removeIf(n->((String) n).charAt(0)=='김');
		System.out.println(list);
		
		
	} // main

}
