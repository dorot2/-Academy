package sec07_exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = Week.SUNDAY;
		String name = today.name(); // 열거상수를 문자열로 반환
		System.out.println(name); // "SUNDAY"
		
		
		int ordinal = today.ordinal(); // 순번(서수)를 반환
		System.out.println(ordinal); // 6
		
		Week day1 = Week.MONDAY; // 0
		Week day2 = Week.WEDNESDAY; // 2
		// 상대적인 위치의 차이
		int result1 = day1.compareTo(day2); // 0-2 = -2
		int result2 = day2.compareTo(day1); // 2-0 =  2
		System.out.println(result1);
		System.out.println(result2);
		
		if(args.length == 1) {
			String strDay = args[0]; // 텍스트. String
			// Week 열거형 데이타타입으로 변환하는 구문.
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이다.");
			}else {
				System.out.println("평일이다.");
			}
			
		}
	}

}
