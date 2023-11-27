package days16;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Vector;

/**
 * @author KL
 * @date 2023. 8. 3. - 오후 2:05:31
 * @subject
 * @content
 */
public class Ex09 {
	
	public static void main(String[] args) {
		
		// [ 인터페이스의 장점 ]
		// 1. 개발 시간을 단축 시킬 수 있다.
		// 		왜?  인터페이스 작성 + 사용 하는 곳 => 개발진행 가능(인터페이스를 구현한 클래스가 구현되어 있지 않아도)
		// 예) has -a  관계 : Car, Engine 클래스 
		// Car클래스 코딩
		//		ㄴ Engine 클래스 구현 XX
		//		Engine 인터페이스 구현 클래스 - H_Engine, K_Engine
		
		/* 개발시간 단축
		// 인터페이스 매개변수 다형성
		// Engine engine = new K_Engine2();
		Engine engine = new H_Engine();
		Car mycar = new Car(engine);
		
		*
		*/
		// 2. 표준화가 가능
		// 인터페이스 구현 해서 클래스 생성 -> 똑같은 추상메서드 구현을 가지므로 -> 표준화 되어있을것임
		/*
		// 3. 서로 상속관계 관련이 없는 클래스들에게 인터페이스로 관계를 맺어 줄 수 있다.
		// 		상속관계가 아님(부모,자식관계X)	
		//   	왜?
		
		
		// class ArrayList<E> extends AbstractList<E>
        // implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		List list = new ArrayList();
		Vector v;
		//인터페이스가 같으면 담을 수 있다
		 * 
		 */
		
		// 4. 독립적인 프로그래밍 가능
		// 선언+ 구현
		
		
	} //main
	
public void test03(List list) {
	
}

}//class
