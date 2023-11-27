package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 8. 3. - 오후 4:29:19
 * @subject					[ 다중 catch문 ]
 * @content				14_02 멀티 catch문
 */
public class Ex14 {
	
	public static void main(String[] args) {
		
		int a = 0, b= 0;
		
		InputStream source = System.in;
		Scanner sc = new Scanner(source);
		
		// JVM의 예외처리기에 의해서
		// InputMismatchException 예외 객체 생성 -> 개발자가 파악해서 예외 처리하도록..
		
		try {
			// 예외가 발생할 것 같은 코딩 작성

			System.out.print(">a,b두 정수 입력 ? ");
			a=sc.nextInt();   // 특정지역에서 예외발생시 그 이후 코딩은 실행하지 않고 바로 catch문으로 넘어감
			b=sc.nextInt();
			
			double c =a /b;   // ArithmeticException
		
			System.out.printf("%d / %d = %.2f\n", a, b, c); //c 지역변수 try밖에 있어 인식 못함
			System.out.println("= 정상 종료 =");
			
			
			// 다중 catch 문
			//( 주의사항 ) 부모 예외 클래스를 밑에 코딩한다.
			
			// JDK 1.7~ 멀티 catch 문
		} catch (InputMismatchException e) {
			System.out.println("> [알림] 정수만 입력하세요 ");
			//System.exit(-1); //프로그램 종료
		} catch (ArithmeticException e) {
			System.out.println("> [알림] 0으로 나눌 수 없습니다");
			//System.exit(-1); //프로그램 종료
		}catch (Exception e) {// 위 예외 외의 예외 추적  매개변수 다형성 <예외의 부모객체 Exception 가장 밑에 작성하기, 위에 작성하면 그냥 걸리게됨> 
			e.printStackTrace();  // 예외 추적 출력
			//System.exit(-1);
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
