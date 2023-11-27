package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 2:39:49
 * @subject   단항연산자 ++        --
 * @content          ㄴ     증감 연산자   
 */
public class Ex05_06 {

	public static void main(String[] args) {

		// 어떤 기억 공간(n)의 값을 1증가 시키는 코딩.
		// 어떤 기억 공간(n)의 값을 3증가 시키는 코딩.
		// 어떤 기억 공간(n)의 값을 1감소 시키는 코딩.

		int n = 10;
		System.out.println( n );  // 10


		//n = 11; 
		// 복합대입연산자 +=, -=
		// 1) n = n + 1; 
		// 2) n += 1;
		// 3) n++;  (후위형 증감연산자)   Ex05_07.java
		// 4) ++n;  (전위형 증감연산자)   
		
		// 1) n = n - 1; 
		// 2) n -= 1;  
		// 3) n--;  
		// 4) --n;
		
		// n = n + 3;   ==  n += 3;   // 증가 원하는 만큼 숫자만 변경
		
		System.out.println( n );        //  11





	} // main

} // class
