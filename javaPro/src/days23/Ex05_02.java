package days23;

import java.util.TreeSet;

public class Ex05_02 {
	
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
	      ts.add("abc");      ts.add("alien");      ts.add("bat");
	      ts.add("car");      ts.add("Car");      ts.add("disc");
	      ts.add("dance");      ts.add("dzzz");      ts.add("dzzzz");
	      ts.add("elephant");      ts.add("elevator");      ts.add("fan");
	      ts.add("flower");   
	      
	      System.out.println(ts); // 오름차순 정렬
	      System.out.println(ts.subSet("a", "d")); // a에서 d전까지 단어  [abc, alien, bat, car]
	      System.out.println(ts.subSet("c", "dzzz")); // [car, dance, disc]
	      
	      
	} // main

}//cls
