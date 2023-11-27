package days26;

import java.io.File;

public class Ex06_06 {

	public static void main(String[] args) {
		
		// days26
		//	ㄴtemp
		//		ㄴtemp_a
		//			ㄴxxx
		//			ㄴyyy
		//		ㄴtemp_b
		
		String pathname = ".\\src\\days26\\temp";
		File dir= new File(pathname);
		
		if (dir.exists()) {
			
			//then the directory must be empty inorder to be deleted. 
			//삭제할때 하위 디렉토리가 없어야 삭제 할 수 있다.
			
			System.out.println( dir.delete() ); //false
			
		} //if
		
		// deleteFolders(dir);
		// deleteAll(dir);
		 directoryDel(dir);
		 
	} // main
	private static void directoryDel(File f) {
		
		// f가 삭제 되지 않았을경우 while문 반복
		while ( f.delete() ) {
			File [] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if ( list[i].delete()) {
					System.out.printf("%s 삭제 완료",  list[i]);
				} else {
					directoryDel( list[i] );
				}
			} // for
		}//while
		
	}
	
	
	/*
	// days26\\temp
	private static void deleteAll(File file) {
	      File[] files = file.listFiles();
	      for (int i = 0; i < files.length; i++) {
	         if(files[i].isDirectory()) {
	            deleteAll(files[i]);         
	         }
	         files[i].delete();
	      } // for
	   }
	*/
	
	/*
	// days26\\temp
	private static void deleteFolders(File dir) {

		File[] childList = dir.listFiles(); // 폴더 또는 파일
		// temp\\temp_a, temp_b
		if (childList != null) {
			for (int i = 0; i < childList.length; i++) {
				File child = childList[i];
				deleteFolders(child);         
				System.out.printf("> %s 를 삭제했습니다.\n", child);
			}
		}
		dir.delete();      
		System.out.printf("> %s 를 삭제했습니다.\n", dir);
	}
	*/
}

	

