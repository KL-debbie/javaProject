package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		// 1) a U b 합집합  1,2,3,4,5,6,7,8
		/*
		ArrayList<Integer> hab = new ArrayList<Integer>();
		hab.addAll(a);
		Iterator<Integer> ir = b.iterator();
		while (ir.hasNext()) {
			Integer i = (Integer) ir.next();
			if ( !a.contains(i) ) {
				hab.add(i);
			} //if
		}//while
		System.out.println(hab);
		*/
		
		//중복허용 X Set계열 사용
		HashSet<Integer> hab = new HashSet<Integer>();
		hab.addAll(a);
		hab.addAll(b);
		System.out.println(hab);
		
		
		// 2) a - b  차집합	1,2,3
		/*
		HashSet<Integer> cha = new HashSet<Integer>(a);    // == cha.addAll(a);
		Iterator<Integer> ir = cha.iterator();
		
		while (ir.hasNext()) {  // iterator =>> 중간 수정 시 수정/삽입 예외발생
			Integer  i= ir.next();  
			// java.util.ConcurrentModificationException
			// if(b.contains(i)) cha.remove(i);
		}
		*/
		
		// 3) a & b 교집합	4,5
		
		HashSet<Integer> cha = new HashSet<Integer>();   
		HashSet<Integer> kyo = new HashSet<Integer>();   
		
		cha.addAll(a);
		cha.removeAll(b);
		
		kyo.addAll(a);
		kyo.removeAll(cha);
		
		/*
		Iterator<Integer> ir = a.iterator();
		
		while (ir.hasNext()) { 
			Integer  i= ir.next();  
			if(!b.contains(i)) cha.add(i);
			else kyo.add(i);
		}
		*/
		
		System.out.println(cha);
		System.out.println(kyo);
		
		
		} // main

}
