package Prac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 17. - 오전 9:01:24
 * @subject
 * @content
 */

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("> 이름을 입력하세요 ?");
		
		String name ;
		
		name = sc.next();
		
		System.out.printf("> 이름은 \"%s\" 입니다.", name);
			

	} //main

} //class
