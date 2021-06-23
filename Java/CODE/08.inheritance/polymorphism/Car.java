package polymorphism;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
public class Car {

	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6); // 완성자동차회사의 기본타이어 장착(부품객체의 조립)
	Tire frontRightTire = new Tire("앞오른쪽", 2); // 완성자동차회사의 기본타이어 장착(부품객체의 조립)
	Tire backLeftTire = new Tire("뒤왼쪽", 3); // 완성자동차회사의 기본타이어 장착(부품객체의 조립)
	Tire backRightTire = new Tire("뒤오른쪽", 4); // 완성자동차회사의 기본타이어 장착(부품객체의 조립)

	// 메소드
	int run() {
		log.debug("run() invoked");

		log.info("\t + [자동차가 달립니다.]");

		// 만일 어느 위치의 타이어가 회전시 펑크가 나면(즉, false를 리턴), 펑크난 타이어의 위치를 1~4 정수값으로 반환
		
		if (frontLeftTire.roll() == false) { stop(); return 1;} // 펑크가 났으니 stop하고, 타이어의 위치를 반환
		if (frontRightTire.roll() == false) { stop(); return 2;} // 펑크가 났으니 stop하고, 타이어의 위치를 반환
		if (backLeftTire.roll() == false) { stop(); return 3;} // 펑크가 났으니 stop하고, 타이어의 위치를 반환
		if (backRightTire.roll() == false) { stop(); return 4;} // 펑크가 났으니 stop하고, 타이어의 위치를 반환

		return 0;
	} // run

	void stop() { //자동차를 멈추는 기능을 하는 메소드 
		log.debug("stop() invoked");

		log.info("\t+ [자동차가 멈춥니다.]");
	}// stop

} // end class
