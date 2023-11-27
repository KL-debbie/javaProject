package days05;

/**
 * @author KL
 * @date 2023. 7. 19. - 오후 3:45:55
 * @subject   while 조건 반복문
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		
		// 1] 10+9+----+2+1=55
	
		int i=10, sum=0;
		while (i >=1) {
			sum +=i;
			System.out.printf("%d+",i);
			i--;
		}
		System.out.printf("\b=%d\n",sum);
		
		
	
		
	} // main

}
