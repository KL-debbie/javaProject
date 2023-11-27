package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 2:13:25
 * @subject  재귀함수
 *                예제,,,
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// 2^3 = 8
		// 2^-3= 1/8=0.125
		// [거듭제곱] == 누승 == 멱 == pow
		// 밑수(2)를 지수(3)만큼 반복해서 곱하는 것.
		
		//일반함수
		double result = recursivePow(2,3);
		System.out.println(result);
		//재귀함수
		
	}//main
		
		
		private static double recursivePow(int n, int m) {
			if(m > 1) 	return  n * recursivePow(n, m-1);
			else if( m ==1 ) return n;	
			else if( m ==0 ) return 1;	
		else return   (double) 1/(recursivePow(n, -1*m));
		
		}

	
	//  일반 함수 구현후 재귀함수 구현하기.. 
	private static double pow(int n, int m) {
		double result =1;
		int exp =Math.abs( m) ; //절대값
		
		// if(m <0 ) exp= -1*m; 
		
		for (int i = 1; i<=exp; i++) {
		result *= n;
		} // for
		if( m<0) return(double) 1/result;
		else return result;
	}

}//class
