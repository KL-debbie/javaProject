package days22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex13 {
	
	public static void main(String[] args) {
		// Comparable 인터페이스 	: 기본 정렬 기준을 구현
		// Comparator 인터페이스		: 			"		외에 다른 기준으로 정렬하고자 할 때 사용.
		
		
		String [] names = {"이지현","김호영","임경재","유희진"};  
		System.out.println(Arrays.toString(names));
		
		// 오름차순 정렬
		// Arrays.sort(names);
		// [김호영, 유희진, 이지현, 임경재]
		// System.out.println(Arrays.toString(names));
		
		// 내림차순 정렬
		Arrays.sort(names,new StringDescendingComparator());
		//Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);    // 대소문자 구분하지 않고 오름차순으로 정렬
		
		//Collections.reverseOrder();
		
		System.out.println(Arrays.toString(names));
		
		
		
	} // main

}//c
 class StringDescendingComparator implements Comparator<String>{// 제네릭

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
	
}