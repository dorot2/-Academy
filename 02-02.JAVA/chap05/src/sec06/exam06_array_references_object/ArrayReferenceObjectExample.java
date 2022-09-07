package sec06.exam06_array_references_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3]; // 메모리구조.
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		// 주소비교
		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]); // false
		
		// 데이타(값)비교. 
		System.out.println(strArray[0].contentEquals(strArray[2])); // true
		
	}

}
