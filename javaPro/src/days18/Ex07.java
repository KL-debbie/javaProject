package days18;

public class Ex07 {
	//	ㄴ예약어
	public static void main(String[] args) {
		
		// [객체로 부터 Class 객체를 얻어오는 3가지 방법]
		// 정보를 갖고 있는 class
		// 1) 첫 번째 방법 : Object.getClass() 메서드
		
		/*
		Card card1 = new Card("HEART",3);
		Class cls = card1.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		*/
	
		// 2) 두 번째 방법 : 모든 클래스명.class -> 클래스 변수가 제공됨
		/*
		Class cls= Card.class;
		//자료형타입					필드
		System.out.println(cls);
		// Class cls 얻어와서 객체 생성
		try {
			Card card2=(Card) cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
		}
		*/
		
		// 3) 세 번째 방법 : class클래스의 static 메서드 - forName()
		// 문자열로부터 가져옴
		String className =  "days18.Card";
		try {
			Class cls= Class.forName(className);  //클래스 객체 돌려줌
		} catch (ClassNotFoundException e) {
			
			
			e.printStackTrace();
		}
		
		
	} // main

}
final class Card{
	String kind; // 카드종류
	String num; //카드번호
	
	Card(){
	//	this.();
	}
	
	Card(String kind,String num){
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}