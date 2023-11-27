package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 2:58:01
 * @subject p 75 do~ while문
 * @content
 */
public class P25 {

	public static void main(String[] args) {
		
		
		/* do ~while 문 형식
		 * 1) 초기식;
		 * do {
		 *       2) 반복 수행문;
		 *       3) 증감식;
		 * } while ( 4) 조건식 ) ;
		 * 
		 * 조건식이 false 여도 반복 수행문이 한번은 실행됨
		 * 순서  1)- -> 2) -> 3) -> 4) ------ 2) -> 3) -> 4) 반복      
		 */
		int i = 10;
		
		do {
			System.out.println(i);
			i++;
		
		} while (i <10);
	}

}
