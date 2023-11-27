package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ex05_03 {
	
	public static void main(String[] args) {
		
		int [] score = { 80, 95,50,85, 45, 65, 10, 100};
		
		/* 방법 1
		TreeSet<Integer> ts =new TreeSet<Integer>();
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		} // for
		*/
		
		
		// 방법 2
		// int [] -> ArrayList -> TreeSet 변환
		// Arrays.asList(T...배열);   문제점 : 클래스여야됨  
		//ArrayList<Integer> list = ;
		
		// IntStream -> int X , Integer Stream변환
		//								Stream<Integer>
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(score).boxed().collect(Collectors.toList());
		TreeSet<Integer> ts = new TreeSet<Integer>(list) ;
		
		
		// 1) 75 보다 큰 점수를 얻어와서 출력
		// tailSet (값) 지정한 값보다 큰 값의 객체들을 반환
		NavigableSet<Integer> ss = ts.tailSet(75, false); // == ts.tailSet(75);  , false = 지정값 포함 X
		System.out.println(ss);
		
		// 2) 50 보다 작은 점수를 얻어와서 출력
		
		// headSet 지정한 값보다 작은 값의 객체들을 반환
		
		NavigableSet<Integer> ss2 =ts.headSet(50, false);
		System.out.println(ss2);
		
		// 3) 50~75 사이의 점수를 얻어와서 출력
	
		NavigableSet<Integer> ss3 = ts.subSet(50, false, 75, false);
		System.out.println(ss3);
		
	} // main

}//cls
