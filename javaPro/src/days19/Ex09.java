package days19;

import java.io.FileReader;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//days19.Ex01.java 파일을 읽어와 알파벳 a~z 대소문자 구분하지 않고 배열에 저장 후
		// 갯수만큼 막대그래프 작성
		
		
		String path = ".\\src\\days19\\Ex01.java";  
		// 상대경로 : ( . ) -->현재 디렉토리 == ~\javaPro 
		//				( .. ) --> 상위 디렉토리 
		
		int [] counts = new int[26];
		// counts[0] = 'A', 'a' 둘 중 하나 저장
		// 대소문자 구분 없이
		try(FileReader fr = new FileReader(path)) {
		int code ;
		char one;
		while ( ( code = fr.read()) != -1) {
			System.out.println(code);
			one = (char) code;
			one = Character.toUpperCase(one);
			// 'A' <= one && one <='Z'
			if(  Character.isUpperCase(one)) {
			counts[one- 'A']++;   // 배열 요소값 증가 .
			// 알파벳이 아닌 문자들은 'A'로 빼고나면 -값 혹은 26보다 더 큰 숫자가 나옴
			}
		}//while
		
		// 막대그래프 그리기
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%c(%d) : %s\n", i+'A', counts[i], "#".repeat(counts[i])); 
		} // for
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // main

}





