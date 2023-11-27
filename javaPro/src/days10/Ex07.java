package days10;

import java.util.Random;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 4:31:26
 * @subject   Ex06_04 확인
 * @content  무작위 한문자 코딩
 */
public class Ex07 {
	public static void main(String[] args) {
		//                                          44032	55203
		// System.out.printf("%d\t%d\n",(int)'가',(int)'힣');
		
		Random rnd = new Random();
		
		char one =(char)( rnd.nextInt('힣'-'가'+1)+'가');  // (int)'가',(int)'힣' 사이 정수값
		System.out.println(one);
	} // main

}
