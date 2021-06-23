package polymorphism;


//메소드의 매개변수에 다형성을 적용한 예
public class DriverExample {

	
	public static void main(String[] args) {
		Driver driver = new Driver();  // 운전자 객체 생성

		Bus bus = new Bus(); 		   // 운송차량으로 버스객체 생성
		Taxi taxi = new Taxi();		   // 운송차량으로 택시객체 생성

		driver.drive(bus);			   // 운전자가 버스를 운전(즉, 사용관계)
		driver.drive(taxi);			   // 운전자가 택시를 운전(즉, 사용관계)
	} // main

} // end class
