package days07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex07_03 {

	public static void main(String[] args) {
		// [피보나치수열]
		// 항이 100보다 같거나 작을 때 까지의 수열을 출력
		// 합 구해서 출력
		// 1+1+2+3+5+8+13+ ...... + 항(100??) ==?

		// 1 =1
		// 1+2 => 3

		/* 1]

		int [] p = new int[20];  //ArrayList
		p[1]=p[0]=1;
		// 0     1   2  3
		//[ 1 ][ 1][2][3][5][][]....[92][xxx][]
		int index=2;
		while (true) {
			int term = p[index-1]+p[index-2];
		if( term> 100) break;
		p[index]= term;
		index++;
		}
		System.out.println(Arrays.toString(p));
		System.out.println(index);   // 11 : 배열크기에 속하는 값

		// JDK 1.8 람다식과 스트림
		int sum=IntStream.of(p).sum();
		System.out.println(sum);
		 */

		//2)
		// 첫번째 항 1    (토끼 암컷)
		// 두번째 항 1    (토끼 수컷)
		
		//**[순서도] 그리기
				
		int firstTerm =1;
		int secTerm =1;
		int nextTerm ;
		int sum = firstTerm + secTerm;
		
		System.out.printf("%d+%d+",firstTerm,secTerm);
	/*  A)
		while (true) {
			nextTerm=firstTerm + secTerm;
			if(nextTerm > 100) break;
			System.out.printf("%d+",nextTerm);
			sum += nextTerm;
			firstTerm = secTerm;	// ***** firstTerm 과 secTerm이 각각 바뀌므로
			secTerm = nextTerm;
		}//while
		System.out.printf("=%d",sum);
		*/
		
		// B)
		while ((nextTerm=firstTerm + secTerm) <=100) {
			System.out.printf("%d+",nextTerm);
			sum += nextTerm;
			firstTerm = secTerm;	// ***** firstTerm 과 secTerm이 각각 바뀌므로
			secTerm = nextTerm;
		}
		System.out.printf("=%d",sum);
		
		}//main

}//class
