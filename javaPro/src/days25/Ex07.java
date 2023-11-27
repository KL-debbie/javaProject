package days25;

import java.io.File;
import java.io.FileReader;

public class Ex07 {
	
	public static void main(String[] args) {
		
		
		/*
		String parent= ".\\src\\days25";
		String child = "Ex01.java";
		File f  = new File(parent, child); 
		 */
		String pathname = ".\\src\\days25\\Ex01.java"; //상대경로
		// File 클래스 : 파일, 폴더(디렉토리)를 다루는 클래스
		// 		다루다 ? 생성,이름변경, 삭제, 정보를 얻어옴
		// 파일의 생성시기 최근 수정, 크기...정보
		File file = new File(pathname);
		
		//파일크기
		System.out.println(file.isDirectory()); //false
		System.out.println(file.isFile());  //true
		
		//System.out.println(f.length());//파일크기 단위:byte
		long fileLength = file.length();
		System.out.printf(">파일 크기 : %d(bytes)\n", fileLength);
		
		try(FileReader fr = new FileReader(file)) {
			
			/*
			fr.read();
			fr.read(char [] cbuf);
			fr.read(CharBuffer target);
			fr.read(char[] cbuf, int offset, int length)
			*/
			
			int code;
			
			// 보조스트림(- 라인단위처리 )사용하면 라인번호 앞에 붙일때 더 편해짐
			while ((code =fr.read()) != -1) {
				System.out.printf("%c",(char)code);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

}
