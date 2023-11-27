package days24;

import java.util.ArrayList;
import java.util.Collections;

public class Ex12 {
	
	public static void main(String[] args) {
		
		// [ 와일드 카드 ]
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		/*
		Juice juice =	Juicer.makeJuice(fruitBox);
		juice =	Juicer.makeJuice(appleBox);
		juice =	Juicer.makeJuice(grapeBox);
		*/
		
		// makeJuice 메서드를 제네릭 메서드로 선언(수정)
		// 호출방법 다름..
		//Juice juice = Juicer.<Apple>makeJuice(appleBox);
		//생략 가능
		Juice juice = Juicer.makeJuice(appleBox);
		
		
		// [제네릭 메서드]
		// 정의 - 메서드의 선언부에 제네릭 타입이 선언된 메서드
		// 형식 
		// public static <T> Juice(리턴타입) makeJuice( fruitBox<T> box){
		// }
		
		
	} // main

}//cls

class Fruit {
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit{
	public String toString() { return "Apple"; }
}

class Grape extends Fruit{
	public String toString() { return "Grape"; }
}


class Box05<T>{
	
	ArrayList<T> list  = new ArrayList<T>();
	void add(T item) { this.list.add(item); }
	int size() { return this.list.size(); }
	T get(int i) { return this.list.get(i); }
	
	public String toString() { return this.list.toString(); }
}

	class FruitBox<T extends Fruit> extends Box05<T>{ 
	//필드
	//재정의
}
	
// 일반 클래스 선언(제네릭클래스X)
// 매개변수를 과일박스를 주면
// 주스를 만들어서 반환하는 기능이 있는 주스 클래스
class Juice{}

// FruitBox<? extends Fruit> box : Fruit을 물려받은 자식들만 가능

// FruitBox<? super Fruit> box : Fruit의 부모들은 모두 가능

// FruitBox<?> box : 제한이 없음, 모든 타입 가능

class Juicer{
// 메서드 오버로딩 조건
// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않음
	
	/*
	//											? == 와일드카드
	static Juice makeJuice(FruitBox<? extends Fruit> box) { //Fruit 의 자식이라면 매개변수로 사용하겠음
		return new Juice();
	}
	*/
	
	//위의 일반 메서드를 제네릭 메서드로 변경 (위 메서드와 동일)
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) { //Fruit 의 자식이라면 매개변수로 사용하겠음
		return new Juice();
	}
	
/*
	static Juice makeJuice(FruitBox<Fruit> box) {
		return new Juice();
	}
	static Juice makeJuice(FruitBox<Apple> box) {
		return new Juice();
	}
	static Juice makeJuice(FruitBox<Grape> box) {
		return new Juice();
	}
 */
}