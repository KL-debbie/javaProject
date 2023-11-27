package days05;

import java.util.Scanner;

public class KlEx03 {
	public static void main(String[] args) {
		// 인덱스 내에 각각 단어 할당하는 법
				
		String name ="감나무꽃나무";
		//String -> char
		
		char [] nameArr = name.toCharArray();
		/*
		char [] nameArr = new char[name.length()];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = name.charAt(i);
			*/
		
		System.out.println(nameArr[0]);
		} //main
	
	} // class


