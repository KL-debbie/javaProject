package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author KL
 * @date 2023. 7. 27. - 오전 10:04:29
 * @subject 복습 2번************
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) throws IOException {
		
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		//max값 찾는 함수, maxCount 반환 갯수 
		/*
		int max= m[0], maxCount = 1;
		
		for (int i = 1; i < m.length; i++) {
			if(max==m[i]) maxCount++;
			if(max < m[i]) {
				max = m[i];
				maxCount =1;
			}
		} // for
		*/
		
		int [] mcArr =getArrayMaxAndCount(m);
		
		System.out.printf("max :%d, maxCount :%d\n",mcArr[0], mcArr[1]);
		
		
	}//main

	private static int[] getArrayMaxAndCount(int[] m) {
		
		int max= m[0], maxCount = 1;
		
		for (int i = 1; i < m.length; i++) {
			if(max==m[i]) maxCount++;
			if(max < m[i]) {
				max = m[i];
				maxCount =1;
			}
		} // for
		
		// return new int[] {max,maxCount};
		int [] mc= new int[2];
		mc[0]= max;
		mc[1]=maxCount;
		return mc;
	}

	
}//class
