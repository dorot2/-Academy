package sec05.exam08_objectinputstream_objectouputstream;

import java.io.ObjectOutputStream;
import java.io.Serializable;

// Parent 부모클래스가 Serializable 인터페이스를 구현하지 않은 상태에서 직렬화 대상에서 제외된다.
// 그래서 Parent 부모클래스도 직렬화작업이 되도록 처리하는 방법.
public class Child extends Parent implements Serializable {
	public String field2;
	
	// 접근자는 private 이어야 한다.
	private void writeObject(ObjectOutputStream out) throws Exception {
		out.writeUTF(field1); // 부모클래스 필드는 직렬화대상으로 작업
		out.defaultWriteObject();
		
	}
	
	private void readObject(ObjectOutputStream in) throws Exception {
		field1= in.readUTF();
		
	}

}
