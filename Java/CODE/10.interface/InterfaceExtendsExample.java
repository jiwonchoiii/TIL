package interface_study;

public class InterfaceExtendsExample {
	
	public static void main(String[] args) {
		//부모타입의 참조변수에는 자식타입의 객체가 대입된다
		
		CImpl cObj = new CImpl();
		
		IA ia =  cObj;			// ok
		IB ib =  cObj;			// ok
		IC ic =  cObj;			// ok
		

	} //main
} // end class
