package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_05 {
	
	public static void main(String[] args) {
		// 실행파일 복사- 바이트 스트림 사용
		// FileInputStream
		// FileOutputStream
		// BufferedInputStream
		// BufferedOutputStream
		
		// 파일 복사
		String pathname = "C:\\Program Files\\Java\\jdk-11.exe";
		String copyPathname = "C:\\Users\\user\\Documents.exe";
		
		// >복사 처리 시간 : 41651000(ns)
		//>복사 처리 시간 : 5034400(ns) 버퍼 사용
		//fileCopy_byteStream(pathname,copyPathname );
		fileCopy_byteStream02(pathname,copyPathname );
		
		
	} // main

	private static boolean fileCopy_byteStream02(String pathname, String copyPathname) {
		
		long start = System.nanoTime();
		
		final int BUFFER_SIZE= 1024;

		try(FileInputStream fis = new FileInputStream(pathname);
			 FileOutputStream fos = new FileOutputStream(copyPathname, true );
				// 버퍼 기능이 있는 보조 스트림 선언 및 생성
				BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
				) {
			
			byte [] b = new byte[BUFFER_SIZE];
			
			int readByteNumber=0;
			while ((readByteNumber=  bis.read(b)) != -1) {
				bos.write(b, 0, readByteNumber);
				
			}
			bos.flush();
			
			System.out.println("파일 복사 완료 ");
			
			
			long end = System.nanoTime();
			System.out.printf(">복사 처리 시간 : %d(ns)\n",(end-start) );
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}



	
	private static boolean fileCopy_byteStream(String pathname, String copyPathname) {
		
		long start = System.nanoTime();

		try(FileInputStream fis = new FileInputStream(pathname);
			 FileOutputStream fos = new FileOutputStream(copyPathname, true );
			
				) {
			
			int b;
			while (  ( b = fis.read() ) !=-1) {
				fos.write(b);
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
