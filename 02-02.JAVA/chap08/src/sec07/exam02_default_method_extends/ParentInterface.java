package sec07.exam02_default_method_extends;

public interface ParentInterface {

	public void method1();
	public default void method2() {	}  // 블럭이 있으면 실행이 가능한 정상적인 메소드의 의미가 된다.
}
