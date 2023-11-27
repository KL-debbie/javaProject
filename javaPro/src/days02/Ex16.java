package days02;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 4:27:06
 * @subject 형 변환
 * @content
 */

public class Ex16 {
	
	public static void main(String[] args) {
		// 1. 자동형변환  -  2가지      // [][][][]
		int i =10;
		
		// 좌측 기억공간이 우측보다 더 클 경우 자동으로 변환되어 들어가짐
		long l = i;                   // [][][][][][][][10]
		float f = l;
		System.out.println(f);   
		
		long L = l + i;  // long + int = long 모든 연산 큰 자료형으로 연산되어진 결과
		
		
		
		// 2. 강제형변환
		//    3*(5+2)  () 최우선연산자
		//    (변환하고자 하는 타입)  cast 연산자            캐스트 강제형변환
		
		
		int a = 20;
		int b = 3;
		System.out.println( a/b );                //실제 결과값은 6(몫) int/int => int 
		System.out.println( (double)a/b );   // int/double => double( 6.66666--- 나누는 값 하나를 실수로 변환)
		
		                                      
	} // main

} // class
