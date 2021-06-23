package abstract_class;

public class PhoneExample {
	
	public static void main(String[] args) {
		
		//추상 클래스는 new 연산자로 객체를 생성할 수 없다. 
		//Phone phone = new Phone(); (X)
		SmartPhone smartPhone = new SmartPhone("홍길동"); //실체 클래스로부터 실체 생성
		
		smartPhone.turnOn();						    //추상 클래스의 메소드 호출
		
		smartPhone.internetSearch();					//실체 클래스의 메소드 호출
		
		smartPhone.turnOff();							//추상 클래스의 메소드 호출
	} // main

} // end class 
