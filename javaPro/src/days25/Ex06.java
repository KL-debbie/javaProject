package days25;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//Properties컬렉션 클래스
		// hashtable<String, String> + load()/store()
		// days23.Ex10;
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger"; 
		
		Properties p = new Properties();
		
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);

		//XML파일 저장
		String fileName = ".\\src\\com\\util\\jdbcproperties.xml";
		String comment="jdbc configuration";
		
		try(  FileOutputStream os = new FileOutputStream(fileName) ) {//출력,,,
			//p.store(writer, comment);
			p.storeToXML(os, comment);
			System.out.println(" Save End. ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // main

}
