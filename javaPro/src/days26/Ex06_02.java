package days26;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex06_02 {
	
	public static void main(String[] args) {
		// javaPro 밑 모든 하위폴더, 파일 목록 정보 조회
		
		String currentDirectory = System.getProperty("user.dir");
		// E:\Class\Workspace\JavaClass\javaPro
		System.out.println(currentDirectory);
		
		File parent = new File(currentDirectory);
		// System.out.println(parent.isDirectory());  //true
		
		/*
		String [] list = parent.list(); //문자열
		// File [] list=parent.listFiles(); //파일배열
		
		for (int i = 0; i < list.length; i++) {
			//System.out.println(list[i]);  //목록
			
			//파일객체 생성
			File f = new File(parent, list[i]);
			System.out.printf("%s\t%s\t%d\n",f.isDirectory()?"[폴더]":"파일", f.getName(),f.length());
		} // for
		*/
		
		// long -> LocalDateTIme -> DateTimeFomatter,,
		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat();
		File [] list=parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			
			//long date =list[i].lastModified(); //파일 수정 날짜
			Date date = new Date(list[i].lastModified());
			String 수정날짜 = sdf.format(date);
			
			
			System.out.printf("%s\t%s\t%d\t%s\n",list[i].isDirectory()?"[폴더]":"파일", list[i].getName(),list[i].length(),수정날짜);
		} // for
		
		
	} // main

}
