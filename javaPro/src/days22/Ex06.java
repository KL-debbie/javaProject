package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//// 변환 시험
public class Ex06 {
	
	public static void main(String[] args) {
		// List- ArrayList 컬렉션클래스
		
		//// 변환 시험******
		
		// 1) String [] -> ArrayList 변환
		String [] nameArr = {"송해영", "유희진", "임경재","정하영"};
		
		// 방법 1
		/*
		ArrayList list = new ArrayList();
		for (int i = 0; i < nameArr.length; i++) {
			list.add(nameArr[i]); 
		} // for
		System.out.println(list);
		*/
		
		// 방법 2 Type == 클래스(기본형 int 사용 X)
		// List<T> list=Arrays.asList(T..a);   (int..a)불가
		List list = Arrays.asList(nameArr);   //String  [배열]은 매개변수 가능
		System.out.println(list);
	
		// 방법 3 --> ArrayList안에 담기
		ArrayList list2 = new ArrayList(list);
		System.out.println(list2);   // 매개변수 다형성  ArrayList --> list2 --> 매개변수 collection
		
		// 2) ArrayList -> String [] 변환
		
		
		
		
	} // main

}//cls
