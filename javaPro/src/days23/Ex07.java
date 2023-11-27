package days23;

import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//days20.Ex01.java파일 읽어서
		// HashMap 저장 - key+ value
		//			문자의 갯수 파악
		// ex      'a' -개 막대그래프 그리기
		// 'A'~'Z' 'a'~'z' '가'~'힣' --> 오름차순정렬(key)
		
		String fileName = ".\\src\\days20\\Ex01.java";
		
		int code =-1;
		char one = '\u0000';
		HashMap<Character, Integer> hm = new HashMap<>();
		
		try(FileReader fr = new FileReader(fileName)) {
			
			while ((code= fr.read()) != -1) {
			one = (char) code;	  // 읽을 문자
			//System.out.println(one);
			
			//읽어온 한 문자(key)가 hm에 존재한다면 value값 1증가, 존재하지 않으면 새로 엔트리 추가 코딩
			/*
			if ( hm.containsKey(one)) {
				int value = hm.get(one);
				hm.put(one, value+1);
			} else {
				hm.put(one, 1);
			}
			*/
			
			hm.put(one, hm.getOrDefault(one, 0)+1);  //key값이 존재하면 value값 읽어옴 , 없으면 0값으로 대식

			}//while
			
			//key (value)
			// 'A'(20) #############
			
			Set<Entry<Character, Integer>> eset = hm.entrySet();
			Iterator<Entry<Character, Integer>> ir = eset.iterator();
			while (ir.hasNext()) {
			Entry<Character, Integer> entry =ir.next();
			char key = entry.getKey(); // Character -> char 언박싱
			int value = entry.getValue();// Integer -> int 언박싱
				System.out.printf("'%c' (%d) %s\n", key, value, "#".repeat(value)  );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // main

}//cls
