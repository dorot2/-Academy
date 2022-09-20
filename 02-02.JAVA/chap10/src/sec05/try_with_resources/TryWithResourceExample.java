package sec05.try_with_resources;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// AutoCloseable인터페이스를 구현한 클래스만 try() 에 사용하고, 자동으로 close()메소드를 호출하게하여
		// 자원을 반납하게 하는 기능을 제공하게 된다.
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			
			//예외발생시키는 구문
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
		


	}

}
