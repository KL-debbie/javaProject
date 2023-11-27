package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 3:49:18
 * @subject p 79 이름이 있는 break문
 * @content
 */
public class P27_02 {

	public static void main(String[] args) {
		for (int i =1; i<= 10; i++) {
			if(i==5){
				 continue;     // 5를 빼고 계속 수행됨
		
			}
			
			System.out.println("i 는 : " + i);
		}
	}

}