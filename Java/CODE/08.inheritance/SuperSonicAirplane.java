package Overriding;


import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor


public class SuperSonicAirplane extends Airplane {
	//static final 상수로 선언했지만, 열거 타입으로 선언하는 것이 더 좋다. 
	public static final int NORMAL = 1; 	// 정상 비행
	public static final int SUPERSONIC = 2; // 초음속 비행

	public int flyMode = NORMAL;

	@Override
	public void fly() throws RuntimeException { //상속받은 메소드 재정의
		log.debug("fly() invoked.");
		
		if (flyMode == SUPERSONIC) {
			log.info("초음속비행합니다.");
		} else {
			super.fly(); 	// 부모 객체의 fly() 메소드 호출
			
		} // if-else
	} // fly

} // end class