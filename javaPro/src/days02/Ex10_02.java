package days02;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 2:27:30
 * @subject String -> Byte, Short, int, long 형변환하는 방법
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		String n = "10";
		
		
		
		int i = Integer.parseInt(n);    // 10
		long l = Long.parseLong(n);  // 10L
		Short s =Short.parseShort(n); //10
		byte b = Byte.parseByte(n);  //10
		
	}
}
