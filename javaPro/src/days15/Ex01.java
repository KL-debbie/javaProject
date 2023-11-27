package days15;

import java.util.Arrays;

import days14.Point;

public class Ex01 {
	
	public static void main(String[] args) {

		
		  String n = "keNik";   
		  String m= "kKnie";  
		  
		  char [] nArr = n.toUpperCase().toCharArray();
		  char [] mArr = m.toUpperCase().toCharArray();
		  Arrays.sort(nArr);
		  Arrays.sort(mArr);
		 m=  String.valueOf(mArr );
		 n=  String.valueOf( nArr);
		 System.out.println( n.equals(m) );
		  
		  /*
		  System.out.println(n + " / " + m);
		  
		  n= n.toUpperCase();
		  m= m.toUpperCase();
		  System.out.println(n + " / " + m);
		  
		  //정렬 문자열 정렬 X
		  char [] nArr = n.toCharArray();
		  Arrays.sort(nArr);
		  System.out.println(Arrays.toString(nArr));
		  
		  char [] mArr = n.toCharArray();
		  Arrays.sort(mArr);
		  System.out.println(Arrays.toString(mArr));
		  
		  //char [] -> String n,m
		  n=String.valueOf(nArr);
		  m=String.valueOf(mArr);
		  
		  System.out.println(n + " / " + m);
			*/
		  
	} // main

}
