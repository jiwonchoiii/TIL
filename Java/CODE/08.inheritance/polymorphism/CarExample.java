package polymorphism;

import lombok.extern.log4j.Log4j;

@Log4j
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		//자동차의 타이어를 최대 5번 회전시킴(car.run()메소드에 의해서)
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); //달리면 타이어 부품필드의 객체의 roll()메소드 수행
			switch (problemLocation) {
			case 1:
				log.info("앞왼쪽 HanKookTire로 교체");
				car.frontLeftTire = new HanKookTire("앞왼쪽", 15); //다형성-1 발생 (즉, 타이어 교체)
				break;
			case 2:
				log.info("앞오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new HanKookTire("앞오른쪽", 13); //다형성-1 발생 (즉, 타이어 교체)
				break;
			case 3:
				log.info("뒤왼쪽 HanKookTire로 교체");
				car.frontLeftTire = new HanKookTire("뒤왼쪽", 14); //다형성-1 발생 (즉, 타이어 교체)
				break;
			case 4:
				log.info("뒤오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new HanKookTire("뒤오른쪽", 17); //다형성-1 발생 (즉, 타이어 교체)
				break;
			} // switch
			log.info("----------------------------------------------");
		} // for
	} // main

} // end class
