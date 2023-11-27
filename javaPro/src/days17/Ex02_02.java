package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author KL
 * @date 2023. 8. 4. - 오후 4:48:55
 * @subject		파일 읽어서 출력 . + try~catch ~ finally 문
 * @content   	//FileReader - 파일을 읽을수 있는 클래스
 * 					한 문자 <- int fr.read() 
 * 					한 라인씩 읽기 BufferedReader
 */
public class Ex02_02 {
	
	public static void main(String[] args) {
		
		String fileName = "C:\\Setup.log";
		FileReader  fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(fileName);		 // checked 예외
			br = new BufferedReader(fr);  // reader의 자식 다형성, 업캐스팅-부모참조
			String line= null;
			int lineNumber =1;
			while ( ( line =  br.readLine() ) != null) {// 파일 끝이 아닐때 까지
				System.out.printf("%d  :%s\n", lineNumber++, line);
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
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			} //if
		}
	} // main
}//class
