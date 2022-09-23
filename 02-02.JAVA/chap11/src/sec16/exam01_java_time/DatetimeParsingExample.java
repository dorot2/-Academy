package sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatetimeParsingExample {

	public static void main(String[] args) {
		// parsing : 변환
		
		DateTimeFormatter formatter; // 날짜문자열의 데이터가 지원하지않는 특수문자의 구분자로 되어있는 경우에 사용.
		LocalDate localDate;
		
		// 날짜 문자열을 LocalDate객체로 변환
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE; // 2024-05-21 표준
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);

	}

}
