package days24;

public class Ex08 {
	
	public static void main(String[] args) {
		// [ 제네릭 클래스 ]
		// 타입
		// 1) 제네릭 클래스
		// 2) 제네릭 메서드
		
		/*
		 Box box1 = new Box();
		//box1.setItem(100);
		//box1.setItem("홍길동");
		//box1.setItem(3.14);
		
		// Object  선언시 모든 데이터를 담을 수 있지만 자료형마다 다운캐스팅이 필요(형변환)--단점,,,
		System.out.println((int)box1.getItem());
		System.out.println((String) box1.getItem());
		System.out.println(box1.getItem());
		*/
		
		//			String 대입된 타입
		// Box<String> box = new Box<>();
		
		// 자동으로 호환
		Box box = new Box();
		
		
		
	} // main

}//cls

// 다양한 타입을 사용하기 위해 컴파일 시에 타입을 결정하는 기능 : 제네릭
// 제네릭 클래스 선언
//<Type>   T 위치에는 아무 문자나 사용 가능
// Type이 모든 곳에 적용되도록
// 용어정리
// 1) Box(클래스명) - 원시타입(raw type)
// 2) <T> - 타입 변수, 타입 매개변수
// 3) Box<T> -  제네릭 클래스,  'T[의] Box'

class Box<T>{//제네릭 클래스
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}


/*
class Box{
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}
*/
/*
class Box{
	int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
}
*/

/*
class Box{
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
}
*/
/*
class Box{
	double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
}
*/