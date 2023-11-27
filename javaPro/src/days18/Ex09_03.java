package days18;

public class Ex09_03 {
	
	public static void main(String[] args) {

		//testString();  		 // >String 처리 시간 : 3738312201ns    -> 객체 20만개
		// testStringBuffer();	// >StringBuffer 처리 시간 : 8649500ns  -> 객체 1개
		
	} // main

	
	// String
	private static void testString() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s += "a";
		} // for
		
		long end = System.nanoTime();
		
		System.out.printf(">String 처리 시간 : %dns\n", (end-start));
	}
	// 객체를 20만개 생성하여 시간이 오래걸림 -> 
	
	//StringBuffer
	private static void testStringBuffer() {
		long start = System.nanoTime();
		StringBuffer sb = new  StringBuffer("a");
		for (int i = 0; i < 200000; i++) {
			sb.append("a");
		} // for
		
		long end = System.nanoTime();
		
		System.out.printf(">StringBuffer 처리 시간 : %dns\n", (end-start));
	}
	
}//class
