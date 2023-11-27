package days25;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import days25.Ex03.Direction;

public class Ex08_02 {
	
	public static void main(String[] args) throws IOException {

		//-String		StringReader/StringWriter - 문자다루는 메모리 스트림
		
		String source ="package days25;\r\n"
				+ "\r\n"
				+ "public class Ex03 {\r\n"
				+ "	//						  0			 1			 2			 3			순서\r\n"
				+ "	// enum Direction {EAST, SOUTH, WEST, NORTH}\r\n"
				+ "	\r\n"
				+ "	//							문법 에러 \r\n"
				+ "	//enum Direction {EAST=100, SOUTH=200, WEST, NORTH}\r\n"
				+ "	\r\n"
				+ "	// The constructor Ex03.Direction(int) is undefined\r\n"
				+ "	// 						생성자(1) X....?\r\n"
				+ "	// 왜 생성자를 찾나...\r\n"
				+ "	\r\n"
				+ "	//enum Direction {EAST(100), SOUTH(200), WEST(300), NORTH(400)}\r\n"
				+ "	enum Direction {\r\n"
				+ "		EAST(100,\"▶\"), SOUTH(200,\"▼\"), WEST(300,\"◀\"), NORTH(400,\"▲\");\r\n"
				+ "		\r\n"
				+ "		private final int value;\r\n"
				+ "		private final String symbol;\r\n"
				+ "		\r\n"
				+ "		/*\r\n"
				+ "		Direction(int value) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol = \"\";\r\n"
				+ "		}\r\n"
				+ "		*/\r\n"
				+ "\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "			this.value= value;\r\n"
				+ "			this.symbol = symbol;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return value;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return symbol;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		// 추상메서드 선언 가능\r\n"
				+ "		// abstract int test(int i);\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		\r\n"
				+ "		//[ 열거형에 멤버(필드,메서드, 생성자) 추가하기 ]\r\n"
				+ "		\r\n"
				+ "		//[ 열거형 구조 이해 ]\r\n"
				+ "		/*\r\n"
				+ "		 * 1. 열거형 enum Direction {EAST, SOUTH, WEST, NORTH}\r\n"
				+ "		 * 2. 컴파일러가 클래스 변환\r\n"
				+ "		 * 		class Direction extends Enum{\r\n"
				+ "		 * 			static final Direction EAST = new Direction( \"EAST\");\r\n"
				+ "		 * 			static final Direction EAST = new Direction( \"SOUTH\");\r\n"
				+ "		 * 			static final Direction EAST = new Direction( \"WEST\");\r\n"
				+ "		 * 			static final Direction EAST = new Direction( \"NORTH\");\r\n"
				+ "		 * \r\n"
				+ "		 * 			private String name;\r\n"
				+ "		 * 			public String name(){\r\n"
				+ "		 * 				return this.name;\r\n"
				+ "		 * 			}\r\n"
				+ "		 * 			private int ordinal\r\n"
				+ "		 * 			public int ordinal(){\r\n"
				+ "		 * 				return this.ordinal;\r\n"
				+ "		 * 			}\r\n"
				+ "		 * 			private Direction(String name){\r\n"
				+ "		 * 				this.name = name;\r\n"
				+ "		 * 			} \r\n"
				+ "		 * 		\r\n"
				+ "		 * 		}\r\n"
				+ "		 */\r\n"
				+ "		\r\n"
				+ "		// 열거형은 ordinal() 메서드에 의해 열거형 상수를 사용하는데\r\n"
				+ "		// 			 상수값은 0,1,2,3 순서를 반환\r\n"
				+ "		// 내가 원하는 정수 값을 설정하여 사용 할 수 있음\r\n"
				+ "		Direction [] dirArr=Direction.values();\r\n"
				+ "		for (Direction dir : dirArr) {\r\n"
				+ "			System.out.println(dir.name() + \"/\" + dir.ordinal() + \"/\" + dir.getSymbol() + \"/\" + dir.getValue());\r\n"
				+ "			\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "";

		//[문제] source 문자열에서 [22번째 라인의] 문자열을 String line21 변수에 저장 후 출력 코딩
		
		/*2)
		//source -> XXXReader 문자스트림 ->보조스트림
		StringReader sr = new StringReader(source);
		BufferedReader br = new BufferedReader(sr);
		// br.skip(21);// 문자 스킵
		
		String line22 =null;
		int i = 1;
		while (i++<=21) br.readLine();
		line22 = br.readLine();
		System.out.println( line22 );
		*/

		//3)
		String line22 =Stream.of(source.split("\r\n")).skip(21).findFirst().get();
		System.out.println(line22);
	} // main

}
