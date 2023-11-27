package days01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KlEx {
	public static void main(String[] args) throws IOException {
		String name = "감나무";
		byte age = 29;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("> 이름, 나이, 등급 입력 ");
		
		
		name = br.readLine();
		char grade = 'A';
		final double PIE = 3.09;
		System.out.printf("> 이름 : %s, 나이 : %d살\n, 등급 : %c, PIE : %f ", name, age, grade, PIE);
		
		
	}	
		


}
