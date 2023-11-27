package days11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author KL
 * @date 2023. 7. 27. - 오전 11:22:05
 * @subject
 * @content
 */
public class Ex02_03 {
	
	public static void main(String[] args) {
		// 배열선언
		int [] m = {3,5,2,4,1};

		// int [] -> ArrayList 변환,,,,,,,
		// 2)  
		
		List<Integer> list = IntStream.of(m).boxed().collect(Collectors.toList());
		int index=list.indexOf(4);
		list.add(index,100);
		
		/*  1)
		ArrayList list = new ArrayList();
		for (int i = 0; i < m.length; i++) {
			list.add(m[i]);
		} // for
		System.out.println(list);
		*/
		
		
	} // main

}
