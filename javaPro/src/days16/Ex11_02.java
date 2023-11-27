package days16;

public class Ex11_02 {
	
	public static void main(String[] args) {
		
		// 인터페이스 static 메서드
		// Parseable.method1();
		
		String parsingFile = "hello.xml";
		String docType = "xml";
		
		// 인터페이스 ( 다형성 )  
		Parseable parser =ParserManager.getParser(docType);
		parser.parse(parsingFile);
		
		// 5년 후 파싱 + 인쇄(출력) 기능
		
		
	} // main

}//class

interface Parseable{
	//구문 분석
	void parse(String fileName);
	
	//
	default void print() {
		System.out.println("각각의 parser에서 각자의 인쇄기능 구현");
	};
	
	//static 메서드
	static void method1() {
		System.out.println("기본코딩");
	}
}

class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(">XML 파일 구문 분석 코딩");
		
	}
	
}

class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(">HTML 파일 구문 분석 코딩");
		
	}
	
}

class ParserManager{
	// 			리턴자료형 인터페이스 다형성
	public static Parseable getParser(String docType) {
		if ( docType.equals("xml")) {
			return new XMLParser();
		} else if ( docType.equals("html"));{
			return new HTMLParser();
		} 
		
		
	}
	
}
