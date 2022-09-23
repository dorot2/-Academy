package sec16.exam01_java_time;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimechangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재: " + now);
		
		LocalDateTime targetDateTime = null;
		
		
		try {
			//날짜필드 지정하여 변경
			targetDateTime = now
					.withYear(2024)
					.withMonth(12)
					.withDayOfMonth(31)
					.withHour(13)
					.withMinute(30)
					.withSecond(20);
			
			System.out.println("변경시간: " + targetDateTime);
		}catch(DateTimeException e) {
			System.out.println("날짜 변경값이 문제가 되었습니다.");
		}
		
		//년도 필드 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
			System.out.println("이번 해의 첫 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
			System.out.println("이번 해의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
			System.out.println("다음 해의 첫 일: " + targetDateTime);
		
		//월 필드변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
			System.out.println("이번 달의 첫 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
			System.out.println("이번 달의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달의 첫 일: " + targetDateTime);
		
		//요일 필드변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
			System.out.println("이번 달의 첫 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			System.out.println("돌아오는 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
			System.out.println("지난 월요일: " + targetDateTime);
	}

}
