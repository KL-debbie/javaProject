package days24;

public class Ex13 {
	
	public static void main(String[] args) {
		// [원시타입(raw type)과 제네릭 타입 간의 형변환]
		// - 경고만 발생 시키고 자동으로 사용 가능
		// -  <T> 없으면 Object 타입으로 컴파일 됨.
		Box05<String> box1 = new Box05<>();
		Box05 box2 = new Box05();
		//Box05<Object> box2 = new Box05<>();
		
		
		
	} // main

}
