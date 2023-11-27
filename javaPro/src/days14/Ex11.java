package days14;

/**
 * @author KL
 * @date 2023. 8. 1. - 오후 4:12:56
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document();
		Document doc4 = new Document();
		Document doc5 = new Document();

	}//main

}//class

//문서
class Document{
	String fileName;
	static int count =1;
	
	// 인스턴스 초기화 블럭
	{
	count++;	
	System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	
	public Document() {
		//Cannot refer to an instance field count while explicitly invoking a constructor
		//명시적 호출에서  인스턴스 필드 카운트 참조 할 수 없음
		
		this(String.format("Noname%d.txt", count));	
	
	//Constructor call must be the first statement in a constructor
	// 생성자 안에서 첫번째 라인에서 호출
		
	}
	
	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", fileName);
		
	}
	
}
