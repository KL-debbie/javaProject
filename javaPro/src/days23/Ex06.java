package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex06 {
	
	public static void main(String[] args) {
		/*
		 *  [ Map 인터페이스를 구현한 컬렉션 클래스 ]
		 *  1. key + value 한 쌍으로 관리
		 *  2. [	Entry	  ] = key + value 한 쌍
		 *  3. key 중복 허용 X
		 *  	value 중복 허용 O
		 *  4. HashMap	( 신 )   - 동기화 처리 X
		 *  	HashTable  ( 구 )	 - 동기화 처리 O
		 *  5. HashMap 을 사용하도록 권장.
		 *  6. 해싱(Hashing)?
		 *  	-해시함수(hash function)를 이용해서 데이터를 해시테이블(hash table)에 저장하고 검색하는 기법
		 *  	-해시함수 ? 데이터가 저장되어 있는 곳을 알려주는 함수
		 *  	   ㄴ 데이터를 빠르게 찾을 수 있음.
		 *  	- 데이터를 저장(key+vlaue) 할  key를 해시 함수에 넣으면 함수가 배열의 한 요소를 얻어오고 
		 *  		다시 그 곳에 연결된 리스트에 테이터를 저장하는 방식
		 *  	- 예) 1998.2.1 데이터저장
		 *   	해시함수에 의해 위치 찾고 링크드리스트에 삽입
		 *  	[1900]  [][][][][][] 
		 *  		:
		 *  		:
		 *  	[1998]  [][][][2.1삽입][][]
		 *  	[2000]  [][][][][][]
		 * 
		 */
		
		// 				ID 	name
		//HashMap<String, String> hm = new HashMap<>();  // 권장
		// ㄴ 동기화 처리 X
		
		Hashtable<String, String> hm = new Hashtable<>();
		
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		System.out.println( hm );
		
		hm.put("hong", "홍중복");    // key가 중복될 때 에러발생 XXX, 새로운 value 로 저장

		hm.put("root", "관리자");
		System.out.println( hm );
		System.out.println("-".repeat(47));
		
		// 모든 key값 조회 - keySet()
		Set<String> kSet = hm.keySet();
		Iterator<String>ir =kSet.iterator();
		while (ir.hasNext()) {
			String key =  ir.next();
			System.out.println(key);  //
		}//while
		System.out.println("-".repeat(47));
		
		
		// t/f -> hm.containsKey("hong");
		// t/f -> hm.containsValue("홍중복");
		
		String value = hm.get("root");
		value = hm.getOrDefault("kim", "익명"); // 
		
		hm.replace("root", "관리자", "루트");
		
		
		// 모든 value값 조회 - values()
		Collection<String> vSet = hm.values();
		Iterator<String> ir2 = vSet.iterator();
		while (ir2.hasNext()) {
			 value = ir2.next();
			System.out.println(value);
		}//whi
		System.out.println("-".repeat(47));
		
		// root 키값을 알 때 value 값 무엇인지 조회?
		String key = "admin";
		value = hm.get(key);
		System.out.println(value);
		System.out.println("-".repeat(47));
		
		
		dispHm(hm);
	} // main

	/*  1번
	private static void dispHm(HashMap<String, String> hm) {
		// key : value (출력형식)
		
		Set<String> kSet = hm.keySet();
		Iterator<String>ir =kSet.iterator();
		while (ir.hasNext()) {
			String key =  ir.next();
			String value = hm.get(key);
			System.out.printf("%s : %s\n",key, value);  //
		}//while
		
		private static void dispHm(HashMap<String, String> hm) {
			// key : value (출력형식)
		*/
		
	//private static void dispHm(HashMap<String, String> hm) {
		private static void dispHm(Hashtable<String, String> hm) {
		// key : value (출력형식)
		/*
		 * hong : 홍중복
			root : 관리자
			admin : 관리자
		 */
		Set<Entry<String, String>> eset = hm.entrySet();   // 한쌍을 저장
		Iterator<Entry<String, String>> ir =eset.iterator();
		while (ir.hasNext()) {
			Entry<String,String> entry = ir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("e %s : %s\n",key, value);
		}//whi
		
	}

}//cls
