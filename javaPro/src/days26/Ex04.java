package days26;

import java.io.InputStream;
import java.io.PrintStream;

public class Ex04 {
	
	public static void main(String[] args) {
		// PrintStream 클래스
		// 데이터 기반 출력용 바이트스트림
		// 다양한 형태로 출력할 수 있는 메서드가 오버로딩 되어져 있는 스트림 클래스
		
		PrintStream ps=  System.out; //표준 출력 스트림
		InputStream is = System.in;
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");
		
		System.err.println("F"); //스레드가 독립적, 출력하면 출력 위치가 항상 다름
	} // main

}
