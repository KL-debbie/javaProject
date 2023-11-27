package days26;

import java.io.File;

public class Ex06_05 {
	
	public static void main(String[] args) {
		
		//days26폴더 안에 upload폴더 유무 확인 후 없으면 폴더 생성
		String pathname = ".\\src\\days26";
		File dir = new File(pathname, "upload");
		
			//1. boolean createNewFile(); : 없으면 파일 새로 생성
			//									  이미 생성할 파일이 존재하면 fale
			
			//2. File creatTempFile("work",".tmp")  : 임시파일 생성
			// 		c:\\windows\\TEMP 파일생성
			
			//3. boolean delete() : 파일삭제
			//3-2. deleteOnExit() : 응용 프로그램이 종료할 때 파일 삭제
			//											( 임시파일 삭제 )
			
			//4. boolean renameTo(File) : 파일명을 변경하는 메서드
			//5. boolean mkdir() : make directory 폴더 생성 
			//5-2. boolean mkdirs() : make directories 폴더들 생성

		// days26\\temp\\upload - 부모폴더가 없으면 먼저 생성하고 파일 만듦
		if ( ! dir.exists() ) {
			//dir.mkdir();
			System.out.println( dir.mkdir());//true
			
		}else
			dir.delete();
		
		
		
	} // main

}
