package days13;

/**
 * @author KL
 * @date 2023. 7. 31. - 오전 11:20:15
 * @subject
 * @content
 */
public class Ex03 {
	
	public static void main(String[] args) {
		// 1. Tv 클래스 선언 - Tv.java
		// 2. Tv 객체 생성
		Tv tv1 = null;  // Tv- 클래스, tv1- 객체
		tv1= new Tv();  
		//인스턴스화, 객체생성  필드 -color power channel 
		// 필드 생성 후 주소값 참조  => 인스턴스 생성
		// 주소값을 null에 참조
		
		//  클래스 사용 시 NullPointerException 에러 가장 많이 발생 
		// java.lang.NullPointerException
		// 인스턴스가 생성되지 않았음
		
		
		// 			멤버를 가리킬때
		// 객체명.필드명
		// 객체명.메서드명
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
		tv1.channelUp();
		System.out.println("현재 채널 : " + tv1.channel);
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
		System.out.println(" end ");
		
		
		
	} // main

}//class
