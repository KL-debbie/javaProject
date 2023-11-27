package days13;

// Tv 클래스 선언
public class Tv {
	 
	 /*
	 // 중첩클래스 - private, protected 사용 가능
	 class box{
		 
	 }
	 */
	 
// Illegal modifier for the class Tv; only public, abstract & final are permitted
// 잘못된 수정자 public, abstract & final 만 허가
	//private class Tv { 
	
	// 멤버(클래스 내 모든 구성요소)
	
	// 멤버변수(필드)- 클래스 내의 변수
	// 초기화 하지 않으면 각 자료형의 기본값으로 초기화되어져 있음
	// 선언 형식 : [접근지정자] [기타제어자] 자료형 필드명[=초기화];
	
	/*
	public String color = null;  
	public boolean power= false;
	public int channel=0;
	*/
	
	public String color ;  
	public boolean power ;
	public int channel;
	
	// 멤버함수(메서드)
	public void power() {
		power= !power;
	}
	// △
	public void channelUp() {
		channel++;
	}
	//▽
	public void channelDown() {
		channel--;
	}

}
