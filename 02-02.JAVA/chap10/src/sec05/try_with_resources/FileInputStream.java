package sec05.try_with_resources;

// AutoCloseable인터페이스의 동작을 이해하기위하여, demo 클래스를 생성했다.
public class FileInputStream implements AutoCloseable {

	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
		
	}

}
