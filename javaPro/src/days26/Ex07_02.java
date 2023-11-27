package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ex07_02 {
	
	public static void main(String[] args) {

		String pathname = ".\\src\\days26\\UserInfo.ser";
		
		try(	FileInputStream in = new FileInputStream(pathname);
			ObjectInputStream ois = new ObjectInputStream(in);	) {
			
			// ois 스트림 -> UserInfo 객체 (역직렬화)
			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo > list = (ArrayList<UserInfo>) ois.readObject();
			
			System.out.println(u1);
			System.out.println(list);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main
	
}

