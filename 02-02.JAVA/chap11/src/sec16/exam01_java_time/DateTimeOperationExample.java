package sec16.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시간: " + now);
		
		//현재시간에 더하기, 빼기
		LocalDateTime targetDateTime = now
				.plusYears(1) // 2023-09-23 14:16.263
				.minusMonths(2) // 2023-07-23 14:16.263
				.plusDays(3) // 2023-07-26 14:16.263
				.minusMinutes(5) // 2023-07-26 14:09.263
				.plusSeconds(6);
		
		System.out.println("연산후 : " + targetDateTime);
				
				

	}

}
