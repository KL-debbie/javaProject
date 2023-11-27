package days26;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Ex03 {
	
	public static void main(String[] args) throws IOException {
		
		// Sequence [InputStream]
		// 	  순차적 	  입력용 바이트 스트림
		// - 하나의 파일의 용량이 너무 커서 여러 개의 파일로 분리했다고 가정할 때
		//    -> 분리된 파일을 읽어와야 할 때 사용.
		//- 여러 개의 입력스트림을 연속적으로 연결해서 하나의 스트림으로 데이터를 처리 할 수 있는 바이트 스트림.
		
		byte [] a = { 1,2,3 };
		byte [] b = { 4,5,6 };
		byte [] c = { 7,8,9 };
		
		// byte [] -> ByteArrayInputStream  (메모리스트림)
		ByteArrayInputStream bais1= new ByteArrayInputStream(a);
		ByteArrayInputStream bais2= new ByteArrayInputStream(b);
		ByteArrayInputStream bais3= new ByteArrayInputStream(c);
		
		//bais1 ~ 3 바이트스트림을 순차적으로 읽어와 처리
		
		/* 방법 1
		SequenceInputStream sis = new SequenceInputStream(bais1, bais2);
		SequenceInputStream sis2 = new SequenceInputStream(sis	, bais3);
		*/
		
		//enum, 와일드카드
		// 순서가 있는 컬렉션클래스 선언 bais1~3삽입
		//List타입 : ArrayList, Vector
		Vector<ByteArrayInputStream> list = new Vector<>();  //   ArrayList = Enum반환 메서드 없음 
		
		list.add(bais1);
		list.add(bais2);
		list.add(bais3);
		Enumeration<ByteArrayInputStream> en = list.elements();
				
		SequenceInputStream sis = new SequenceInputStream(en);
		
		int code;
		while (  (code=sis.read()) != -1){
			System.out.println(code);
		}
		
	} // main

}
