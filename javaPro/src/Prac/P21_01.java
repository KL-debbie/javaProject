package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 1:01:54
 * @subject p 65 for문(반복제어문)
 * @content
 */
public class P21_01 {

	public static void main(String[] args) {
		int sum = 0 ;
		int evenCount = 0;
		int oddCount = 0;
		
		/* for문
		 * for( 1) 초기식 ; 2) 조건식; 3) 증감식) {
		 *       4) 반복 수행문; }
		 *       실행 순서 1) -> 2) -> 4) ->3)
		 */
		
		for(int i =1; i <=10; i++ ) {
			if(i % 2 !=0) {
				sum = sum +i;
				evenCount++;
				oddCount++;
			}
		}
		 System.out.println("짝수갯수" + evenCount);
		System.out.println("홀수갯수"+ oddCount);
			System.out.println("홀수 합" + sum);
			
			
		}
		
	
}
