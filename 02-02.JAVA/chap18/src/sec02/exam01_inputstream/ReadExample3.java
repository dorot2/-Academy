package sec02.exam01_inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/dorothy/Data/temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8]; // readBytes[0] ~ readBytes[7]
		// is 파일 입력스트림이 readBytes 
		readByteNo = is.read(readBytes, 2, 3);
		for(int i = 0; i < readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}
}
