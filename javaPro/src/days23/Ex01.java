package days23;

import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import days21.Student;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		
		int gameNumber=1;

		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		gameNumber = sc.nextInt();

		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<>();
		// ArrayList lottos // integer 값만 있는 6개의 객체를 가지는 LinkedHashSet 을 담을것임 (요소로 추가)
		
		// LinkedHashSet lotto = null;
		// LinkedHashSet get() X -> 순서가 없는 함수
		// Object -> 각 자료형으로 다운캐스팅 형변환
		
		/*
		for (int i = 0; i < gameNumber; i++) {
			lotto = new LinkedHashSet();
			fillLotto(lotto);
			lottos.add(lotto);
		} // for
		*/
		
		// 로또번호 6개 입력
		LinkedHashSet<Integer> lotto =null; // <Integer>만 넣겠다.., 제네릭 : int 등 기본형 작성 XXX
		int lottoNum = -1;
		for (int i = 0; i < gameNumber; i++) {
			lotto = new LinkedHashSet<>(6); // <> 속 생략 가능 
			while ( lotto.size() <6 ) {
				lottoNum = (int) (Math.random()*45+1);
				lotto.add(lottoNum);
			}//while
			lottos.add(lotto);
		} // for
		
		//정렬기능이 있는 컬렉션에 담기
		ArrayList<Integer> sList = null; //부모가 같음 다른 매개변수 줘도 됨(매개변수 다형성)
		//출력
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator(); 
		int no =1;
		//ir 의 요소--LinkedHashSet<Integer>
		while (ir.hasNext()) { 
			 lotto =  ir.next();  //위에 선언되어있음  lotto LinkedHashSet
			 sList = new ArrayList<Integer>(lotto); // lotto를 ArrayList로 변환(lotto가 set에 담겨있어 정렬 불가능 ->List 계열로 변환하면 정렬 가능하므로 List에 담아줌)
			 Collections.sort(sList);
			 
			 Iterator<Integer> ir2	=sList.iterator();  //lotto 번호  -> ArrayList로 변환했으므로 반복자 출력에 사용 가능
			 System.out.printf("%d게임 : ", no++);
			 while (ir2.hasNext()) {
				 //Integer -> int 오토언박싱
				lottoNum =ir2.next();
				System.out.printf("[%d]", lottoNum);
			}
			 System.out.println();
		}
		
		//정렬 Set계열 순서 x -> 정렬X
		//???/??????
		
		
		/*
		for (int i = 0; i < gameNumber; i++) {
			lotto = (LinkedHashSet) lottos.get(i);
			System.out.printf("[%d게임]", i+1);
			dispLottos(lottos);
		} // for
		*/
		

	}//m

}//c


