package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 8. 3. - 오후 4:29:05
 * @subject					[ 멀티 catch문]
 * @content
 */
public class Ex14_02 {
	
	public static void main(String[] args) {
		
		int a = 0, b= 0;
		
		InputStream source = System.in;
		Scanner sc = new Scanner(source);
		
		try {

			System.out.print(">a,b 두 정수 입력 ? ");
			a=sc.nextInt();   // 특정지역에서 예외발생시 그 이후 코딩은 실행하지 않고 바로 catch문으로 넘어감
			b=sc.nextInt();
			
			double c =a /b;   // ArithmeticException
		
			System.out.printf("%d / %d = %.2f\n", a, b, c); //c 지역변수 try밖에 있어 인식 못함
			System.out.println("= 정상 종료 =");
			
			
			// JDK 1.7~ 멀티 catch 문
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println(" [1]\n"+ e.toString());
			System.out.println(" [2]\n"+ e.getMessage());
			
		}catch (Exception e) {
			e.printStackTrace(); 
		
		} finally {
			//예외 발생 유무에 상관없이 처리할 구문 작성
			System.exit(-1);
		}
		
		
		
		
		/*
		// \\s*fish\\s* - 구분자 \\s* 공백이 와도 안와도 좋음
		String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
		*/
		
		
	} // main

}
