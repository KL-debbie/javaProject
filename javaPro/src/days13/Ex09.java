package days13;

/**
 * @author KL
 * @date 2023. 7. 31. - 오후 2:45:43
 * @subject  클래스의 복사(copy)와 복제(clone)
 * @content
 */
public class Ex09 {
	
	
	public static void main(String[] args) {
		// 클래스 복사( copy )
		
		// 클래스 복제( clone )
		//		ㄴ 얉은 복제
		//		ㄴ 깊은 복제
		
		Point p = new Point();
		// 객체명.필드명
		// 객체명.메서드명
		p.x = 100;
		p.y = 200;
		
		// 클래스복사 - 같은 인스턴스 참조
		//Point pcopy = p; 
		//pcopy.x=1;
		
		
		System.out.println( p.x );   // 1
	
		Point pclone =p;
		pclone.x = p.x;
		pclone.y = p.y;
		
				
		// 클래스 복제 - 인스턴스를 복제(같은 값이지만 다른 인스턴스)
		//??????????????????????
		
		
		
		
	} // main
}//class
