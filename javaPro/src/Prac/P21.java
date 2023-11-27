package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 1:01:54
 * @subject p 65 for문(반복제어문)
 * @content
 */
public class P21 {

	public static void main(String[] args) {

		/* for문
		 * for( 1) 초기식 ; 2) 조건식; 3) 증감식) {
		 *       4) 반복 수행문; }
		 *       실행 순서 1) -> 2) -> 4) ->3) ------ 2) -> 4) ->3) 반복
		 */
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
			
		}
		for (int i = 10; i>=1; i--) {
			System.out.println(i);
		}
		
	}
}
