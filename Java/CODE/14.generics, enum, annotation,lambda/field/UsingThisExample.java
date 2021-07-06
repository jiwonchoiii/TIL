package field;


public class UsingThisExample {
	public static void main(String[] args) {

		//바깥쪽 클래스의 인스턴스(생성)
		UsingThis usingThis = new UsingThis();

		//안쪽 클래스의 인스턴스(생성)
		//안쪽 클래스로부터 객체를 생성하려면, 바깥쪽 객체 없이는 안쪽 객체가 존재할 수 없기 때문에,
		//먼저 바깥쪽 객체를 먼저 생성하고, 그 객체의 주소를 들고있는 참조변수명.new연산자로 안쪽의 중첩된 클래스의 객체를 생성한다. 
		UsingThis.Inner inner = usingThis.new Inner(); 
		
		inner.method(); //안쪽 객체의 메소드 호출 
	} // main

} // end class
