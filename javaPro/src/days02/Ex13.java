package days02;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 3:15:51
 * @subject  음수 표현
 * @content  정수의 진법 변환 / 2 더이상 나뉘지 않을 때 까지 나누기(나머지가 0)
 *                실수의 진법 변환  * 2 소수점 밑에가 없을때까지 곱하기
 */

public class Ex13 {

	public static void main(String[] args) {

		// 정수 10           0000 1010 
		// 'A'                00000000 01000001
		// 음수 - 10        []  ?      -> 이진수로 표현할 수 밖에 없음
		// [ 2의 보수법 ]
		// 1. 음수 절대치 구하기 |-10| => 10
		// 2. 1의 보수 취하기         
		//                                       0000 1010
		//                                       1111 0101    
		//3. 1을 더한다.                                    1
		//                                       1111 0110    ->  -10

		
		// 예)
		// 0.625  x 2 = [1].25
		// 0.25    x 2 = [0].5
		// 0.5      x 2 =[1].0
		
		// 0.625 실수 -> 0.101(2)
		
		
		
	}//main
	
}//class
