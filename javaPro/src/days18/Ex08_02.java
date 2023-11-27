package days18;

public class Ex08_02 {
	
	public static void main(String[] args) {
		//암기
		// 프로젝트명까지 디렉토리 
		String dir = System.getProperty("user.dir");
		System.out.println( dir );
		String sep=System.getProperty("file.separator"); // "\\"
		//경로 구분 구문자 찾아와서 처리하기
	
		
		
		String directory = "C:\\temp\\days09";  //경로
		String fileName= "Ex01.java";  // 파일명
		
		//directory.charAt(directory.length()-1) == '\\'
	
		//directory.substring(directory.length()-1).equals("\\")
		String path;
		if (directory.endsWith("\\")) {
			path = directory + fileName ;
		} else {
			path = directory + "\\" + fileName;
		}
		System.out.println(path);
		
		// " C:\\temp\\days09\\Ex01.java "
		
	} // main

}
