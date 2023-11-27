package days06;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 20. - 오후 12:06:47
 * @subject 제어문 활용
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		int n;
		
		try(Scanner scanner = new Scanner(System.in)) {
			// 문자 표현, 실수 x, 정수 o
			System.out.print("> 정수 (n) 입력 ? ");
			String inputData = scanner.nextLine();  // 다 문자열로 받음
			char [] idArr = inputData.toCharArray();
			
			boolean flag = false; // 숫자가 아닌게 있으면 true 바꾸기, 잘못입력
			
			for (int i = 0; i < idArr.length; i++) {
				if( ! ('0'<= idArr[i] && idArr[i] <='9') ){
					// if('0'> idArr[i] || idArr[i] >9'){
				flag=true;
				break;
				}
			} // for
			//if(flag==true) {
				if( !flag ) {    //true false 값을 다 가지고 있어 붙이지 않아도 됨    =>  false의미함
					n = Integer.parseInt(inputData);
					System.out.println( n );
				
			}else{
				System.out.println("잘못입력");
			}
			// n=scanner.nextInt();
	
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}//main

}//class
