package sec02.exam03_reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("");
		int readCahrNo;
		char[] cbuf = new char[2]; // 임시저장소
		String data = "";
		while(true) {
			readCahrNo = reader.read(cbuf);
			if(readCahrNo == -1)break;
			data += new String(cbuf, 0, readCahrNo); // 문자 -> String 변환
		}
		System.out.println();
	}
}
