package days21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex14_02 {
	
	public static void main(String[] args) {
		
//		1조
//		이경서, 신종혁(팀장), 이재영, 송해영 , 신기범, 이준희, 김성준 
//		2조
//		박민석(팀장), 유희진, 고경림, 임경재, 이지현 , 김정주, 김호영
//		3조
//		박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민

		ArrayList team1 = new ArrayList(10);
		// System.out.println(team1.size());   // 요소의 갯수 O, 용량 X
		
		String t1 ="이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준";
		t1= t1.replaceAll("\\(팀장\\)","");   // [이경서, 신종혁, 이재영, 송해영, 신기범, 이준희, 김성준]
		
		// t1= t1.replaceAll("(팀장)","");  
		//[이경서(), 신종혁, 이재영, 송해영, 신기범, 이준희, 김성준]   문자열의 ()가 아닌 정규표현식()으로 인식되어 지워지지않음
		// 문자열()라고 표시해줘야 replace 가능 -escape 를 작성하여 문자열임을 표시
		
		// t1= t1.replace("(팀장)","");  // 문자열 () 자체를 찾아서 replace 
		
		String [] t1Arr = t1.split("\\s*,\\s*");
		for (int i = 0; i < t1Arr.length; i++) {
			team1.add(t1Arr[i]);
			
			} // for
		// System.out.println(team1);
		
		ArrayList team2 = new ArrayList(10);
		team2.add( "박민석");
		team2.add( "유희진");
		team2.add( "고경림");
		
		ArrayList team3 = new ArrayList(10);
		team3.add( "박정호");
		team3.add( "이상문");
		team3.add( "이주영");
		
		ArrayList class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		
		System.out.println(class5);
		 
		Iterator ir = class5.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			//System.out.println(name);
		}
		// 1조팀원이 다 들어가있는지 확인	
		System.out.println(class5.containsAll(team1));  // true
		
		
		
		// 원본은 유지 - 복제본을 생성하여 수정,삭제,추가---
		ArrayList<String> class5Clone= (ArrayList) class5.clone();  //다운캐스팅
		class5Clone.removeAll(team1);
		// System.out.println(class5);
		
		//2조+3조만 남아있음
		System.out.println(class5Clone);
		// 이름순 오름차순 정렬
		// class5Clone.sort(comparator); 정렬할 때 기준이되는 comparator 비교기  class생성
		
			/*					// 무명(익명) 클래스
		class5Clone.sort( new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		*/
		// == 위의 코딩이랑 동일
		class5Clone.sort((o1,o2)-> o1.compareTo(o2));
		System.out.println(class5Clone);
		
	} // main
	
}//cls
