package polymorphism;

import lombok.extern.log4j.Log4j;

@Log4j
public class KumhoTire 
	extends Tire {

	// 필드

	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	} // constructor

	// 부모 객체가 상속해준 메소드 재정의(method overriding)
	@Override
	public boolean roll() {
		log.debug("roll() invoked.");

		++accumulatedRotation; // 누적회전수 1 증가

		if (accumulatedRotation < maxRotation) {
			log.info(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			log.info("*** " + location + "KumhoTire 펑크***"); // 어느 회사 타이어가 펑크 났는지만 수정

			return false;
		} // if-else

	} // roll

} // end class