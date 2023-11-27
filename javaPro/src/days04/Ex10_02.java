package days04;

/**
 * @author KL
 * @date 2023. 7. 18. - 오후 4:23:35
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		// 임의의 수를 발생시키는 class.메서드
		// 0.0*3 < =  double< 1.0 *3
		// 0.0*3 < =  Math.random * 3  < 1.0 *3
		// 0.0    < =  (int) (Math.random * 3)  < 3.0
		// 0      < =  (int) (Math.random * 3) + 1 < 3
		// 1      < =  (int) (Math.random * 3) + 1 < 4
		for (int i = 0; i < 50; i++) {
			int v =(int)( Math.random() * 3) + 1;
			if (v <1 || v>4)
			System.out.println((int) (Math.random() * 3) + 1);   // 내가 원하는 범위 내에서 발생시킴
		} // for
		

	}//main

}//class
