package days04;

public class Ex06 {

	public static void main(String[] args) {
		int sum= 0;
		// for문 10번 반복
		for (int i = 1; i <=10; i++){
			// if문 10번 반복
			if ( i == 10) {
				System.out.printf("%d",i);    // 10뒤에 + 안붙게..
			}else {
				System.out.printf("%d+",i );
			}
			
			sum += i;
		}
		System.out.printf("=%d\n",sum);
	}

}
