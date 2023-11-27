package days19;

import java.util.Arrays;

/**
 * @author KL
 * @date 2023. 8. 8. - 오전 11:00:42
 * @subject 복습 5번
 * @content   //https://school.programmers.co.kr/learn/courses/30/lessons/120913
 */
public class Ex02 {
	
	public static void main(String[] args) {
	
		String my_str = "abc1Addfggg4556b";
		int n =6;
		
		String [] answer = Solution.solution(my_str, n);
		
		System.out.println(Arrays.toString(answer));
		
		
		/*
		 * String my_str = "abcdef123"
		 * int n =3;
		 */
		
	} // main

}
class Solution {
    public static String[] solution(String my_str, int n) {
        int answerLength =(int) Math.ceil( (double) my_str.length() / n ); // 2. xxx=> 올림 해버리기
        // ceil - 리턴타입이 double 3.0을 돌려줌
    	
    	String[] answer = new String[answerLength];
    	
        /*
        String a = my_str.substring(0, 6);  //6개 문자열이
        System.out.println(a);
        
        a = my_str.substring(6,12);  //6개 문자열이
        System.out.println(a);
        
        a = my_str.substring(12, 16);  //6개 문자열이
        System.out.println(a);
        */
        
    	//위 코딩 반복문 조건 ---> - while 문
    	int beginIndex =0 , endIndex;
    	String str = null; //
    	int my_srtLength = my_str.length(); 
    	int index =0;
    	while (index != answerLength) { // 배열크기가 같아지는 순간 ==> 다 채운것이므로 빠져나옴, 같지 않을때까지
    		endIndex = beginIndex +n; // 문자열 길이보다 커지며X
    		if (endIndex > my_srtLength)  endIndex =  my_srtLength; //문자열 길이까지만 ,,,,
			str = my_str.substring(beginIndex, endIndex);
			beginIndex = endIndex;  // 0,6이 반복되지 않게..
			answer[index++] = str;
		}//while
    	    	
    	/*
    	int i = 0, idx = 0;
    	try {
    	   for (             ; i < my_strLength ; i+=n, idx++) {
    	       answer[idx] =   my_str.substring(i, i+n );
    	     } 
    	} catch (Exception e) {
    	   answer[idx] =   my_str.substring(i);
    	}
    	*/
        return answer;
    }
}

