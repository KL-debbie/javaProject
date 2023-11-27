package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 12:36:41
 * @subject 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) throws IOException {
		String name = "감나무";
		// 바이트스트림 -> 문자 스트림 변환 -> 라인단위 처리 스트림 변환
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		//Unhandled exception type IOException
		System.out.print("> 이름을 입력하세요 ? ");
		name = br.readLine();
		
		System.out.printf("> 이름 : %s\n", name);
	
		
		
		
	
	} //main
}//class




