package days02;

import java.io.BufferedReader;        //패키지명.클래스명 - import 작성 시 패키지명 생략가능
import java.io.IOException;
import java.io.InputStreamReader;  // 빨간 밑줄 시 맨 위에것 클릭 (io- input/output)

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 2:01:00
 * @subject
 * @content
 */

public class Ex10 {

	public static void main(String[] args) throws IOException {
		
		byte age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 나이 입력? ");
		
		// Type mismatch: cannot convert from String to byte
		// age = br.readLine()
		String inputData = br.readLine();
		
		
		// read cannot be resolved or is not a field
		
		age = Byte.parseByte(inputData);
		
		// byte, short, int, long -> %d
		System.out.printf(">나이 : %d", age);
		
	
	
	
	} // main

} // class
