package days05;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 19. - 오후 2:14:48
 * @subject
 * @content
 */
public class Ex04_03 {
	public static void main(String[] args) {
		// 1~10 합
		// [ 문제 ] 두 정수 n,m을 입력 받아 두 정수 사이의 홀수 합
		int n,m;
		try(Scanner sc =new Scanner(System.in)) {
			System.out.print("n,m입력");

			n=sc.nextInt();
			m=sc.nextInt();

			int min = Math.min(n, m);
			int max = Math.max(n, m);
			int sum =0;
			
			//for (int i = min%2==0?min+1:min; i <=max; i+=2) {
				if(min%2==0) min++;			//	if(i %2 !=0 ) {    // min값이 짝수이면 짝수의 합이 나옴
				for (int i = min; i <=max; i+=2) {
				sum += i;
					System.out.printf("%d+", i);
				// }
			} // for
			System.out.printf("\b=%d\n",sum);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

}
