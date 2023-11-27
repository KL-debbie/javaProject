package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 3:02:57
 * @subject 로또
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 로또 6/45
		// 1~45 정수를 6개 출력.
		// 0.0 <= double Math.random()*45<46.0
		// 0 <= int Math.random()*45+1 <46
		//(int)(Math.random()*45)+1
		
		/*2)
		Random rnd = new Random();
		rnd.nextInt(45)+1
		*/
		
		for (int i = 1; i <=6; i++) {
			int lottoNumber = (int)(Math.random()*45)+1;
			System.out.println(lottoNumber);
			
			//중복제거  09_02 확인
			
		} // for
		
	}//main

}//class
