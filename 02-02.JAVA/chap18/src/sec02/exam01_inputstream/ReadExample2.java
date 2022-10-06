package sec02.exam01_inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		// 파일의 내용을 읽어오기 : 파일입력스트림
		InputStream is = new FileInputStream("C:/dorothy/Data/temp/test.txt");
		int readByteNo; // 데이터를 읽은 바이트 수.
		byte[] readBytes = new byte[3]; // 임시기억장소 : 파일의 내용을 스트림을 통하여 읽고, 바이트배열에 저장.
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo); // 문자열변환
		}
		System.out.println(data);
		is.close();
		
	}
}
