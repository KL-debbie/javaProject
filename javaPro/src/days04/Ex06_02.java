package days04;

public class Ex06_02 {

	public static void main(String[] args) {
		int sum= 0;
		// for문 10번 반복
		for (int i = 1; i <=10; i++){
			System.out.printf(i == 10? "%d": "%d+",i );    //삼항 연산자 사용
			sum += i;
		}
		System.out.printf("=%d\n",sum);
	}

}
