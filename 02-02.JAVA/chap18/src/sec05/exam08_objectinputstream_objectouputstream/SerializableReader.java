package sec05.exam08_objectinputstream_objectouputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerializableReader {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/dorothy/Data/temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA v = (ClassA) ois.readObject(); // 읽어온 데이터로 힙 영역에 메모리 생성
		System.out.println("field1 : " + v.field1);
		System.out.println("field2 : " + v.field2.field1);
		System.out.println("field3 : " + v.field3);
		System.out.println("field4 : " + v.field4);
		
	}

}
