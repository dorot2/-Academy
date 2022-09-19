package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface {

	//추상메소드 재정의. 구현(자식)클래스에서 반드시 메소드를 구현하라.(강제성)
	@Override
	public void method2();
	
	public void method3();
}
