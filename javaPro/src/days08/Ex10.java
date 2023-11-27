package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 4:37:09
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 신용카드
		String card = "7655-8988-9234-5677";
		
		String regex= "-";
		String [] cardArr = card.split(regex);
		
		// 0~3 
		int index = (int) (Math.random()*4);
		cardArr[index] = "****";
		
		/*
		String printCard = String.format("%s-%s-%s-%s", cardArr[0], cardArr[1], cardArr[2], cardArr[3] );
		*/
		String printCard = String.join("-", cardArr);   //String.join *****
		System.out.println(printCard);
		
		
		/* 임의의 자리수 *로 변경해서 출력
		7655-****-9234-5677
		7655-8988-9234-****
		****-8988-9234-5677
		7655-8988-****-5677
		 */
		
		
	}//main

}//class
