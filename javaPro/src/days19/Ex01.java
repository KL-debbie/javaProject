package days19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;


/**
 * @author KL
 * @date 2023. 8. 8. - 오전 10:16:15
 * @subject 복습 4번
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		String key = "user.dir";
		String userDir = System.getProperty(key);
		// System.out.println(userDir);
		// E:\Class\Workspace\JavaClass\javaPro
		
		String fileName = "1. Java 팀 구성.txt";
		String path = String.format("%s\\src\\days19\\%s", userDir, fileName);  // 전체경로
		System.out.println(path);
		// E:\Class\Workspace\JavaClass\javaPro\src\days19\1. Java 팀 구성  => 전체경로
		
		String line = null;
		try(FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)
						) {
			while ( ( line = br.readLine()) != null) {
				if (line.equals("2조")) {
					line= br.readLine();  // 2조를 만나면 다음 라인불러오기
					System.out.println(line);
					break; // 2조 만나면 나오기
				} //if
			}//while
			// line = "2조 팀원 이름 나열되어있음"
			
			String regex = "\\s*,\\s*";   // 공백없이 이름으로만 나열
			String [] teamMembers = line.split(regex);
			String teamLeader =null;
			// 팀장 제외한 배열 선언
			String [] teamMember2 = new String[teamMembers.length-1];
			for (int i = 0, index =0 ; i < teamMembers.length; i++) {
				if ( teamMembers[i].contains("(팀장)")) { // 팀멤버에 (팀장)이 포함
					teamLeader = teamMembers[i].replace("(팀장)", "");  // 팀리더는 팀멤버가 됨, (팀장) => 빈문자열로 표시
					continue;
					//break;// 팀장 찾았으므로
				} //if
				
				//나머지 사람들 배열에 담아 내림차순으로 출력, 팀장은 항상 맨앞에 두고 나머지만 내림차순
				//팀원 -> 배열에 넣기
				teamMember2 [index++] = teamMembers[i];
			} // for
			System.out.println("teamLeader : " + teamLeader);  // 팀장 찾아냄

			System.out.println(Arrays.toString(teamMember2));
			//	Arrays.sort(teamMember2, Collections.reverseOrder());
			Arrays.sort(teamMember2,(n1,n2) -> n2.compareTo(n1));
			System.out.println(Arrays.toString(teamMember2));
			
			/*
			 * <ul>
				<li class="leader">임경재</li>
				<li>이지현</li>
				<li>유희진</li>
				<li>박민석</li>
				<li>김호영</li>
				<li>김정주</li>
				<li>고경림</li>
		</ul>
			 */
			
			/*
			String output = "<ul>";
			output += String.format("\r\n\t<li class=\"leader\">%s</li>", teamLeader);
		
			output += "\r\n\t<li>"+ String.join("</li>\r\n\t<li>", teamMember2) + "</li>"; // 개행 후 앞 빈칸 만들기
			output += "\r\n<ul>";
			System.out.println(output);
			*/
			StringBuilder sb = new StringBuilder();
			sb.append("<ul>");
			sb.append(String.format("\r\n\t<li class=\"leader\">%s</li>", teamLeader));
			sb.append("\r\n\t<li>"+ String.join("</li>\r\n\t<li>", teamMember2) + "</li>");
			sb.append("\r\n<ul>");
			
			System.out.println(sb.toString());
			
			/*
			StringJoiner sj = new StringJoiner("</li>\r\n\t<li>", "\t<li>", "</li>");
			sj.add(teamLeader);
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		
		
}

