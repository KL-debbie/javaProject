package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 2:12:51
 * @subject
 * @content
 */
public class P23_01 {

	
	public static void main(String[] args) {
		
		//
		
		int dan =2;
		while(dan <=9) {
			
			System.out.println("==" + dan + " 단 ==");
			int i = 1;
			while(i<= 9) {
				System.out.println(dan + "X" + i + "=" + (dan*1));
				i++;
			}
		
			dan++;
			System.out.println("---------");
		}
		
		
		
	}//main
}//class
