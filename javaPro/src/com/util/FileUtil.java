package com.util;

import java.io.File;

public class FileUtil {
	
	 //파일명
	public static String getFileName( File f) {
	      String fileName = f.getName();
	      return fileName;
	   }
	   
	   public static String getFileName( String pathname ) {
	      int idx =  pathname.lastIndexOf("\\");
	      String fileName =     pathname.substring(idx+1);      
	      return fileName; 
	   }

	   //파일명 확장자
	   public static String getExtension(String fileName) {
		      int idx = fileName.lastIndexOf(".");
		      String ext =  fileName.substring(idx);
		      return ext;
		   }
	   
	   //순수한 파일명
	   public static String getBaseName(String fileName) {
		      int idx = fileName.lastIndexOf(".");
		      String baseName =  fileName.substring(0, idx);
		      return baseName;
		   }
	   
}
