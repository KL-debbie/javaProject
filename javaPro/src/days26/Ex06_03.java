package days26;

import java.io.File;
import java.io.FilenameFilter;

import com.util.FileUtil;

public class Ex06_03 {
	
	public static void main(String[] args) {
		
		//days26 폴더 안 java파일만 조회
		String pathname=".\\src\\days26";
		File dir = new File(pathname);
		
		
		/*방법2
		File [] list = dir.listFiles(new FilenameFilter() {//여과기를 이용해 자바파일만
			
			@Override
			public boolean accept(File dir, String name) {
			//System.out.println(dir +"***" + name);
				return name.endsWith(".dat");
			}
		});
		for (File file : list) {
			System.out.println(file.getName());
		}
		*/
		
		//람다식
		File [] list = dir.listFiles(( d , name)->name.endsWith(".dat"));
		for (File file : list) {
			System.out.println(file.getName());
		}
		
		/* 방법 1
		//String [] = dir.list();
		File [] list= dir.listFiles();
		
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile()){
				String fileName =list[i].getName(); //~~.java
				//System.out.println(fileName.endsWith(".java"));
				if (fileName.endsWith(".java")) {
					System.out.println(fileName);
				} //if
				// FileUtil.getExtension(fileName).equals(".java");
			}//if
		} // for
		*/
		
		
		
	} // main

}
