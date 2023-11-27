package days26;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

public class Ex06 {
	
	public static void main(String[] args) throws IOException {
		// [ File 클래스 ]
		// 1. 가장 많이 사용되는 입출력의 대상 - 파일(중요**)
		// 2. 파일 + 디렉토리(폴더)
		
		// 상대경로로 선언시에만 다름
		 String pathname = ".\\src\\days26\\Ex01.java";
		
		// String pathname = "E:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days26\\Ex01.java";
		// 절대경로로 선언시 결과값이 모두 같음
		
		File file = new File(pathname); 
		//file.isDirectory();
		//file.isFile();
		//file.length();
		//file.exists();
		
		// OS에서 사용하는 경로 구분자
		System.out.println(File.pathSeparator);  	// ;
		// OS에서 사용하는 이름 구분자
		System.out.println(File.separator); 			// \
		
		// 파일이름 반환  Ex01.java
		String fileName= file.getName();
		System.out.println(fileName);
		
		int pos = fileName.indexOf(".");
		// 확장자 .java
		System.out.println(fileName.substring(pos) );
		
		// 확장자 제외 파일명 Ex01
		System.out.println(fileName.substring(0,pos) );
		
		System.out.println(FileUtil.getBaseName(fileName));
		System.out.println(FileUtil.getExtension(fileName));
		
		System.out.println("-".repeat(45));
		
		// 파일의 경로 반환하는 메서드 리턴타입 String
		System.out.println(file.getPath());					// .\src\days26\Ex01.java(상대경로)
		System.out.println(file.getAbsolutePath());		// E:\Class\Workspace\JavaClass\javaPro\.\src\days26\Ex01.java  (절대경로)
		System.out.println(file.getCanonicalPath());	// E:\Class\Workspace\JavaClass\javaPro\src\days26\Ex01.java  (표준경로)
		
		//								파일의 부모 디렉토리 얻어오깅
		System.out.println(file.getParent() ); 		//부모의 경로를 문자열(String)반환
		System.out.println(file.getParentFile() );	// 폴더를 파일(File)이라는 객체로 반환
		
		//com.util.FileUtil.java
		
	} // main
	

}
