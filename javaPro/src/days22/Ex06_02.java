package days22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//// 변환 시험
public class Ex06_02 {
	
	public static void main(String[] args) {
		
		//// 변환 시험******
		// 2) ArrayList -> String [] 변환
		ArrayList list = new ArrayList();
		list.add("신종혁");
		list.add("고경림");
		list.add("이재영");
		
		// 방법 1
		
		String [] nameArr = new String[list.size()];   // ArrayList 요소 갯수
		int index =0;
		Iterator ir=list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			nameArr[index++] = name;
		}
		System.out.println(Arrays.toString(nameArr));
	
		
		// 방법 2 Object[] -> String[] 형변환
		//String arr[] = arrList.toArray(new String[arrListSize]);
		
		String [] nameArr1=(String[]) list.toArray(new String[list.size()]);   //java.lang.ClassCastException
		System.out.println(Arrays.toString(nameArr1));
		
		
	} // main

}//cls
