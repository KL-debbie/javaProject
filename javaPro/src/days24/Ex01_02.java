package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Writer;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Ex01_02 {


	public static void main(String[] args) {
		
		ArrayList<MemberVO> teamList = null;
		HashMap<String,ArrayList<MemberVO>> teamMap = new HashMap<>();

		// 자바 IO(Input Output)
		// FileReader BufferedReader (보조스트림)
		// FileWriter BufferedWriter
		String path = ".\\src\\days19\\1. Java 팀 구성.txt";
		StringBuffer sb = new StringBuffer();
		String content="";
		String line = null;
		
		
		try(FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)) {//라인단위 읽기
			
			while ( (line = br.readLine()) != null ) {
				String team,grade,name;
			
				//System.out.println(line);
				sb.append(line +"\r\n");
				
			 }//while
			content = sb.toString();
			System.out.println(content);
		
			String pattern = 
						"{0}\r\n{1}\r\n"
					+ "{2}\r\n{3}\r\n"
					+ "{4}\r\n{5}\r\n";
			MessageFormat mf = new MessageFormat(pattern);
			Object [] datas = mf.parse(content);
			System.out.println(datas[0]);  //1조
			System.out.println(datas[2]);  //2조
			System.out.println(datas[4]);  //3조
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

		
		
	}//main


} // class

