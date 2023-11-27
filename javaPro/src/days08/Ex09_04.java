package days08;

import java.util.Random;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 4:31:19
 * @subject
 * @content
 */
public class Ex09_04 {

	public static void main(String[] args) {

		//람다식과 스트림
		// 1부터 45까지 정수 중복이 제거된 숫자 6ro
		new Random()
		.ints(1,46)      //1-45 정수
		.distinct()       // 중복 제거
		.limit(6)         // 6개만 추출
		.sorted()        // 오름차순
		.forEach(System.out::println);          // 메서드 참조
		//.forEach(n->System.out.println(n));
		
		
		            //  -> 람다연산자
		
	}//main

}//class
