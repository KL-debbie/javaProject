package days05;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 19. - 오후 2:14:48
 * @subject
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		// 1~10 합
		// [ 문제 ] 두 정수 n,m을 입력 받아
		// 두 정수 사이의 합 구하기
		// 예) 2,5
		//n,m입력  5 2 => 결과값=0    for (int i = n; i <=m; i++)  => n이 m보다 큰값으로 for문이 돌지않음
		int n,m;
		try(Scanner sc =new Scanner(System.in)) {
			System.out.print("n,m입력");

			n=sc.nextInt();
			m=sc.nextInt();

			// 3)
			/*
			int min = n > m? m : n;
			int max = n > m? m : n;
			int sum =0;
			for (int i = min; i <=max; i++) {
				sum += i;
				System.out.printf("%d+", i);
			} // for
			System.out.printf("\b=%d\n",sum);
			 */
			
			// 4) Math 클래스- 수학관련 메서드(기능)
			//     Math.random()
			int min = Math.min(n, m);
			int max = Math.max(n, m);
			int sum =0;
			for (int i = min; i <=max; i++) {
				sum += i;
				System.out.printf("%d+", i);
			} // for
			System.out.printf("\b=%d\n",sum);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		int sum= 0;
		for (int i = 0; i <=10; i++) {
			sum += i;
			System.out.printf("%d+",i);
		} // for
		System.out.printf("\b=%d",sum);
		 */
		
	} // main

}
