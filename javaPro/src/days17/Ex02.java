package days17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author KL
 * @date 2023. 8. 4. - 오후 4:48:55
 * @subject		파일 읽어서 출력 . + try~catch ~ finally 문
 * @content   	//FileReader - 파일을 읽을수 있는 클래스
 * 						한 문자 <- int fr.read() 
 */
public class Ex02 {
	
	public static void main(String[] args) {
		
		String fileName = "C:\\Setup.log";
		FileReader  fr = null;
		try {
			
			fr = new FileReader(fileName);		 // checked 예외 
			/*
			int one = fr.read();
			System.out.println(one);
			int one = fr.read();
			System.out.println(one);
			*/
			int one;
			while (( one =  fr.read()) != -1 ) {// 파일 끝을 만날때까지 돌아라
				System.out.printf("%c", (char)one );
			}
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}	catch (Exception e) {
			
			e.printStackTrace();
		
		}  finally {
			if ( fr != null ) {  //객체가 있다.
				try {
					fr.close();
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			} //if
		}
	} // main
}//class
