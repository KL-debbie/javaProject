package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 3:11:41
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {

		// 산술, 비교, 논리, 단항

		// 삼항연산자      ?:
		//            [항1]?항2:항3         [항1]은 수식
		//       ㄴ   항 1이 참이면     항 2
		//       ㄴ   항 1이 거짓이면   항 3

		int x =10;
		//int y=( x > 20 ? 100 : 200);
		//            항1      항2    항3
		// 항 1이 거짓이므로 항3 계산
		int y=( 200 );   // > x=10, y=200
		
		System.out.printf("> x=%d, y=%d\n", x, y);

	} // main

}// class
