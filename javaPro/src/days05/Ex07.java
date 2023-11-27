package days05;

import java.io.IOException;

/**
 * @author KL
 * @date 2023. 7. 19. - 오후 4:09:10
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
		int code; // read 반환이 int ASCII코드 값 반환
		char one;
		
		//[1]
		System.out.print("한 문자를 입력? ");
		code= System.in.read();
		System.out.printf("code=%d\n",code);
		//one = (char)code;
		//System.out.printf("one=%c\n",one);
		
		// System.in.read(); // 13 ASCII  a 출력 후 남아있던 값
		// System.in.read(); // 10 ASCII   enter 값이 남아있었음  버리겠다,,
		System.in.skip( System.in.available());   // 남아있는 만큼 다 스킵하겠음
		
		//[2]
		System.out.print("한 문자를 입력? ");
		code= System.in.read();
		System.out.printf("code=%d\n",code);
		//one = (char)code;
		//System.out.printf("one=%c\n",one);
		
		
	} //main
	

} //class
