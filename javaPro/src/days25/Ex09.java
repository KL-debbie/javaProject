package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex09 {
	
	public static void main(String[] args) throws IOException {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1. 키보드(표준입력장치)로 부터 입력 받아옴 -> 표준 입력 스트림
		// InputStream is = System.in : 표준입력 스트림(바이트 스트림)
		
		InputStream is = System.in;  //바이트스트림이므로 한글 처리x
		System.out.print("한글 한문자 입력");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr); // 라인 전체를 읽어오기
		int code= isr.read();
		System.out.println((char)code);
		/*
		int code;
		System.out.print("name input");
		code= is.read(); //1바이트(0~255정수 int) 반환하는 메서드
		System.out.println((char)code); //"홍"?
		*/
		
		/*
		byte [] cbuf= new byte[3];
		System.out.print("name input");
		is.read(cbuf);
		// byte [] cbuf -> char one으로 변환
		*/
		
		// InputStream[Reader] 보조 문자스트림
		// byte -> char 문자로 변환해주는 보조스트림
		
		// Buffered[Reader] br 에 보조스트림을 매개변수로..
		// 라인단위 스트림
		
		
		
	} // main

}//c	

