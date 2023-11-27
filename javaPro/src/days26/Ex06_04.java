package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex06_04 {
	
	public static void main(String[] args) {
		
		
		//days26일 폴더 안에 있는 모든 파일을 검색
		// -> fileName 문자열을 찾아 fileName을 가진 파일명과 라인번호 출력
		String pathname = ".\\src\\days26";
		String keyword = "fileName";
		
		File parent = new File(pathname);
		File [] list = parent.listFiles();
		File f= null;
		String line = null;
		for (int i = 0; i < list.length; i++) {
			f=list[i];
			int lineNumber =1;
			String fileName =f.getName();
			System.out.printf("---%s----\n",fileName);
			// System.out.println(fileName);
			
			//파일을 열어 모든 라인
			try {
				FileReader in = new FileReader(f);
					BufferedReader br = new BufferedReader(in);
			while ((line = br.readLine() ) != null) {
				
				if ( line.contains(keyword)) {
					line = line.replaceAll(keyword, "["+keyword+"]");
					System.out.printf("%d : %s\n", lineNumber, line);
					
				}
				lineNumber++;
			}
			
			} catch (Exception e) {
			e.printStackTrace();
			}
		} // for
		
		
	} // main

}
