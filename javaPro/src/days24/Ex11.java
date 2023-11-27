package days24;

import java.util.ArrayList;

public class Ex11 {
	
	public static void main(String[] args) {
		/*
		// [ 제한된 제네릭 클래스 ]
		// T 모든 타입이 아니라 과일타입만 제한해서 제네릭 클래스 사용
		//
		
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		FruitBox<Apple> box3 = new FruitBox<Apple>();
		FruitBox<Grape> box4 = new FruitBox<Grape>();

		// FruitBox에는 과일만 담겠다.
		// Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> of the type FruitBox<T>
		// FruitBox<Toy> box2 = new FruitBox<Toy>();
		*/
	} // main

}//cls
/*
interface Eatable{  }

class Fruit implements Eatable{
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit{
	public String toString() { return "Apple"; }
}

class Grape extends Fruit{
	public String toString() { return "Grape"; }
}

class Toy{
	public String toString() { return "Toy"; }
}

//상자(Box04)
class Box04<T>{
	
	ArrayList<T> list  = new ArrayList<T>();
	void add(T item) { this.list.add(item); }
	int size() { return this.list.size(); }
	T get(int i) { return this.list.get(i); }
	
	public String toString() { return this.list.toString(); }
}

//과일만을 담을 수 있는 제네릭클래스로 [제한]해서 선언
// 어떻게?

//class FruitBox<T extends Fruit> extends Box04<T>{  //Fruit만 물려받은 것으로 제한

// Fruit 클래스의 자식 클래스 & Eatable 인터페이스도 구현한 타입만 
// & 연결
	class FruitBox<T extends Fruit & Eatable> extends Box04<T>{ 
	//필드
	//재정의
}
*/
