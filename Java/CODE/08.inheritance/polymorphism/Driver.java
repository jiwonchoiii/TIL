package polymorphism;


import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Driver {
	
	//이 메소드의 매개변수의 타입이 바로 "부모타입" (즉, 다형성-1이 가능하도록 선언)
	public void drive(Vehicle vehicle) {
		log.debug("drive(vehicle) invoked.");
		
		vehicle.run(); //다형성-2 (메소드를 재정의한 자식객체의 메소드가 호출)
	} // drive

} // end class 
