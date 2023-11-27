package days24;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// 중첩 인터페이스
		Button btnTouch = new Button();
		//btnTouch.setOnClickListener( new CallListener() );
		btnTouch.touch();
		
		//btnTouch.setOnClickListener(new MessageListener());
		
	} // main

}//cls
class Button{
	
	// 필드
	OnClickListener listener ;
	// 생성자, setter 의존성 주입( DI ) - 결합력이 낮은 코딩
	void setOnClickListener(	OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		this.listener.onClick();
	}
	
	//중첩 인터페이스 - 다른 클래스에서는 사용할 일이 없어 클래스 내에 선언
	interface OnClickListener{ //이벤트 처리
		//상수 , 추상메서드
			void onClick(); // 추상메서드
	}
	
		
	class CallListener implements Button.OnClickListener{
		
		@Override
		public void onClick() {
			System.out.println("전화 걸기");
		}
	}
	
		class MessageCallListener implements Button.OnClickListener{
			
			@Override
			public void onClick() {
				System.out.println("메시지 보내기");
				
			}
		}
}
