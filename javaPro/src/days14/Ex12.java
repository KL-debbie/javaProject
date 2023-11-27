package days14;

public class Ex12 {
	
	public static void main(String[] args) {
		
		/*
		 * [ 클래스들 간의 관계 ]
		 * 1. has -a 관계   *****
		 * 		2개의 클래스 선언
		 * 		Car	a	클래스	Engine	b 클래스 - 연료, 구동장치, 
		 *  	Car  has -a  Engine 하나의 클래스가 다른 클래스의 필드 내에 포함..?
		 *  a클래스가 b 클래스를 가짐
		 *  
		 * 2. is -a 관계   ( 상속 관계 )
		 * a 클래스는 b클래스이다
		 */
		Engine engine = new Engine();  
		
		//DI 방법 2가지*****
		// 1) 생성자를 통해 DI  외부에서 객체를 넣어줌
		// Car myCar = new Car(engine);  //의존성 주입(DI)- 결합력이 낮음
		// 2) setter 통해 DI
		Car myCar = new Car();
		myCar.setEngine(engine);
		
		
		myCar.speedUp(100);
		int carSpeed= myCar.getEngine().speed;
		System.out.println(carSpeed);
		
		myCar.speedDown(10);
		carSpeed= myCar.getEngine().speed;
		System.out.println(carSpeed);
		
		myCar.stop();
		carSpeed= myCar.getEngine().speed;
		System.out.println(carSpeed);
		
		System.out.println(" end ");
	} // main

}
