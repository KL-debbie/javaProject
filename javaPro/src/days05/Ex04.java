package days05;

/**
 * @author KL
 * @date 2023. 7. 19. - 오후 2:01:32
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		  1+2+...+9+10=55
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			sum +=i;
			System.out.printf(i ==10?"%d": "%d+",i);
		} // for
			System.out.printf("\b=%d",sum);
		 */

		// 2) 1~10 중 홀수의 합
		/*
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if (i % 2 !=0) {
				sum +=i;
				System.out.printf( "%d+",i);	
			} 
		} // for
		System.out.printf("\b=%d",sum);
		 */

		// 3) 1~10 중 홀수의 합
		/*
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if ( i%2 ==0) continue;{   //continue 밑에 코딩 진행하지 않고 바로 증감식으로 이동
				sum +=i;
				System.out.printf( "%d+",i);	
			} 
		} // for
		System.out.printf("\b=%d",sum);
		 */

		// 4)
		int sum = 0;
		for (int i = 1; i <=10; i+=2) {
			sum +=i;
			System.out.printf( "%d+",i);	
		} // for
		System.out.printf("\b=%d",sum);


		// 5) 1~n까지의 합 출력
		// 1+2+3+4+5 =15
		/*int n =5;
		int sum = 0;
		for (int i = 1; i <=n; i++) {
			 sum +=i;
			 System.out.printf( i==n?"%d": "%d+",i);	
		} // for
		System.out.printf("\b=%d",sum);
		 */
	}

} // main


