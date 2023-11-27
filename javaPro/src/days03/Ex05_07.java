package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 3:04:26
 * @subject 전위형, 후위형 증감연산자 설명
 * @content
 */
public class Ex05_07 {

	public static void main(String[] args) {

		int x = 10;
		// int y =  ++x;     // 전위형   ++ 먼저 처리( 값 증가 ) 그다음 대입  > x = 11, y=11
		int y =  x++;     // 후위형   대입 먼저  ++ 후 처리 ( 값 증가 )    > x = 11, y=10
		
		// 단독(홀로) 사용 될 때는 전/후위형은 같은 결과
		//++x;
		// x++;
		
		System.out.printf("> x = %d, y=%d\n", x, y);
		

	} // main

} // class
