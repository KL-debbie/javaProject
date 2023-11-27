package days04;

/**
 * @author KL
 * @date 2023. 7. 18. - 오후 2:27:12
 * @subject  가장 효율적 코딩
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		int sum= 0;
		// for문 10번 반복
		for (int i = 1; i <=10; i++){
			System.out.printf( "%d+",i );    //삼항 연산자 사용
			sum += i;
		}
		System.out.printf("\b=%d\n",sum); // \b- Backspace 기능 지우기 기능
	}

}
