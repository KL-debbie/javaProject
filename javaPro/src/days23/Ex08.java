package days23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
// 풀네임 미리 선언


/**
 * @author kenik
 * @date 2023. 8. 14. - 오후 4:33:39
 * @subject
 * @content
 */
public class Ex08 {

	//  phoneBook 필드
	// static 필드 - 객체생성 X
	// 메모리에 올라가있음 HashMap(key,value) entry형태, 동기화 X 컬렉션클래스타입
	//						key	  value		key-번호	 value-이름		
   static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();

   public static void main(String[] args) { //1. 
      
	   //		그룹명			이름	연락처
      String groupName, name, tel;

      
      addPhoneNo( "친구","이자바","010-1111-1111" );
      addPhoneNo( "친구","김자바","010-2222-2222" );
      addPhoneNo( "친구","김자바","010-3333-3333" );

      addPhoneNo( "회사","이대리","010-4444-4444" );
      addPhoneNo( "회사","김대리","010-5555-5555" );
      addPhoneNo( "회사","박대리","010-6666-6666" );

      addPhoneNo( "동아리","김동아","010-7777-7777" );

      addPhoneNo( null, "세탁소","010-8888-8888" );  // 기타
      addPhoneNo( null, "PC방","010-9999-8888" );    // 기타- 그룹이 정해져잇지않음


      printList();

   } // main

   private static void printList() { 

      Set<Entry<String, HashMap<String, String>>> es   = phoneBook.entrySet();
      Iterator<Entry<String, HashMap<String, String>>> ir = es.iterator();

      while (ir.hasNext()) {
         Entry<String, HashMap<String, String>> entry = 
               (Entry<String, HashMap<String, String>>) ir   .next();

         String groupName = entry.getKey();
         HashMap<String, String> groupMap = entry.getValue();
         System.out.printf("* %s [%d]\n",  groupName, groupMap.size() );

         Iterator<Entry<String, String>>  ir2 = groupMap.entrySet().iterator();
         while (ir2.hasNext()) {
            Entry<String, String> entry2 = (Entry<String, String>) ir2.next();
            String name  = entry2.getKey();
            String tel = entry2.getValue();
            System.out.printf("\t%s : %s\n", name, tel);
         }
      }
   }

                                                                    
   private static void addPhoneNo(String groupName, String name, String tel) {
      
      groupName = (  groupName == null ? "기타" : groupName  );
      
      addGroup(  groupName );  //그룹생성

      HashMap<String, String>  group = phoneBook.get(groupName);//
     
      group.put(tel, name); //동명이인이 있을 수 도 있으므로 번호가 key로,,
   }

   private static void addGroup(String groupName) {

      if (     !phoneBook.containsKey(groupName)   ) { // 해시맵에 그룹네임(친구,회사,동아리,기타) 이 없으면
         phoneBook.put(groupName, new HashMap<String, String>()); // 그룹추가
         				//			key			value
      }

   }

} // class 