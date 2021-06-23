package polymorphism;

import lombok.extern.log4j.Log4j;

@Log4j
public class HanKookTire 
	extends Tire {

	// 필드

	// 생성자
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	} // constructor

	// 메소드
	@Override
	public boolean roll() {
		log.info("roll() invoked.");

		++accumulatedRotation;

		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HanKookTire 수명: " + (maxRotation - accumulatedRotation) + "회");

			return true;
		} else { // 타이어의 수명이 다 되어서 펑크 발생
			System.out.println("*** " + location + "HanKookTire 펑크***");

			return false;
		} //if -else
	}// roll
} // end class