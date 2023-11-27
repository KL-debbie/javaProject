package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KlEx_3 {
	
	public static void main(String[] args) throws IOException {
		
		byte age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이입력");
		
		String data = br.readLine();
		age= Byte.parseByte(data);
		
		System.out.printf(">나이 %d",age);
	} //main

} // class
