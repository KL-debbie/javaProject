package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_04 {
	
	public static void main(String[] args) {
		// 파일 복사
		String pathname = ".\\src\\days25\\Ex01.java";
		String copyPathname = ".\\src\\days25\\Ex01_Copy.java";
		
		// >복사 처리 시간 : 41651000(ns)
		////>복사 처리 시간 : 5034400(ns) 버퍼 사용
		fileCopy_textStream02(pathname,copyPathname );
		
		
	} // main

	private static boolean fileCopy_textStream02(String pathname, String copyPathname) {
		
		long start = System.nanoTime();

		final int BUFFER_SIZE = 1024;
		
		try(FileReader fr = new FileReader(pathname);
			 FileWriter fw = new FileWriter(copyPathname, true );
			 	//버퍼기능 + 보조스트림 사용하여 파일 복사
			BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);	
			BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE);
				) {
			
			/* 라인단위로 읽어오기
			String line = null;
			int lineNumber = 1;
			while ( (line = br.readLine()) != null) {
				System.out.printf("%d : %s\n", lineNumber++,line);
				bw.write(line);
			}
			*/
			char [] cbuf = new char[BUFFER_SIZE]; //버퍼
			int readCharNumber =0;  //int 실제 채워넣은 값- 
			while ( (readCharNumber =  br.read(cbuf)) != -1) {  
				bw.write(cbuf,0,readCharNumber);  //쓰기작업 - 0번째부터 실제 채워넣은(읽어온) 값까지만 (뒤에 남은 값은 쓰지않고)
			}
			
			
			System.out.println("파일 복사 완료 ");
			
			
			long end = System.nanoTime();
			System.out.printf(">복사 처리 시간 : %d(ns)\n",(end-start) );
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
