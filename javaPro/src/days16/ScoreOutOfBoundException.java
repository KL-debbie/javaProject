package days16;

// unchecked 예외
// 0~100이 아니면 사용자가 정의한 예외를 발생시키기 위해 클래스 선언
public class ScoreOutOfBoundException extends RuntimeException{

	
	// 예외 코드 번호 필드
	private final int ERROR_CODE; 

	
	// 상수-> 초기화 한번밖에 안하므로
	public int getERROR_CODE() {
		return ERROR_CODE;
	}


	
	public ScoreOutOfBoundException(String message) {
		this( 1000, message );
	}
	
	
	public ScoreOutOfBoundException(int eRROR_CODE, String message) {
		super(message);
		
		ERROR_CODE = eRROR_CODE;
	}
	
	
}
