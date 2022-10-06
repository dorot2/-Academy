package sec05.exam08_objectinputstream_objectouputstream;

import java.io.Serializable;

// serialVersionUID 자동생성.
// 클래스가 변경될때마다 값이 변경해서 역직렬화 작업시 에러발생한다.
// 그래서, serialVersionUID 필드와 값을 수동으로 처리하면, 클래스 변경되더라도 역직렬화 작업에 에러를 막을 수 있다.
public class ClassC implements Serializable {
	int field1;
	int field2; // 추가
	
}
