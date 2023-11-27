package days05;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 19. - 오후 3:45:55
 * @subject   while 조건 반복문
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {

		int n,m;
		try(Scanner sc =new Scanner(System.in)) {
			System.out.print("n,m입력");

			n=sc.nextInt();
			m=sc.nextInt();

			int min = Math.min(n, m);
			int max = Math.max(n, m);
			int sum =0;

			
			if(min%2==0) min++;
			
			//for -> while 변경
			/*
			int i = min;
			while ( i <= max) {
				sum +=i;
				System.out.printf("%d+",i);
			i+=2;
			}
			*/
			
			while ( min <= max) {
				sum +=min;
				System.out.printf("%d+",min);
				min+=2;
			}
			System.out.printf("\b=%d\n",sum);


		} catch (Exception e) {
			e.printStackTrace();
		}


	} // main

}
