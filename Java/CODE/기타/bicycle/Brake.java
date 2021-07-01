package bicycle;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
public class Brake {
	
	public int operating(boolean op, int currentSpeed) { //currentSpeed도 동적으로 받는지?? default가 있는지?
		if(op) {	// true면 속도 줄이기
			log.info("부드럽게 속도가 줄었다.");
			currentSpeed /= 2;
			log.info("현재속도 : " + currentSpeed);
		}else {		// false면 멈춤
			log.info("자전거가 멈췄다.");
			currentSpeed = 0;
			log.info("현재속도 : " + currentSpeed);
		}// if-else
		
		return currentSpeed;
	}//operating
	

	public void breakDown() {
		log.info("*** 앗,브레이크가 고장났다! ***");
		log.info("자전거 여행 종료 ㅠㅠ 수리하러 가야함 ㅠㅠ");
		System.exit(0);
	}
	
}// end class
