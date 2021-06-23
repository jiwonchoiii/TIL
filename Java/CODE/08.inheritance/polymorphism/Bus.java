package polymorphism;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
public class Bus 
	extends Vehicle{
	
	@Override
	public void run() {
		log.debug("run() invoked.");
		
		log.info("버스가 달립니다.");
	} //run

} // end class
