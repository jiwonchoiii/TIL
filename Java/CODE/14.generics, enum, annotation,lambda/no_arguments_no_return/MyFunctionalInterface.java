package no_arguments_no_return;


@FunctionalInterface
public interface MyFunctionalInterface {
	
	//추상메소드가 오직 1개인 인터페이스
	//컴파일러가 컴파일 시에, 이 인터페이스가 함수적인지 아닌지 강하게
	//체크하도록 어노테이션을 붙여주는 것이 권장된다.	
	public abstract void method();
	

} // end interface
