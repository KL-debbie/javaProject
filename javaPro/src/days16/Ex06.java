package days16;

/**
 * @author KL
 * @date 2023. 8. 3. - 오전 11:37:49
 * @subject 				[Singleton pattern]
 * @content
 */
public class Ex06 {
	
	public static void main(String[] args) {
		// [ Singleton pattern ]
		// 1. DBCP(DataBase Connection Pool) DB처리 성능을 높여줌
		// 2. 객체 생성 제한			- 1개 객체 생성(같이 사용)
		//	   첫 번째 객체 생성		- 1개 객체 생성
		//	   두 번째 객체 생성		- 생성 X, 첫 객체 돌려줌
		//	   세 번째 객체 생성
		
		/*
		//The constructor BoardDao() is not visible
		//생성자가 안보여서 객체 생성 못함
		BoardDao dao1 = new BoardDao();
		System.out.println( dao1.hashCode() );
		BoardDao dao2 = new BoardDao();
		System.out.println( dao2.hashCode() );
		BoardDao dao3 = new BoardDao();
		System.out.println( dao3.hashCode() );
		BoardDao dao4 = new BoardDao();
		System.out.println( dao4.hashCode() );
		*/
		
		BoardDao dao1 = BoardDao.getInstance();
		System.out.println( dao1.hashCode() );
		
		BoardDao dao2 = BoardDao.getInstance();
		System.out.println( dao2.hashCode() );
		
		BoardDao dao3 =BoardDao.getInstance();
		System.out.println( dao3.hashCode() );
		
		BoardDao dao4 = BoardDao.getInstance();
		System.out.println( dao4.hashCode() );
		
		//다른 방법으로 객체 생성 --클래스 내부 생성
		
		
		
	} // main

}//class

// 1개 객체만 생성 패턴
// 클래스 내부에서 객체 생성 가능
class BoardDao extends Object{
	
	//생성자
	private BoardDao() {
		
	}
	
	//공유변수, 클래스변수 [필드 - 자기자신 저장 객체]
	private static BoardDao boardDao = null; 
	
	// 메서드 앞에 synchronized 키워드 붙이면 해당 메서드는 [ 스레드 ] 에 안전한 [ 동기화 처리 ] 가 되어진다.
	public synchronized static BoardDao getInstance() {
		
		if (boardDao == null ) {
			boardDao = new BoardDao();
		} //if
		
		return boardDao;
	}
}//BoardDao class
