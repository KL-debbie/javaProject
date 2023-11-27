package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

import days24.MemberVO;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<MemberVO> teamList = null;
		
		HashMap<TeamVO, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();  //순차적으로 결과도출

		String path = ".\\src\\days19\\1. Java 팀 구성.txt";
	
		String line = null;
		String teamName =null;
		int teamTotalNumber = 0;
		String teamLeaderName =null;
		TeamVO teamVO = null;
		MemberVO memberVO= null;
		
		try(FileReader fr = new FileReader(path);
			 BufferedReader br = new BufferedReader(fr)) {//라인단위 읽기
			
			while ( (line = br.readLine()) != null && ! line.equals("")  ) {
			
				teamName = line;
				line = br.readLine();//팀원정보 
				
				String [] tnames =line.split("\\s*,\\s*");
				teamList = new ArrayList<MemberVO>();
				
				for (String tName : tnames) {
					if( tName.contains("(팀장)")) {
						teamLeaderName = tName = tName.replace("(팀장)", "");
						memberVO = new MemberVO(tName,"팀장");
					}else {
						memberVO = new MemberVO(tName,"팀원");
					} //else
					teamList.add(memberVO);  //value 값
				}//foreach
				teamTotalNumber = teamList.size();
				teamVO = new TeamVO(teamName, teamTotalNumber, teamLeaderName);
				teamMap.put(teamVO, teamList);
			}//while
			 
			//만약 key가 중복  X -> 팀명이 같으면 key 중복이 된다고 처리
			// 같은팀명 X, 팀원없는 경우 예외대신 팀원존재하지 않는 메시지 출력
			teamVO = new TeamVO("1조", 1, "홍길동");
			if (! teamMap.containsKey(teamVO)) {
				
				teamList = null;// 반복자 가져오다가 오류 발생
				teamMap.put(teamVO, teamList);
			} else {
				System.out.println("1조는 teamMap에 사용 중");
			}
			
			//팀명이 같으면 출력 X
			
			// 출력
			dispTeamMember( teamMap );
		
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}//main

	private static void dispTeamMember(HashMap<TeamVO, ArrayList<MemberVO>> teamMap) {
		
		Set<Entry<TeamVO, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<TeamVO, ArrayList<MemberVO>>> ir = eset.iterator();
		
		ArrayList<MemberVO> teamList =null;  //팀 인원수
		TeamVO teamVO = null;
		
		//팀명 및 팀장 출력
		while (ir.hasNext()) {
			Entry<TeamVO, ArrayList<MemberVO>> entry = ir.next();
			teamVO = entry.getKey();// 팀명(1조,2조,3조)
			teamList =entry.getValue();  //팀 인원수
			
			System.out.printf("%s\n", teamVO);// toString 오버라이딩
		
			/*
			if (teamList != null) {
				
				Iterator<MemberVO> ir2 = teamList.iterator();
				int no =1;
				if( ir2.hasNext() ) ir2.next(); // 팀장은 읽어와서 버림, 두번째 값부터 읽어오기, 이미 위에 팀장을 읽었으므로

				while (ir2.hasNext()) {
					MemberVO memberVO = ir2.next();
					System.out.printf("  [%d] - %s\n",no++, memberVO.getName());
				}
			} else {
				System.out.println("팀원이 존재하지 않습니다.");
			}
			*/
			
			try {
				Iterator<MemberVO> ir2 = teamList.iterator();
				int no =1;
				if( ir2.hasNext() ) ir2.next(); 

				while (ir2.hasNext()) {
					MemberVO memberVO = ir2.next();
					System.out.printf("  [%d] - %s\n",no++, memberVO.getName());
				}
			} 
			catch (NullPointerException e) { //null이 나올 상황인지 판단
				System.out.println("팀원이 존재하지 않습니다.");
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		}//while
	}
} // class


