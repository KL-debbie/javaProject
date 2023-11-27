package days12;

/**
 * @author KL
 * @date 2023. 7. 28. - 오후 2:42:25
 * @subject                가변배열 - 행마다 길이가 다름 열만 셋팅을 안할수있음
 * 								
 * @content
 */
public class Ex05_02 {
	public static void main(String[] args) {
		String [][] names = new String [3][];   
		names[0] = new String[25];
		names[1] = new String[20];
		names[2] = new String[30];
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print("[]");
			} // for
			System.out.println();
		} // for
		
		
	} // main

}//class
