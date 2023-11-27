package days19;

import java.util.Objects;
import java.util.Random;

public class Ex08 {
	
	public static void main(String[] args) {
		
		// Arrays 클래스 		- 배열 사용이 쉽도록 기능 구현
		// [ Objects 클래스 ]	- 객체 다룰 때 사용되는 기능 구현
		Ex08 obj =null;
		
		//	if (obj != null)  ==  if(  !Objects.isNull(obj) )   ==  if(  Objects.nonNull(obj) )
		// Objects.isNull(obj) 		obj라는 객체가 null 일때 true를 반환하는 메서드 :isNull(); 
		// Objects.nonNull(obj)  	obj라는 객체가 null 일 아닐 때 true를 반환하는 메서드 :nonNull(); 
		
		/*
		if (obj == null ) {
			new  ~~ Exception("예외 메시지");
		} //if
		
		this.name = name;
		*/
		// this.name = Objects.requireNonNull(name, "예외 메시지");   //( 문자열, 예외메시지)
		
		//if( a != null && a.equals(b)) {}
		//if( Objects.equals(a,b)){} 
		
		// java.util.Random 클래스
		Random rnd = new Random();
		//	rnd.nextBoolean();  // 랜덤하게 true/false값
		//	rnd.nextInt(bound); // 0 <= 정수 < bound
		//  rnd.nextXXX~~
		
	} // main

}//class
