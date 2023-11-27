package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 2:26:38
 * @subject  단항연산자  - 연산자 우선순위가 제일 높음
 *                종류 :  ++  --  +  -  ~(비트부정연산자)  !(부정연산자)  (cast) ...
 *                
 *               
 * @content
 */
public class Ex05_05 {

	public static void main(String[] args) {
		
		System.out.println(  +3  );  // 양수
		System.out.println(  -3   );  // 음수
		
		// 비트 부정(틸드) 연산자       0/1 두개의 값만 존재
		System.out.println(  ~5  );  // -6 왜,,,
		// 5를 이진수로 ===> 0000 0101(2)
		//            부정         1111 1010(2)    ====> -6
		
		// 보수 역진행 방법
		// -1하기                 1111 1001
		// 1의 보수               0000 0110        ====> 6
		//                                      6
		//                                     -6
		
		
		
		
	} //main
	
	
	
}//class
