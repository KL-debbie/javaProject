package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오전 10:00:05
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		String name ="홍길동";
		
		System.out.printf("%s\n",name);          // 홍길동
		System.out.printf("[%s]\n",name);        // [홍길동]
		System.out.printf("[%10s]\n",name);    // [       홍길동]    총 10자리 확보 우측정렬 
		System.out.printf("[%-10s]\n",name);   // [홍길동       ]    총 10자리 확보 좌측정렬 
		
		
		// byte %d(short, int, long) => %d, %o, %x
		int n =50;
		System.out.printf("%d\n", n);    // 50    d -> 10진수
		System.out.printf("%#o\n", n);  // 62    o -> 8진수     // #(flag) 입력 시 062
		System.out.printf("%#x\n", n);  // 32    n -> 16진수   // # 입력 시 0x32
		
		double pi = 3.141592;
		System.out.printf("%f\n",pi);
		System.out.printf("%.3f\n",pi);   // . -> 소숫점 몇째자리까지 찍어라, 자동 반올림 처리됨
		System.out.printf("[%10.3f]\n",pi);    // [     3.142] 10자리 확보 후 우측정렬
		

		int no = 1; // 0001
		System.out.printf("%d\n", no);
		System.out.printf("%4d\n", no);    // 4자리 확보 후 우측 정렬
		System.out.printf("%04d\n", no);  // 0001 ****중요****

		
		System.out.printf("%d(%c)\n",65, 65); // 65(A)
		System.out.printf("%1$d(%1$c)\n",65);  // 65(A)
		// java.util.MissingFormatArgumentException: Format specifier '%c'
		// %c의 인자가 빠져있음
		// 1$ -> 첫번째 매개변수를 모두 적용 시킴
		
		
		
		
		
		
		
	} //main

} //class
