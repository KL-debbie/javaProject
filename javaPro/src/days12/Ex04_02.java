package days12;

/**
 * @author KL
 * @date 2023. 7. 28. - 오전 11:40:25
 * @subject
 * @content
 */
public class Ex04_02 {
	
	public static void main(String[] args) {
		int [][]m = new int[5][5];

		//fillM(m);
		//fill02M(m);
		//fill03M(m);
		dispM(m);
		//fill04M(m);
		//fill05M(m);
		
	
		
	} // main

	private static void fill05M(int[][] m) {
		//00 00
		//01 01
		//02 10
		//03 02
		//04 11
		
	}

	

	private static void fill04M(int[][] m) {
		
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				//if( i%2 ==0) m[i][j] = 5*i+j+1;
				//else  			m[i][4-j] = 5*i+j+1; 	
				
				m[i][ i%2 ==0?j:4-j ] =5*i+j+1;
				} // for
		} // for
		*/
		
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i%2==0) m[i][j]= 5*i+j+1;
				else m[i][j] = 5*(i+1)-j;
			} // for
		} // for
		*/
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				//if(i%2==0) m[i][j]= 5*i+j+1;
				//else m[i][j] = 5*(i+1)-j;
				m[i][j] = i%2==0?  5*i+j+1: 5*(i+1)-j;
			} // for
		} // for
		
	}


	private static void fill03M(int[][] m) {
		
		/*
		 * [05][10][15][20][25]
			[04][09][14][19][24]
			[03][08][13][18][23]
			[02][07][12][17][22]
			[01][06][11][16][21]
		 */

		for (int i = 0 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5-i + 5*j;
			} // for
		} // for
	}

	private static void fill02M(int[][] m) {
		// 00   44
		// 01   43
		// 02   42
		// 03   41
		// 04   40
		// 10   34
		// 
		
		/*
		for (int i = 0,n=25; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = n--;
			} // for
		} // for
		*/
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j] = 5*i+j+1;
			} // for
		} // for
	}

	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]= 5*i+j+1;
			} // for
		} // for
		
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
	}

}//class
