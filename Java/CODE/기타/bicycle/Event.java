package bicycle;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Event {
	// 압정밟기, 넘어지기, 핸들조작, 휴식, 브레이크 고장, 내리막길마주침(속도빨라져서 브레이크로 속도 줄이기)
	// 1~5(5), 6~15(10), 16~65(50), 51~70(20), 71~75(5), 76~100(15)

	ITire sTire = new SmallTire();
	ITire lTire = new LargeTire();
	Handle handle = new Handle(null);
	Brake brake = new Brake();
//	Bicycle bicycle = new Bicycle();
	Bicycle bicycle = new Bicycle("자전거회사1", "BICY1001-123", "RED", 10, 150000);

	public Event(int rand) {
		log.debug("Event() invoked.");
		log.debug(rand);
		if (rand >= 1 && rand < 6) { // 압정밟기
			sTire.pin();	
			//lTire.pin();
			log.debug("tire.pin() invoked");
		} else if (rand < 16) { // 넘어지기
			handle.breakDown();
			log.debug("handle.breakDown() invoked");
		} else if (rand < 66) { // 핸들조작
			handle.changeDir();
			log.debug("handle.changeDir() invoked");
		} else if (rand < 72) { // 브레이크고장
			brake.breakDown();
			log.debug("brake.breakDown() invoked");
		} else { // 내리막길
			brake.operating(true, bicycle.speed); //// *current speed 매개변수값???*////
			log.debug("brake.operating(op, current) invoked");
			log.info("bicycle.speed" + bicycle.speed);
		} // if-else
	} // event

} // end class
