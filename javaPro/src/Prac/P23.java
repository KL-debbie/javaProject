package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 1:53:03
 * @subject P 70 while 문
 * @content
 */
public class P23 {

	public static void main(String[] args) {
		
		/* while 형식
		 * 1) 초기식 ;
		 * while ( 2) 조건식) {
		 *         3) 반복 수행문 ;
		 *         4) 증감식 ;
		 *         }
		 * 수행순서 1) -> 2) -> 3) -> 4) ------- 2) -> 3) -> 4) 반복
		 * 반복횟수가 명확하지 않을때 사용....? 무슨의미
		 */
		int i = 1;
		int sum = 0;
		
		
		while(i <= 10) {
			if(i %2 ==0) {
				sum = sum+ i;       // 무슨 의미???
				System.out.println(i);
			}
			i++;
		}
		System.out.println("짝수합" + sum);
		
	}
}
