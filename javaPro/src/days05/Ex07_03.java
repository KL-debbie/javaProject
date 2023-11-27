package days05;

/**
 * @author KL
 * @date 2023. 7. 19. - 오후 4:35:05
 * @subject  foreach 
 * @content   // 조건문 : if
		           // 분기문 : switch
		           // 반복문 : for                        , foreach(확장for문)
		           // 기타 : break, continue
		            // 조건 반복문 : while,  do~while
 */
public class Ex07_03 {
	public static void main(String[] args) {
		//시험//
		
		//foreach 배열, 컬렉션 반복처리

		//1.  정수 10개 저장할 배열 m 선언
		int [] m = new int[10];

		// 2. 임의의 정수(1~100)를 각 배열의 요소에 저장
		// 0.0 <= double Math.random()*100 < 1.0
		// 0 <= (int)( Math.random()*100 ) < 100
		// 1 <= (int)( Math.random()*100 )+1 < 101  // 임의의 정수(1~100)를 각 배열의 요소에 저장 방법
		/*
		m[0] = (int)( Math.random()*100 )+1;
		m[1] = (int)( Math.random()*100 )+1;
		m[2] = (int)( Math.random()*100 )+1;
		m[3] = (int)( Math.random()*100 )+1;
		m[4] = (int)( Math.random()*100 )+1;
		m[5] = (int)( Math.random()*100 )+1;
		m[6] = (int)( Math.random()*100 )+1;
		m[7] = (int)( Math.random()*100 )+1;
		m[8] = (int)( Math.random()*100 )+1;
		m[9] = (int)( Math.random()*100 )+1;
		 */
		for (int i = 0; i < m.length; i++) {
			m[i] =  (int)( Math.random()*100 )+1;
		} // for
		// for문 사용하여 각 배열요소 출력
		/*
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n", i, m[i]);
		} // for
		*/

		// foreach 문 사용해서 출력
		for (int n : m) { // 배열의 0-1-2---요소를 변수에 저장 출력
			System.out.println( n );
		}//foreach
		
	} // main

}//class
