package sec06.throwsdemo;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException  {
		
		/*
		try {
			Class clazz = Class.forName("java.lang.String100");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		// 문법적인 특징이 예외관련 작업을 하도록 문법적인 규칙을 가지고 있다.
		Class clazz = Class.forName("java.lang.String100");
		
	}

}
