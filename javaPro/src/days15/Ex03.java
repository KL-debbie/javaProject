package days15;

import days13.Tv;

/**
 * @author KL
 * @date 2023. 8. 2. - 오전 11:32:50
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
	
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 11;
		ctv.channelDown();
		System.out.println( ctv.channel );
		ctv.dispCaption( "Hello World" );   //자막이 켜지지 않은 상태
		ctv.caption = true; // 자막 on
		ctv.dispCaption( "Hi" );
		
		
		
	}//main

}//class

// 자막 Tv = 자막 + 기존 Tv클래스 상속받아
class CaptionTv extends Tv{
	boolean caption;  // 자막 기능 on(true) / off(false)
	
	void dispCaption(String text) {
		if (this.caption) {
			System.out.println(text);
		} //if
	}
	
}
