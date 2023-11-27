package days07;

/**
 * @author KL
 * @date 2023. 7. 21. - 오후 4:14:14
 * @subject  함수 생성 연습
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		int result = 0;

		// 매개변수만큼 함수 생성

		result = sum(1,2);
		System.out.println(result);

		result = sum(1,2,3,4,5);
		System.out.println(result);

		result = sum(1,2,3,4,5,6,7,8);
		System.out.println(result);

		result = sum(1,2,3,4,5,68,50,69,7,8);
		System.out.println(result);
		
		  // 배열 초기화
        int [] m = {100,200,300,400};
        result = sum( m );
        System.out.println( result );
        
		// 가변인자

	}

	private static int sum(int ...n) {
		int result =0;
		for (int i = 1; i < n.length; i++) {
			result +=n[i];
		} // for
	return result;
	}
	
}//class
