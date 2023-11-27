package days24;

public class Ex09 {
	
	public static void main(String[] args) {
		// [ 제네릭스의 제한 ]
		// 
		
		
		
	} // main

}//cls


class Box02<T>{
	/*
	// Cannot make a static reference to the non-static type T
	// 1) 제네릭 클래스에서는 정적필드 선언 불가
	// static T item2; 
	
	// Cannot make a static reference to the non-static type T
	// 2) static 메서드의 매개변수로 T타입 사용 불가
	/*
	static int compare(T t1, T t2) {
		return 0;
	}
	*/

//3) T타입의 배열은 선언 가능
	T [] itemtArr;
}