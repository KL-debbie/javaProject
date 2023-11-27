package days01;

import days13.Time;

public class Ex07_Timetest {

	public static void main(String[] args) {
		
		
		// days13.Time + days01.Ex07_Timetest
		// 패키지 외부,     내부X
		Time t = new Time();
		t.hour=1;  // public 패키지 내,외부 접근 가능
		// t.second				protected? 패키지 내부 X 또는 상속관계X
		// t.minute  		 	default X
		// t.milisecond  	 	private 참조 X
		 
	} // main
	
}//class
