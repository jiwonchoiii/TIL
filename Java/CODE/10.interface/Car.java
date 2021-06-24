package interface_study;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
public class Car {
	// Lvalue 참조변수의 타입은 interface 이다.
	// Rvalue는 Lvalue의 interface를 implements한 타입의 객체이다.
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	
	void run() {
		log.info("run() invoked.");

		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	} // run

} // end class
