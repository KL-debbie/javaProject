package days14;

public class Car {
	
	//필드
	String name;
	String gearType; //수동자동
	int door;
	// 엔진 필요
	//Engine engine=new Engine(); // 1)명시적 초기화
	// 결합력이 높은 코딩 -> 나쁜 코딩
	private Engine engine=null;	// class로 기본값 null
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	{
		// 2) 인스턴스 초기화 블럭 생성자가 중복되어 있을때
		// this.engine = new Engine();
	}
	
	
	//생성자
	Car(){
		this.engine = new Engine(); //3) 생성자 초기화
	}
	
	public Car(Engine engine) {
	this.engine = engine;
	}

	//메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);  // engine 이 null
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);	
	}
	void stop() {
		this.engine.stop();
	}


}
