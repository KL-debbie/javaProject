package days13;

/**
 * @author KL
 * @date 2023. 7. 31. - 오후 4:50:14
 * @subject
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {

		//Ex 12 클래스, Time 클래스 패키지 내부(같은 패키지)
		Time t  = new Time();
		t.hour=2;		 // public
		t.minute= 20; // default
		t.second= 59; // protected

		// The field Time.milisecond is not visible
		// 보이지 않는 필드 (원인 : 접근지정자 설정)
		//t.milisecond = 1999;
		
		
		
		/*
		 *  1. 클래스 앞에 붙는 접근지정자 설명
		 *  2. [ 멤버(필드, 메서드, 생성자(constructor)) 앞에 붙는 접근지정자 설명 ]  
		 *  	public		: 패키지 내부,외부 어디서나 접근(참조) 가능
		 *  	default		: 같은 패키지 내부에서만 접근(참조) 가능
		 *  	protected	== default + [상속] ( 패키지 외부라도 상속관계가 있으면 참조 가능)
		 *  	private		: 클래스 내에서만 접근(참조) 가능, 외부 접근 불가!
		 *  
		 *  3. 범위
		 *   public > protected > default > private
		 *   
		 *   (**참고**) 지역변수는 접근지정자를 사용할 수 없다.
		 */
		
		
		
	} // main


}//class
