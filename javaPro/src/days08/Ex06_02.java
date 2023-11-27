package days08;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 12:21:10
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
	
		int n = 10;
		int result = sum(n); 
		System.out.printf("1~%d=%d\n",n , result);
		// 1부터 n까지 합을 구하는 일반함수 생성
		// 1부터 n까지 합을 구하는 재귀함수 생성
		result = recursiveSum(n);
		System.out.printf("1~%d=%d\n",n , result);
		
	}//main
	
	// 함수 n번 호출    성능 낮음 가능하면 안쓰기
	// 트리 구조 - 검색 등에는 사용
	// recursiveSum(10)
	// 10 + recursiveSum(9)
	//        9+ recursiveSum(8)
	//             8 + recursiveSum(7)
	//            :
	//                  2 + recursiveSum(1)
	// 10+9+8+...+2+1
	private static int recursiveSum(int n) {
		if (n==1) return 1;
		else        return  n + recursiveSum(n-1);
	}

	private static int sum(int n) {
		int result= 0;
		for (int i = 1; i <=n; i++) {
			result +=i;
		} // for
		return result;
	}

}//class
