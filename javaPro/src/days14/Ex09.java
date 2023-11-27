package days14;

/**
 * @author KL
 * @date 2023. 8. 1. - 오후 3:15:31
 * @subject
 * @content
 */
public class Ex09 {
	
	
	// main() 메서드
	// static 붙인 이유- 자바 실행기에서 객체 생성 안하고도 바로 실행할수 있도록 하기 위해
	public static void main(String[] args) {

		
		//클래스명.static 메서드명()
		//Ex09.sum(1,2);
		
		sum(1,2);
		
		
	} // main
	
	public static int sum(int a, int b) {
		
		return a+b;
	}
}//class
