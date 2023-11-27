package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Writer;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {


	public static void main(String[] args) {
		
		ArrayList<MemberVO> teamList = null;
		
		HashMap<String,ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();  //순차적으로 결과도출
		// HashMap<String,ArrayList<MemberVO>> teamMap = new HashMap<>();

		// 자바 IO(Input Output)
		// FileReader BufferedReader (보조스트림)
		// FileWriter BufferedWriter
		String path = ".\\src\\days19\\1. Java 팀 구성.txt";
	
		String line = null;
		String teamName =null;  //key값
		MemberVO memberVO = null;
		
		try(FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)) {//라인단위 읽기
			
			while ( (line = br.readLine()) != null && ! line.equals("")  ) {
			
//				if (line .equals("") ) break;
			
				teamName = line; //key값(팀이름 1조,2조,3조)
				//System.out.println(line);
				
				line = br.readLine(); // (팀원들이 존재한다고 가정) 팀원이 있는 다음 라인 읽어오기
				
				String [] tnames =line.split("\\s*,\\s*");
				
				teamList = new ArrayList<MemberVO>();
				for (String tName : tnames) {
					
					if( tName.contains("(팀장)")) {
						tName = tName.replace("(팀장)", "");
						memberVO = new MemberVO(tName,"팀장");
					}else {
						memberVO = new MemberVO(tName,"팀원");
						
					} //else
					teamList.add(memberVO);  //value 값
				}//foreach
				teamMap.put(teamName, teamList);
			}		//while
			 
			// 출력
			dispTeamMember( teamMap );
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}//main

	private static void dispTeamMember(HashMap<String, ArrayList<MemberVO>> teamMap) {
		
		Set<Entry<String, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<String, ArrayList<MemberVO>>> ir = eset.iterator();
		
		String teamName = null;// 팀명(1조,2조,3조)
		ArrayList<MemberVO> teamList =null;  //팀 인원수
		int teamCount=0;
		MemberVO teamLeaderVO = null;  //팀장
		String teamLeaderName = null;
		
		//팀명 및 팀장 출력
		while (ir.hasNext()) {
			Entry<String, ArrayList<MemberVO>> entry = ir.next();
			teamName = entry.getKey();// 팀명(1조,2조,3조)
			teamList =entry.getValue();  //팀 인원수
			teamCount = teamList.size();
			teamLeaderVO = teamList.get(0);  //팀장
			teamLeaderName = teamLeaderVO.getName();
			System.out.printf("[%s(%d명) : %s]\n", teamName, teamCount, teamLeaderName);
			
			
			//팀원 출력
			//teamList.subList(1, teamCount)
			Iterator<MemberVO> ir2 = teamList.iterator();
			int no =1;
			if( ir2.hasNext() ) ir2.next(); // 팀장은 읽어와서 버림, 두번째 값부터 읽어오기, 이미 위에 팀장을 읽었으므로
			
			while (ir2.hasNext()) {
				MemberVO memberVO = ir2.next();
				System.out.printf("  [%d] -%s\n",no++, memberVO.getName());
				
			}
		}
	}
} // class

