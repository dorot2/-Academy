package sec05.exam08_objectinputstream_objectouputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/dorothy/Data/temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC classC = new ClassC();
		classC.field1 = 1;
		oos.writeObject(classC);
		oos.flush(); oos.close(); fos.close();
		
	}
}
