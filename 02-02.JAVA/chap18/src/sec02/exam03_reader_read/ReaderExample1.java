package sec02.exam03_reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {
		// 문자데이터를 읽어오는 작업
		Reader reader = new FileReader("C:/dorothy/Data/temp/test2.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.println((char) readData);
		}
		
		reader.close();
	}
}
