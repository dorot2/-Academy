package sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface {
	
	//디폴트 재정의
	@Override
	default void method2() {}
	
	public void method3();
}
