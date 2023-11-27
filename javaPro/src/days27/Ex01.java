package days27;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

import com.util.FileUtil;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Child c = new Child();
		c.name = "홍길동";
		c.age = 20;
		
		String pathname = ".\\src\\days27\\Child.ser";

		try(	FileOutputStream out = new FileOutputStream(pathname);
				ObjectOutputStream oos = new ObjectOutputStream(out);	) {

			// NotSerializableException 직렬화 할수 없는 예외
			oos.writeObject(c);
			oos.flush();

			System.out.println("> c 객체를 직렬화 시켜서 oos 파일로 저장 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class

// 직렬화 클래스로 선언되어 있지않음..
// 2. 부모 클래스는 직렬화 클래스 X -> 자식 클래스는 직렬화 가능 클래스로 선언
class Parent{
	String name;  //부모의 멤버는 직렬화 대상에서 제외되었다..   null값
	
}

class Child extends Parent  implements Serializable{
	int age;
	
	// 개발자가 직접 부모의 멤버를 직렬화 대상에 추가 되도록 구현
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name);  //개발자가 직접 직렬화 대상에 부모 멤버를 추가하겠다는 코딩
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF(); // 이름 읽어오기
		in.defaultReadObject();// 나머지 읽어오기
	}
}

/*
// 1. 부모를 직렬화 할 수 있는 implements Serializable 클래스로 선언
//  --> 자식클래스는 자동으로 직렬화 가능한 클래스가 됨
class Parent implements Serializable{
	String name;
	
}

class Child extends Parent{
	int age;
}
*/