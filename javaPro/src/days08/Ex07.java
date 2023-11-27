package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 12:35:07
 * @subject
		// 재귀함수
		// 1) 1~n 합 재귀함수
		// 2) 팩토리얼(factorial)=계승
		//   정의) 1에서 양의 정수의 곱
		// n!=n*(n-1)*(n-2)*...*1
		// 5!=5*4*3*2*1
		// -5는 불가
		// 0! ==1  
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		/*
		// 일반함수
		int result =factorial(5);
		System.out.println(result);
		*/
		
		// 재귀함수
		int result =recursiveFactorial(5);
		System.out.println(result);
		
		
	}//main

	//재귀함수
	private static int recursiveFactorial(int n) {
		if( n>1 ) return n*  recursiveFactorial(n-1);
		else if ( n==1 || n==0 ) return 1;
		else return -1;
	}

	private static int factorial(int n) {
		if( n <0 ) return -1;
		
		 // 5*4*3*2*1
		int result = 1;
		for (int i = n; i >=1; i--) {
			result = result *i;
			
		} // for
		return result;
	}

}//class
